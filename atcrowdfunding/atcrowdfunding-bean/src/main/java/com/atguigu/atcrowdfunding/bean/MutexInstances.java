package com.atguigu.atcrowdfunding.bean;

public class MutexInstances {
    private Long objectInstanceBegin;

    private String name;

    private Long lockedByThreadId;

    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getLockedByThreadId() {
        return lockedByThreadId;
    }

    public void setLockedByThreadId(Long lockedByThreadId) {
        this.lockedByThreadId = lockedByThreadId;
    }
}