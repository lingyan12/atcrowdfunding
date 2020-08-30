package com.atguigu.atcrowdfunding.bean;

public class MemoryGlobalTotal {
    private String totalAllocated;

    public String getTotalAllocated() {
        return totalAllocated;
    }

    public void setTotalAllocated(String totalAllocated) {
        this.totalAllocated = totalAllocated == null ? null : totalAllocated.trim();
    }
}