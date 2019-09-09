package com.zhc.demo.entity;

import java.util.Date;

public class UserLoginLogEntity {
    private Integer id;

    private Integer userId;

    private Date loginTime;

    private String loginIp;

    private Date loginEffectTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Date getLoginEffectTime() {
        return loginEffectTime;
    }

    public void setLoginEffectTime(Date loginEffectTime) {
        this.loginEffectTime = loginEffectTime;
    }
}