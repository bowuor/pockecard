package com.wladek.pktcard.pojo;

/**
 * Created by wladek on 11/7/16.
 */
public class CardDetailDto {
    private String cardNo;
    private String studentNo;
    private String result;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
