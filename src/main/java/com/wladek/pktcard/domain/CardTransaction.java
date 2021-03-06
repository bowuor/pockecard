package com.wladek.pktcard.domain;

import com.wladek.pktcard.domain.enumeration.TransactionType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

/**
 * Created by wladek on 1/1/10.
 *
 * Holds all transactions involving cards. i.e all top ups and buying
 */
@Entity
public class CardTransaction extends AbstractModel{
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    private String trxNumber;
    private String cardNumber;
    private BigDecimal amount;

    @ManyToOne
    private Card card;

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public String getTrxNumber() {
        return trxNumber;
    }

    public void setTrxNumber(String trxNumber) {
        this.trxNumber = trxNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
