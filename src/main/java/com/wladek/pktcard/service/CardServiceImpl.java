package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.Card;
import com.wladek.pktcard.domain.CardTransaction;
import com.wladek.pktcard.domain.enumeration.TransactionType;
import com.wladek.pktcard.pojo.CartItemDto;
import com.wladek.pktcard.repository.CardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
@Service
public class CardServiceImpl implements CardService{
    @Autowired
    CardRepo cardRepo;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    CardTrxService cardTrxService;

    @Override
    public Card create(Card card) {
        return cardRepo.save(card);
    }

    @Override
    public Card getOne(Long id) {
        return cardRepo.getOne(id);
    }

    @Override
    public List<Card> findAll() {
        return cardRepo.findAll();
    }

    @Override
    public Boolean validateCard(String cardNo, String pin) {
        Card studentCard = findByCardNumber(cardNo);
        return passwordEncoder.matches(pin , studentCard.getPin());
    }

    @Override
    public Card findByCardNumber(String cardNo) {
        return cardRepo.findByCardNo(cardNo);
    }

    @Override
    public int recordBuyingTransaction(String cardNo, List<CartItemDto> cartItems , BigDecimal totalAmount) {

        Card studentCard = findByCardNumber(cardNo);

        int commit = 0;

        CardTransaction cardTransaction = new CardTransaction();
        cardTransaction.setCardNumber(cardNo);
        cardTransaction.setCard(studentCard);
        cardTransaction.setType(TransactionType.TRX_BUY);
        cardTransaction.setAmount(totalAmount);

        CardTransaction trx = cardTrxService.makeTrx(cardTransaction);

        if (trx != null){
            commit = 1;
        }

        return commit;
    }
}
