package com.hr.two.entity;

import java.sql.Blob;
import java.util.Date;

public class UserResign {
    private int URN_ID;
    private String URN_USERNUM;//申请辞职员工编号
    private String resignContent;//辞职内容
    private Date resignCreateTime;//申请辞职的时间
    private int resignStatus;//审批状态
    private Date resignUpdateTime;//审批时间
    private String resignSay;//审批回复

    public UserResign(String URN_USERNUM, String resignContent) {
        this.URN_USERNUM = URN_USERNUM;
        this.resignContent = resignContent;
    }

    public int getURN_ID() {
        return URN_ID;
    }

    public void setURN_ID(int URN_ID) {
        this.URN_ID = URN_ID;
    }

    public String getURN_USERNUM() {
        return URN_USERNUM;
    }

    public void setURN_USERNUM(String URN_USERNUM) {
        this.URN_USERNUM = URN_USERNUM;
    }

    public String getResignContent() {
        return resignContent;
    }

    public void setResignContent(String resignContent) {
        this.resignContent = resignContent;
    }

    public Date getResignCreateTime() {
        return resignCreateTime;
    }

    public void setResignCreateTime(Date resignCreateTime) {
        this.resignCreateTime = resignCreateTime;
    }

    public int getResignStatus() {
        return resignStatus;
    }

    public void setResignStatus(int resignStatus) {
        this.resignStatus = resignStatus;
    }

    public Date getResignUpdateTime() {
        return resignUpdateTime;
    }

    public void setResignUpdateTime(Date resignUpdateTime) {
        this.resignUpdateTime = resignUpdateTime;
    }

    public String getResignSay() {
        return resignSay;
    }

    public void setResignSay(String resignSay) {
        this.resignSay = resignSay;
    }
}
