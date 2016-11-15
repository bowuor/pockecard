package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.Card;
import com.wladek.pktcard.domain.Item;
import com.wladek.pktcard.domain.School;
import com.wladek.pktcard.domain.User;
import com.wladek.pktcard.pojo.*;
import com.wladek.pktcard.repository.SchoolRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
@Service
@Transactional
public class SchoolServiceImpl implements SchoolService {
    Logger logger = LoggerFactory.getLogger(SchoolServiceImpl.class);
    @Autowired
    SchoolRepo schoolRepo;
    @Autowired
    UserService userService;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    ItemService itemService;
    @Autowired
    CardService cardService;

    @Override
    public School create(School school) {
        return schoolRepo.save(school);
    }

    @Override
    public School getOne(Long id) {
        return schoolRepo.findOne(id);
    }

    @Override
    public List<School> getAll() {
        return schoolRepo.findAll();
    }

    @Override
    public Page<School> getAll(int page, int size) {
        page = page - 1;
        PageRequest pageRequest = new PageRequest(page, size);
        return schoolRepo.findAll(pageRequest);
    }

    @Override
    public SchoolDetails getBySchoolCode(SchoolDetails schoolDetails) {

        School school = schoolRepo.findByCode(schoolDetails.getSchoolCode());

        if (school != null) {
            schoolDetails = new SchoolDetails();
            schoolDetails.setSchoolName(school.getName());
            schoolDetails.setSchoolCode(school.getCode());
        } else {
            schoolDetails = null;
        }

        return schoolDetails;
    }

    @Override
    public SchoolDetails authSchoolAdmin(LoginDetails loginDetails) {

        User user = userService.findByLoginIdOrEmail(loginDetails.getUserName());

        SchoolDetails schoolDetails = new SchoolDetails();

        if (user != null) {

            boolean matched = passwordEncoder.matches(loginDetails.getPassword(), user.getPassword());

            if (matched) {

                schoolDetails.setLoggedIn(true);
                schoolDetails.setLogInResponse("SUCCESS");

                if (user.getSchool() != null) {
                    School school = user.getSchool();
                    schoolDetails.setSchoolCode(school.getCode());
                    schoolDetails.setSchoolName(school.getName());
                } else {
                    schoolDetails.setLoggedIn(false);
                    schoolDetails.setLogInResponse("FAILED");
                }

            } else {
                schoolDetails.setLoggedIn(false);
                schoolDetails.setLogInResponse("FAILED");
            }

        } else {
            schoolDetails.setLoggedIn(false);
            schoolDetails.setLogInResponse("FAILED");
        }

        return schoolDetails;
    }

    @Override
    public List<ItemDto> getSchoolItems(String schoolCode) {
        School school = schoolRepo.findByCode(schoolCode);

        List<ItemDto> itemDtos = new ArrayList<>();

        for (Item i : itemService.findBySchool(school)) {
            itemDtos.add(i.toDto());
        }

        return itemDtos;
    }

    @Override
    public CheckOutResponse checkOut(CheckOutDetails checkOutDetails) {

        CheckOutResponse checkOutResponse = new CheckOutResponse();

        if (checkOutDetails != null) {

            boolean validCard = false;

            if (checkOutDetails.getCardNumber() != null) {

                validCard = cardService.validateCard(checkOutDetails.getCardNumber(), checkOutDetails.getPin());
            }

            if (validCard) {

                checkOutResponse = doCheckout(checkOutDetails);

                return checkOutResponse;
            }

            checkOutResponse.setCheckedOut(false);
            checkOutResponse.setMessage(" WRONG PIN !!! ");

            return checkOutResponse;
        }

        checkOutResponse.setCheckedOut(false);
        checkOutResponse.setMessage(" Oops.. Server error. Please try again ");

        return checkOutResponse;
    }

    private CheckOutResponse doCheckout(CheckOutDetails checkOutDetails) {

        CheckOutResponse checkOutResponse = new CheckOutResponse();

        BigDecimal cardBalance = checkStudentBalance(checkOutDetails.getCardNumber());
        BigDecimal totalCartValue = getTotalPurchase(checkOutDetails.getCartItems());

        if (totalCartValue.compareTo(cardBalance) == -1) {

            String checkoutString = "Sorry, you don't have enough money " +
                    "in your account to complete this transaction." +
                    "BALANCE : " + cardBalance + ";" +
                    "TRANSACTING AMOUNT : " + totalCartValue;

            checkOutResponse.setCheckedOut(false);
            checkOutResponse.setMessage(checkoutString);

            return checkOutResponse;

        }

        int result = 0;

        if (totalCartValue.compareTo(cardBalance) == 0 || totalCartValue.compareTo(cardBalance) == 1) {
            //Commit transaction
            result = cardService.recordBuyingTransaction(checkOutDetails.getCardNumber(),
                    checkOutDetails.getCartItems(), totalCartValue);

        }

        if (result == 1){
            checkOutResponse.setCheckedOut(true);
            checkOutResponse.setMessage("Thank you for using pockecard. cheers.");
        }else {
            checkOutResponse.setCheckedOut(false);
            checkOutResponse.setMessage("There was an error while processing your transaction. " +
                    "Please try again.");
        }

        return checkOutResponse;
    }

    public BigDecimal checkStudentBalance(String cardNo) {
        Card studentCard = cardService.findByCardNumber(cardNo);
        return studentCard.getBalance();
    }

    public BigDecimal getTotalPurchase(List<CartItemDto> cartItems) {

        BigDecimal totalVal = BigDecimal.ZERO;

        for (int i = 0; i < cartItems.size(); i++) {
            totalVal = totalVal.add(cartItems.get(i).getTotalCartValue());
        }

        return totalVal;
    }
}
