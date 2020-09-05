package com.atguigu.atcrowdfunding.bean;

public class GlobalGrants extends GlobalGrantsKey {
    private String withGrantOption;

    public String getWithGrantOption() {
        return withGrantOption;
    }

    public void setWithGrantOption(String withGrantOption) {
        this.withGrantOption = withGrantOption == null ? null : withGrantOption.trim();
    }
}