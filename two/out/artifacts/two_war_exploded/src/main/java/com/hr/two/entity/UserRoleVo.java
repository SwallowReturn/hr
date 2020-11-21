package com.hr.two.entity;

import java.util.Date;

public class UserRoleVo {
    private int UR_ID;
    private String UR_USERNUM;
    private int UR_ROLENUM;
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
    private int USER_CLOCK;

    public UserRoleVo() {
    }

    public UserRoleVo(int UR_ID, String UR_USERNUM, int UR_ROLENUM, int USER_ID, String USER_NUM, String USER_PWD, String USER_NAME, char USER_SEX, long USER_PHONE, String USER_IDCARD, int USER_STATUS, Date USER_CREATETIME, Date USER_UPDATETIME, int USER_CLOCK) {
        this.UR_ID = UR_ID;
        this.UR_USERNUM = UR_USERNUM;
        this.UR_ROLENUM = UR_ROLENUM;
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
        this.USER_CLOCK = USER_CLOCK;
    }

    public int getUSER_CLOCK() {
        return USER_CLOCK;
    }

    public void setUSER_CLOCK(int USER_CLOCK) {
        this.USER_CLOCK = USER_CLOCK;
    }

    public int getUR_ID() {
        return UR_ID;
    }

    public void setUR_ID(int UR_ID) {
        this.UR_ID = UR_ID;
    }

    public String getUR_USERNUM() {
        return UR_USERNUM;
    }

    public void setUR_USERNUM(String UR_USERNUM) {
        this.UR_USERNUM = UR_USERNUM;
    }

    public int getUR_ROLENUM() {
        return UR_ROLENUM;
    }

    public void setUR_ROLENUM(int UR_ROLENUM) {
        this.UR_ROLENUM = UR_ROLENUM;
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
