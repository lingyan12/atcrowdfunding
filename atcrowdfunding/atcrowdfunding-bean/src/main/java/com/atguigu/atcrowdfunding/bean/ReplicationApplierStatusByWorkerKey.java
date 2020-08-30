package com.atguigu.atcrowdfunding.bean;

public class ReplicationApplierStatusByWorkerKey {
    private String channelName;

    private Long workerId;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }
}