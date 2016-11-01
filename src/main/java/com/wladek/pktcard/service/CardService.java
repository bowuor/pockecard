package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.Card;
import com.wladek.pktcard.pojo.CartItemDto;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
public interface CardService {
    public Card create(Card card);
    public Card getOne(Long id);
    public List<Card> findAll();
    public Boolean validateCard(String cardNo , String pin);
    public Card findByCardNumber(String cardNo);
    public int recordBuyingTransaction(String cardNo , List<CartItemDto> cartItems , BigDecimal totalAmount);
}
