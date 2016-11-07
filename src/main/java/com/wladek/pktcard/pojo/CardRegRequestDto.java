package com.wladek.pktcard.pojo;

/**
 * Created by wladek on 11/7/16.
 */
public class CardRegRequestDto {
    private String studentNo;
    private String pinNo;

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getPinNo() {
        return pinNo;
    }

    public void setPinNo(String pinNo) {
        this.pinNo = pinNo;
    }
}
