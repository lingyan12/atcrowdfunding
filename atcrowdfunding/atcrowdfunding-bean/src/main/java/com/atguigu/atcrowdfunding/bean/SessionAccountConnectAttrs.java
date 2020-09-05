package com.atguigu.atcrowdfunding.bean;

public class SessionAccountConnectAttrs extends SessionAccountConnectAttrsKey {
    private String attrValue;

    private Integer ordinalPosition;

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue == null ? null : attrValue.trim();
    }

    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }
}