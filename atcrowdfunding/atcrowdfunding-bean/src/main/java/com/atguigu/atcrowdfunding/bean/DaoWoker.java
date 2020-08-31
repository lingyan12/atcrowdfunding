package com.atguigu.atcrowdfunding.bean;

public class DaoWoker {
    private Integer workerId;

    private String wokerName;

    private Integer wokerEmpId;

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getWokerName() {
        return wokerName;
    }

    public void setWokerName(String wokerName) {
        this.wokerName = wokerName == null ? null : wokerName.trim();
    }

    public Integer getWokerEmpId() {
        return wokerEmpId;
    }

    public void setWokerEmpId(Integer wokerEmpId) {
        this.wokerEmpId = wokerEmpId;
    }
}