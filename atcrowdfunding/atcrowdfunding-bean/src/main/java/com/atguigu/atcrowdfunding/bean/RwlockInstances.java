package com.atguigu.atcrowdfunding.bean;

public class RwlockInstances {
    private Long objectInstanceBegin;

    private String name;

    private Long writeLockedByThreadId;

    private Integer readLockedByCount;

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

    public Long getWriteLockedByThreadId() {
        return writeLockedByThreadId;
    }

    public void setWriteLockedByThreadId(Long writeLockedByThreadId) {
        this.writeLockedByThreadId = writeLockedByThreadId;
    }

    public Integer getReadLockedByCount() {
        return readLockedByCount;
    }

    public void setReadLockedByCount(Integer readLockedByCount) {
        this.readLockedByCount = readLockedByCount;
    }
}