package com.atguigu.atcrowdfunding.bean;

import java.util.Date;

public class PasswordHistoryKey {
    private String host;

    private String user;

    private Date passwordTimestamp;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public Date getPasswordTimestamp() {
        return passwordTimestamp;
    }

    public void setPasswordTimestamp(Date passwordTimestamp) {
        this.passwordTimestamp = passwordTimestamp;
    }
}