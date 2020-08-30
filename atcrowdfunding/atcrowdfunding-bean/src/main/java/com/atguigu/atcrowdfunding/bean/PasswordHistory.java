package com.atguigu.atcrowdfunding.bean;

public class PasswordHistory extends PasswordHistoryKey {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}