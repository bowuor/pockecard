package com.wladek.pktcard.pojo;

import java.util.List;

/**
 * Created by wladek on 10/21/16.
 */
public class CheckOutDetails {
    private String pin;
    private String cardNumber;
    private List<CartItemDto> cartItems;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public List<CartItemDto> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItemDto> cartItems) {
        this.cartItems = cartItems;
    }
}
