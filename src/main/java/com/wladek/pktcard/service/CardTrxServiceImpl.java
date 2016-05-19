package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.CardTransaction;
import com.wladek.pktcard.repository.CardTrxRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
@Service
public class CardTrxServiceImpl implements CardTrxService{
    @Autowired
    CardTrxRepo cardTrxRepo;

    @Override
    public CardTransaction makeTrx(CardTransaction trx) {
        return cardTrxRepo.save(trx);
    }

    @Override
    public CardTransaction getOne(Long id) {
        return cardTrxRepo.getOne(id);
    }

    @Override
    public List<CardTransaction> listTrx() {
        return cardTrxRepo.findAll();
    }
}
