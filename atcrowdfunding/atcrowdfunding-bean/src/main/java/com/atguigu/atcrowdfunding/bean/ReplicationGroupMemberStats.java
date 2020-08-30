package com.atguigu.atcrowdfunding.bean;

public class ReplicationGroupMemberStats {
    private String channelName;

    private String viewId;

    private String memberId;

    private Long countTransactionsInQueue;

    private Long countTransactionsChecked;

    private Long countConflictsDetected;

    private Long countTransactionsRowsValidating;

    private Long countTransactionsRemoteInApplierQueue;

    private Long countTransactionsRemoteApplied;

    private Long countTransactionsLocalProposed;

    private Long countTransactionsLocalRollback;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getViewId() {
        return viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId == null ? null : viewId.trim();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public Long getCountTransactionsInQueue() {
        return countTransactionsInQueue;
    }

    public void setCountTransactionsInQueue(Long countTransactionsInQueue) {
        this.countTransactionsInQueue = countTransactionsInQueue;
    }

    public Long getCountTransactionsChecked() {
        return countTransactionsChecked;
    }

    public void setCountTransactionsChecked(Long countTransactionsChecked) {
        this.countTransactionsChecked = countTransactionsChecked;
    }

    public Long getCountConflictsDetected() {
        return countConflictsDetected;
    }

    public void setCountConflictsDetected(Long countConflictsDetected) {
        this.countConflictsDetected = countConflictsDetected;
    }

    public Long getCountTransactionsRowsValidating() {
        return countTransactionsRowsValidating;
    }

    public void setCountTransactionsRowsValidating(Long countTransactionsRowsValidating) {
        this.countTransactionsRowsValidating = countTransactionsRowsValidating;
    }

    public Long getCountTransactionsRemoteInApplierQueue() {
        return countTransactionsRemoteInApplierQueue;
    }

    public void setCountTransactionsRemoteInApplierQueue(Long countTransactionsRemoteInApplierQueue) {
        this.countTransactionsRemoteInApplierQueue = countTransactionsRemoteInApplierQueue;
    }

    public Long getCountTransactionsRemoteApplied() {
        return countTransactionsRemoteApplied;
    }

    public void setCountTransactionsRemoteApplied(Long countTransactionsRemoteApplied) {
        this.countTransactionsRemoteApplied = countTransactionsRemoteApplied;
    }

    public Long getCountTransactionsLocalProposed() {
        return countTransactionsLocalProposed;
    }

    public void setCountTransactionsLocalProposed(Long countTransactionsLocalProposed) {
        this.countTransactionsLocalProposed = countTransactionsLocalProposed;
    }

    public Long getCountTransactionsLocalRollback() {
        return countTransactionsLocalRollback;
    }

    public void setCountTransactionsLocalRollback(Long countTransactionsLocalRollback) {
        this.countTransactionsLocalRollback = countTransactionsLocalRollback;
    }
}