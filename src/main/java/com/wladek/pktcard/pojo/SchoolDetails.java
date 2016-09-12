package com.wladek.pktcard.pojo;

/**
 * Created by wladek on 8/3/16.
 */
public class SchoolDetails {
    private String schoolName;
    private String schoolCode;
    private Boolean loggedIn;
    private String logInResponse;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Boolean getLoggedIn() {
        return loggedIn;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public void setLoggedIn(Boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getLogInResponse() {
        return logInResponse;
    }

    public void setLogInResponse(String logInResponse) {
        this.logInResponse = logInResponse;
    }
}
