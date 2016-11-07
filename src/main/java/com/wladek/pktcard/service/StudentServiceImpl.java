package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.Card;
import com.wladek.pktcard.domain.School;
import com.wladek.pktcard.domain.Student;
import com.wladek.pktcard.pojo.CardDetailDto;
import com.wladek.pktcard.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * Created by wladek on 5/17/16.
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    CardService cardService;
    @Override
    public Student create(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getOne(Long id) {
        return studentRepo.getOne(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Page<Student> findBySchool(int page , int size , School school) {

        page = page - 1;

        PageRequest pageRequest = new PageRequest(page , size);

        return studentRepo.findBySchool(pageRequest , school);
    }

    @Override
    public CardDetailDto registerCard(String studentNo, String pinNo) {

        Student studentInDb = studentRepo.findByRegNumber(studentNo);

        CardDetailDto dto = new CardDetailDto();

        if (studentInDb == null){
            dto.setStudentNo(studentNo);
            dto.setResult("No student registered with that registration number.");

            return  dto;
        }

        String cardNo = generateCardNumber(12);

        Card newCard = cardService.findByCardNumber(cardNo);

        while (newCard != null){
            cardNo = generateCardNumber(12);
            newCard = cardService.findByCardNumber(cardNo);
        }

        if (newCard == null){
            newCard = new Card();
        }

        newCard.setCardNo(cardNo);
        newCard.setStudent(studentInDb);

        newCard = cardService.create(newCard);

        dto.setCardNo(newCard.getCardNo());
        dto.setStudentNo(studentNo);

        return dto;
    }

    private String generateCardNumber(int length){

        Random random = new Random();
        char[] digits = new char[length];

        digits[0] = (char) (random.nextInt(9) + '1');

        for (int i = 1; i < length; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }

        return new String(digits);
    }
}
