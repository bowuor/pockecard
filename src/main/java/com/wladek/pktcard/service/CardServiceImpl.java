package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.Card;
import com.wladek.pktcard.repository.CardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

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
        Card studentCard = cardRepo.findByCardNo(cardNo);
        return passwordEncoder.matches(pin , studentCard.getPin());
    }
}
