package com.wladek.pktcard.pojo;

/**
 * Created by wladek on 8/3/16.
 */
public class LogInApp {
    private String schoolName;
    private Boolean loggedIn;
    private String password;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Boolean getLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(Boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
