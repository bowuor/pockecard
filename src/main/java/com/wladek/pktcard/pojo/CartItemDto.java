package com.wladek.pktcard.pojo;


import java.math.BigDecimal;

/**
 * Created by wladek on 1/1/10.
 */
public class CartItemDto {
    private Long id;
    private String name;
    private String code;
    private int cartQuantity;
    private Double unitPrice;
    private Double totalCartValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCartQuantity() {
        return cartQuantity;
    }

    public void setCartQuantity(int cartQuantity) {
        this.cartQuantity = cartQuantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalCartValue() {
        return totalCartValue;
    }

    public void setTotalCartValue(Double totalCartValue) {
        this.totalCartValue = totalCartValue;
    }
}
