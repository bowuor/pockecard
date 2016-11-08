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
    private BigDecimal unitPrice;
    private BigDecimal totalCartValue;

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

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalCartValue() {
        return totalCartValue;
    }

    public void setTotalCartValue(BigDecimal totalCartValue) {
        this.totalCartValue = totalCartValue;
    }
}
