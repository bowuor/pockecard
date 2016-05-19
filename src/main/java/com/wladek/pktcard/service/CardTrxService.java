package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.CardTransaction;

import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
public interface CardTrxService {
    public CardTransaction makeTrx(CardTransaction trx);
    public CardTransaction getOne(Long id);
    public List<CardTransaction> listTrx();
}
