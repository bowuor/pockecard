package com.wladek.pktcard.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;

/**
 * Created by wladek on 1/1/10.
 */
@Entity
public class Student extends AbstractModel{
    public static final String STRING_PATTERN = "^[a-zA-Z0-9-]+([_.][a-zA-Z0-9-]+)*$";

    @NotEmpty(message = " Provide first name")
    @Pattern(regexp = STRING_PATTERN, message = "Illegal character included in name")
    private String firstName;
    @NotEmpty(message = " Provide last name")
    @Pattern(regexp = STRING_PATTERN, message = "Illegal character included in name")
    private String lastName;
    @NotEmpty(message = " Provide sir name")
    @Pattern(regexp = STRING_PATTERN, message = "Illegal character included in name")
    private String sirName;
    @NotEmpty(message = " Provide registration number")
    private String regNumber;

    @OneToOne(mappedBy = "student" , fetch = FetchType.LAZY)
    private Card card;

    @ManyToOne
    private School school;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
