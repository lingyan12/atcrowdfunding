package com.atguigu.atcrowdfunding.bean;

public class GlobalGrantsKey {
    private String user;

    private String host;

    private String priv;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getPriv() {
        return priv;
    }

    public void setPriv(String priv) {
        this.priv = priv == null ? null : priv.trim();
    }
}