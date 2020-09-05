package com.atguigu.atcrowdfunding.bean;

public class RoleEdges extends RoleEdgesKey {
    private String withAdminOption;

    public String getWithAdminOption() {
        return withAdminOption;
    }

    public void setWithAdminOption(String withAdminOption) {
        this.withAdminOption = withAdminOption == null ? null : withAdminOption.trim();
    }
}