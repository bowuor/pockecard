package com.wladek.pktcard.pojo;

import java.math.BigDecimal;

/**
 * Created by wladek on 9/17/16.
 * Item bought
 */
public class BoughtItemDto {
    private int number;
    private String itemCode;
    private BigDecimal unitPrice;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
}
