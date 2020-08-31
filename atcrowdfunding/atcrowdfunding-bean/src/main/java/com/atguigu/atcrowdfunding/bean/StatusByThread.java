package com.atguigu.atcrowdfunding.bean;

public class StatusByThread extends StatusByThreadKey {
    private String variableValue;

    public String getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue == null ? null : variableValue.trim();
    }
}