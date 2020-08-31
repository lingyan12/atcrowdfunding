package com.atguigu.atcrowdfunding.bean;

import java.util.Date;

public class ReplicationApplierStatusByCoordinator {
    private String channelName;

    private Long threadId;

    private String serviceState;

    private Integer lastErrorNumber;

    private String lastErrorMessage;

    private Date lastErrorTimestamp;

    private String lastProcessedTransaction;

    private Date lastProcessedTransactionOriginalCommitTimestamp;

    private Date lastProcessedTransactionImmediateCommitTimestamp;

    private Date lastProcessedTransactionStartBufferTimestamp;

    private Date lastProcessedTransactionEndBufferTimestamp;

    private String processingTransaction;

    private Date processingTransactionOriginalCommitTimestamp;

    private Date processingTransactionImmediateCommitTimestamp;

    private Date processingTransactionStartBufferTimestamp;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public String getServiceState() {
        return serviceState;
    }

    public void setServiceState(String serviceState) {
        this.serviceState = serviceState == null ? null : serviceState.trim();
    }

    public Integer getLastErrorNumber() {
        return lastErrorNumber;
    }

    public void setLastErrorNumber(Integer lastErrorNumber) {
        this.lastErrorNumber = lastErrorNumber;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage == null ? null : lastErrorMessage.trim();
    }

    public Date getLastErrorTimestamp() {
        return lastErrorTimestamp;
    }

    public void setLastErrorTimestamp(Date lastErrorTimestamp) {
        this.lastErrorTimestamp = lastErrorTimestamp;
    }

    public String getLastProcessedTransaction() {
        return lastProcessedTransaction;
    }

    public void setLastProcessedTransaction(String lastProcessedTransaction) {
        this.lastProcessedTransaction = lastProcessedTransaction == null ? null : lastProcessedTransaction.trim();
    }

    public Date getLastProcessedTransactionOriginalCommitTimestamp() {
        return lastProcessedTransactionOriginalCommitTimestamp;
    }

    public void setLastProcessedTransactionOriginalCommitTimestamp(Date lastProcessedTransactionOriginalCommitTimestamp) {
        this.lastProcessedTransactionOriginalCommitTimestamp = lastProcessedTransactionOriginalCommitTimestamp;
    }

    public Date getLastProcessedTransactionImmediateCommitTimestamp() {
        return lastProcessedTransactionImmediateCommitTimestamp;
    }

    public void setLastProcessedTransactionImmediateCommitTimestamp(Date lastProcessedTransactionImmediateCommitTimestamp) {
        this.lastProcessedTransactionImmediateCommitTimestamp = lastProcessedTransactionImmediateCommitTimestamp;
    }

    public Date getLastProcessedTransactionStartBufferTimestamp() {
        return lastProcessedTransactionStartBufferTimestamp;
    }

    public void setLastProcessedTransactionStartBufferTimestamp(Date lastProcessedTransactionStartBufferTimestamp) {
        this.lastProcessedTransactionStartBufferTimestamp = lastProcessedTransactionStartBufferTimestamp;
    }

    public Date getLastProcessedTransactionEndBufferTimestamp() {
        return lastProcessedTransactionEndBufferTimestamp;
    }

    public void setLastProcessedTransactionEndBufferTimestamp(Date lastProcessedTransactionEndBufferTimestamp) {
        this.lastProcessedTransactionEndBufferTimestamp = lastProcessedTransactionEndBufferTimestamp;
    }

    public String getProcessingTransaction() {
        return processingTransaction;
    }

    public void setProcessingTransaction(String processingTransaction) {
        this.processingTransaction = processingTransaction == null ? null : processingTransaction.trim();
    }

    public Date getProcessingTransactionOriginalCommitTimestamp() {
        return processingTransactionOriginalCommitTimestamp;
    }

    public void setProcessingTransactionOriginalCommitTimestamp(Date processingTransactionOriginalCommitTimestamp) {
        this.processingTransactionOriginalCommitTimestamp = processingTransactionOriginalCommitTimestamp;
    }

    public Date getProcessingTransactionImmediateCommitTimestamp() {
        return processingTransactionImmediateCommitTimestamp;
    }

    public void setProcessingTransactionImmediateCommitTimestamp(Date processingTransactionImmediateCommitTimestamp) {
        this.processingTransactionImmediateCommitTimestamp = processingTransactionImmediateCommitTimestamp;
    }

    public Date getProcessingTransactionStartBufferTimestamp() {
        return processingTransactionStartBufferTimestamp;
    }

    public void setProcessingTransactionStartBufferTimestamp(Date processingTransactionStartBufferTimestamp) {
        this.processingTransactionStartBufferTimestamp = processingTransactionStartBufferTimestamp;
    }
}