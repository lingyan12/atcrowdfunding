package com.atguigu.atcrowdfunding.bean;

public class Component {
    private Integer componentId;

    private Integer componentGroupId;

    private String componentUrn;

    public Integer getComponentId() {
        return componentId;
    }

    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    public Integer getComponentGroupId() {
        return componentGroupId;
    }

    public void setComponentGroupId(Integer componentGroupId) {
        this.componentGroupId = componentGroupId;
    }

    public String getComponentUrn() {
        return componentUrn;
    }

    public void setComponentUrn(String componentUrn) {
        this.componentUrn = componentUrn == null ? null : componentUrn.trim();
    }
}