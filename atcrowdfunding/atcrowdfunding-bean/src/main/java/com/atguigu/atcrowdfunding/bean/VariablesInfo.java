package com.atguigu.atcrowdfunding.bean;

import java.util.Date;

public class VariablesInfo {
    private String variableName;

    private String variableSource;

    private String variablePath;

    private String minValue;

    private String maxValue;

    private Date setTime;

    private String setUser;

    private String setHost;

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName == null ? null : variableName.trim();
    }

    public String getVariableSource() {
        return variableSource;
    }

    public void setVariableSource(String variableSource) {
        this.variableSource = variableSource == null ? null : variableSource.trim();
    }

    public String getVariablePath() {
        return variablePath;
    }

    public void setVariablePath(String variablePath) {
        this.variablePath = variablePath == null ? null : variablePath.trim();
    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue == null ? null : minValue.trim();
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue == null ? null : maxValue.trim();
    }

    public Date getSetTime() {
        return setTime;
    }

    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    public String getSetUser() {
        return setUser;
    }

    public void setSetUser(String setUser) {
        this.setUser = setUser == null ? null : setUser.trim();
    }

    public String getSetHost() {
        return setHost;
    }

    public void setSetHost(String setHost) {
        this.setHost = setHost == null ? null : setHost.trim();
    }
}