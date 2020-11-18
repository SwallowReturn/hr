package cn.hrgb.hr.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserTable {
    private Integer USER_ID;
    private String USER_NUM;
    private String USER_PWD;
    private String USER_NAME;
    private char USER_SEX;
    private Integer USER_PHONE;
    private String USER_IDCARD;
    private Integer USER_STATUS;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
    private Date USER_CREATETIME;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
    private Date USER_UPDATETIME;

    public Integer getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Integer USER_ID) {
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

    public Integer getUSER_PHONE() {
        return USER_PHONE;
    }

    public void setUSER_PHONE(Integer USER_PHONE) {
        this.USER_PHONE = USER_PHONE;
    }

    public String getUSER_IDCARD() {
        return USER_IDCARD;
    }

    public void setUSER_IDCARD(String USER_IDCARD) {
        this.USER_IDCARD = USER_IDCARD;
    }

    public Integer getUSER_STATUS() {
        return USER_STATUS;
    }

    public void setUSER_STATUS(Integer USER_STATUS) {
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

    public UserTable() {
    }

    public UserTable(Integer USER_ID, String USER_NUM, String USER_PWD, String USER_NAME, char USER_SEX, Integer USER_PHONE, String USER_IDCARD, Integer USER_STATUS, Date USER_CREATETIME, Date USER_UPDATETIME) {
        this.USER_ID = USER_ID;
        this.USER_NUM = USER_NUM;
        this.USER_PWD = USER_PWD;
        this.USER_NAME = USER_NAME;
        this.USER_SEX = USER_SEX;
        this.USER_PHONE = USER_PHONE;
        this.USER_IDCARD = USER_IDCARD;
        this.USER_STATUS = USER_STATUS;
        this.USER_CREATETIME = USER_CREATETIME;
        this.USER_UPDATETIME = USER_UPDATETIME;
    }

    @Override
    public String toString() {
        return "UserTable{" +
                "USER_ID=" + USER_ID +
                ", USER_NUM='" + USER_NUM + '\'' +
                ", USER_PWD='" + USER_PWD + '\'' +
                ", USER_NAME='" + USER_NAME + '\'' +
                ", USER_SEX=" + USER_SEX +
                ", USER_PHONE=" + USER_PHONE +
                ", USER_IDCARD='" + USER_IDCARD + '\'' +
                ", USER_STATUS=" + USER_STATUS +
                ", USER_CREATETIME=" + USER_CREATETIME +
                ", USER_UPDATETIME=" + USER_UPDATETIME +
                '}';
    }
}
