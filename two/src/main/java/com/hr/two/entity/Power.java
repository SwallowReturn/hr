package com.hr.two.entity;

public class Power {
    private String POW_NAME;
    private String POW_URL;

    public Power() {
    }

    public Power(String POW_NAME, String POW_URL) {
        this.POW_NAME = POW_NAME;
        this.POW_URL = POW_URL;
    }

    public String getPOW_URL() {
        return POW_URL;
    }

    public void setPOW_URL(String POW_URL) {
        this.POW_URL = POW_URL;
    }

    public String getPOW_NAME() {
        return POW_NAME;
    }

    public void setPOW_NAME(String POW_NAME) {
        this.POW_NAME = POW_NAME;
    }
}
