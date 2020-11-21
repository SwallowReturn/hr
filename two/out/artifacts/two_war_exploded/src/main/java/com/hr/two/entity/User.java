package com.hr.two.entity;

import java.util.Date;

public class User {
    private int USER_ID;
    private String USER_NUM;
    private String USER_PWD;
    private String USER_NAME;
    private char USER_SEX;
    private long USER_PHONE;
    private String USER_IDCARD;
    private int USER_STATUS;
    private Date USER_CREATETIME;
    private Date USER_UPDATETIME;


    public User() {
    }

    public User(int USER_ID, String USER_NUM, String USER_PWD, String USER_NAME, char USER_SEX, long USER_PHONE, String USER_IDCARD) {
        this.USER_ID = USER_ID;
        this.USER_NUM = USER_NUM;
        this.USER_PWD = USER_PWD;
        this.USER_NAME = USER_NAME;
        this.USER_SEX = USER_SEX;
        this.USER_PHONE = USER_PHONE;
        this.USER_IDCARD = USER_IDCARD;
    }

    public int getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_NUM() {
        return USER_NUM;
    }

    public void setUSER_NUM(String USER_NUM) {
        this.USER_NUM = USER_NUM;
    }

    public String getUSER_PWD() {
        return USER_PWD;
    }

    public void setUSER_PWD(String USER_PWD) {
        this.USER_PWD = USER_PWD;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public char getUSER_SEX() {
        return USER_SEX;
    }

    public void setUSER_SEX(char USER_SEX) {
        this.USER_SEX = USER_SEX;
    }

    public long getUSER_PHONE() {
        return USER_PHONE;
    }

    public void setUSER_PHONE(long USER_PHONE) {
        this.USER_PHONE = USER_PHONE;
    }

    public String getUSER_IDCARD() {
        return USER_IDCARD;
    }

    public void setUSER_IDCARD(String USER_IDCARD) {
        this.USER_IDCARD = USER_IDCARD;
    }

    public int getUSER_STATUS() {
        return USER_STATUS;
    }

    public void setUSER_STATUS(int USER_STATUS) {
        this.USER_STATUS = USER_STATUS;
    }

    public Date getUSER_CREATETIME() {
        return USER_CREATETIME;
    }

    public void setUSER_CREATETIME(Date USER_CREATETIME) {
        this.USER_CREATETIME = USER_CREATETIME;
    }

    public Date getUSER_UPDATETIME() {
        return USER_UPDATETIME;
    }

    public void setUSER_UPDATETIME(Date USER_UPDATETIME) {
        this.USER_UPDATETIME = USER_UPDATETIME;
    }
}
