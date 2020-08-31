package com.atguigu.atcrowdfunding.bean;

public class UserVariablesByThread extends UserVariablesByThreadKey {
    private byte[] variableValue;

    public byte[] getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(byte[] variableValue) {
        this.variableValue = variableValue;
    }
}