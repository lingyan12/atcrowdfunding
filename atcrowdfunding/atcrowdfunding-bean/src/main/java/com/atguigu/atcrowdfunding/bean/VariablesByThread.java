package com.atguigu.atcrowdfunding.bean;

public class VariablesByThread extends VariablesByThreadKey {
    private String variableValue;

    public String getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue == null ? null : variableValue.trim();
    }
}