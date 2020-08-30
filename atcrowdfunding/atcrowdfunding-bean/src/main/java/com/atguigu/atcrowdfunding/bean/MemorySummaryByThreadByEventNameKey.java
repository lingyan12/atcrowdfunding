package com.atguigu.atcrowdfunding.bean;

public class MemorySummaryByThreadByEventNameKey {
    private Long threadId;

    private String eventName;

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }
}