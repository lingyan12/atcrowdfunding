package com.atguigu.atcrowdfunding.bean;

import java.math.BigDecimal;

public class UserSummary {
    private String user;

    private BigDecimal statements;

    private String statementLatency;

    private String statementAvgLatency;

    private BigDecimal tableScans;

    private BigDecimal fileIos;

    private String fileIoLatency;

    private BigDecimal currentConnections;

    private BigDecimal totalConnections;

    private Long uniqueHosts;

    private String currentMemory;

    private String totalMemoryAllocated;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public BigDecimal getStatements() {
        return statements;
    }

    public void setStatements(BigDecimal statements) {
        this.statements = statements;
    }

    public String getStatementLatency() {
        return statementLatency;
    }

    public void setStatementLatency(String statementLatency) {
        this.statementLatency = statementLatency == null ? null : statementLatency.trim();
    }

    public String getStatementAvgLatency() {
        return statementAvgLatency;
    }

    public void setStatementAvgLatency(String statementAvgLatency) {
        this.statementAvgLatency = statementAvgLatency == null ? null : statementAvgLatency.trim();
    }

    public BigDecimal getTableScans() {
        return tableScans;
    }

    public void setTableScans(BigDecimal tableScans) {
        this.tableScans = tableScans;
    }

    public BigDecimal getFileIos() {
        return fileIos;
    }

    public void setFileIos(BigDecimal fileIos) {
        this.fileIos = fileIos;
    }

    public String getFileIoLatency() {
        return fileIoLatency;
    }

    public void setFileIoLatency(String fileIoLatency) {
        this.fileIoLatency = fileIoLatency == null ? null : fileIoLatency.trim();
    }

    public BigDecimal getCurrentConnections() {
        return currentConnections;
    }

    public void setCurrentConnections(BigDecimal currentConnections) {
        this.currentConnections = currentConnections;
    }

    public BigDecimal getTotalConnections() {
        return totalConnections;
    }

    public void setTotalConnections(BigDecimal totalConnections) {
        this.totalConnections = totalConnections;
    }

    public Long getUniqueHosts() {
        return uniqueHosts;
    }

    public void setUniqueHosts(Long uniqueHosts) {
        this.uniqueHosts = uniqueHosts;
    }

    public String getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(String currentMemory) {
        this.currentMemory = currentMemory == null ? null : currentMemory.trim();
    }

    public String getTotalMemoryAllocated() {
        return totalMemoryAllocated;
    }

    public void setTotalMemoryAllocated(String totalMemoryAllocated) {
        this.totalMemoryAllocated = totalMemoryAllocated == null ? null : totalMemoryAllocated.trim();
    }
}