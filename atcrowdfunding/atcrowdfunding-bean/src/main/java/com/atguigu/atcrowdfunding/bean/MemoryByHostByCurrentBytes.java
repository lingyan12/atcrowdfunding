package com.atguigu.atcrowdfunding.bean;

import java.math.BigDecimal;

public class MemoryByHostByCurrentBytes {
    private String host;

    private BigDecimal currentCountUsed;

    private String currentAllocated;

    private String currentAvgAlloc;

    private String currentMaxAlloc;

    private String totalAllocated;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public BigDecimal getCurrentCountUsed() {
        return currentCountUsed;
    }

    public void setCurrentCountUsed(BigDecimal currentCountUsed) {
        this.currentCountUsed = currentCountUsed;
    }

    public String getCurrentAllocated() {
        return currentAllocated;
    }

    public void setCurrentAllocated(String currentAllocated) {
        this.currentAllocated = currentAllocated == null ? null : currentAllocated.trim();
    }

    public String getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    public void setCurrentAvgAlloc(String currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc == null ? null : currentAvgAlloc.trim();
    }

    public String getCurrentMaxAlloc() {
        return currentMaxAlloc;
    }

    public void setCurrentMaxAlloc(String currentMaxAlloc) {
        this.currentMaxAlloc = currentMaxAlloc == null ? null : currentMaxAlloc.trim();
    }

    public String getTotalAllocated() {
        return totalAllocated;
    }

    public void setTotalAllocated(String totalAllocated) {
        this.totalAllocated = totalAllocated == null ? null : totalAllocated.trim();
    }
}