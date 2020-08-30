package com.atguigu.atcrowdfunding.bean;

public class InnodbLockWaitsWithBLOBs extends InnodbLockWaits {
    private String lockedTable;

    private String waitingQuery;

    private String blockingQuery;

    public String getLockedTable() {
        return lockedTable;
    }

    public void setLockedTable(String lockedTable) {
        this.lockedTable = lockedTable == null ? null : lockedTable.trim();
    }

    public String getWaitingQuery() {
        return waitingQuery;
    }

    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery == null ? null : waitingQuery.trim();
    }

    public String getBlockingQuery() {
        return blockingQuery;
    }

    public void setBlockingQuery(String blockingQuery) {
        this.blockingQuery = blockingQuery == null ? null : blockingQuery.trim();
    }
}