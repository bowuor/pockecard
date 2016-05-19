package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.Card;

import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
public interface CardService {
    public Card create(Card card);
    public Card getOne(Long id);
    public List<Card> findAll();
}
