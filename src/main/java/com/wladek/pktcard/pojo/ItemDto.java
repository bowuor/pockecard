package com.wladek.pktcard.pojo;


import java.math.BigDecimal;

/**
 * Created by wladek on 1/1/10.
 */
public class ItemDto {
    private String name;
    private BigDecimal unitPrice;
    private String description;
    private String itemCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
}
