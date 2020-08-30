package com.atguigu.atcrowdfunding.bean;

public class UserSummaryByFileIoType {
    private String user;

    private String eventName;

    private Long total;

    private String latency;

    private String maxLatency;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency == null ? null : latency.trim();
    }

    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency == null ? null : maxLatency.trim();
    }
}