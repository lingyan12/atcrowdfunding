package com.atguigu.atcrowdfunding.bean;

public class DefaultRolesKey {
    private String host;

    private String user;

    private String defaultRoleHost;

    private String defaultRoleUser;

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

    public String getDefaultRoleHost() {
        return defaultRoleHost;
    }

    public void setDefaultRoleHost(String defaultRoleHost) {
        this.defaultRoleHost = defaultRoleHost == null ? null : defaultRoleHost.trim();
    }

    public String getDefaultRoleUser() {
        return defaultRoleUser;
    }

    public void setDefaultRoleUser(String defaultRoleUser) {
        this.defaultRoleUser = defaultRoleUser == null ? null : defaultRoleUser.trim();
    }
}