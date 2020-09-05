package com.atguigu.atcrowdfunding.bean;

public class DataLockWaits {
    private String engine;

    private String requestingEngineLockId;

    private Long requestingEngineTransactionId;

    private Long requestingThreadId;

    private Long requestingEventId;

    private Long requestingObjectInstanceBegin;

    private String blockingEngineLockId;

    private Long blockingEngineTransactionId;

    private Long blockingThreadId;

    private Long blockingEventId;

    private Long blockingObjectInstanceBegin;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine == null ? null : engine.trim();
    }

    public String getRequestingEngineLockId() {
        return requestingEngineLockId;
    }

    public void setRequestingEngineLockId(String requestingEngineLockId) {
        this.requestingEngineLockId = requestingEngineLockId == null ? null : requestingEngineLockId.trim();
    }

    public Long getRequestingEngineTransactionId() {
        return requestingEngineTransactionId;
    }

    public void setRequestingEngineTransactionId(Long requestingEngineTransactionId) {
        this.requestingEngineTransactionId = requestingEngineTransactionId;
    }

    public Long getRequestingThreadId() {
        return requestingThreadId;
    }

    public void setRequestingThreadId(Long requestingThreadId) {
        this.requestingThreadId = requestingThreadId;
    }

    public Long getRequestingEventId() {
        return requestingEventId;
    }

    public void setRequestingEventId(Long requestingEventId) {
        this.requestingEventId = requestingEventId;
    }

    public Long getRequestingObjectInstanceBegin() {
        return requestingObjectInstanceBegin;
    }

    public void setRequestingObjectInstanceBegin(Long requestingObjectInstanceBegin) {
        this.requestingObjectInstanceBegin = requestingObjectInstanceBegin;
    }

    public String getBlockingEngineLockId() {
        return blockingEngineLockId;
    }

    public void setBlockingEngineLockId(String blockingEngineLockId) {
        this.blockingEngineLockId = blockingEngineLockId == null ? null : blockingEngineLockId.trim();
    }

    public Long getBlockingEngineTransactionId() {
        return blockingEngineTransactionId;
    }

    public void setBlockingEngineTransactionId(Long blockingEngineTransactionId) {
        this.blockingEngineTransactionId = blockingEngineTransactionId;
    }

    public Long getBlockingThreadId() {
        return blockingThreadId;
    }

    public void setBlockingThreadId(Long blockingThreadId) {
        this.blockingThreadId = blockingThreadId;
    }

    public Long getBlockingEventId() {
        return blockingEventId;
    }

    public void setBlockingEventId(Long blockingEventId) {
        this.blockingEventId = blockingEventId;
    }

    public Long getBlockingObjectInstanceBegin() {
        return blockingObjectInstanceBegin;
    }

    public void setBlockingObjectInstanceBegin(Long blockingObjectInstanceBegin) {
        this.blockingObjectInstanceBegin = blockingObjectInstanceBegin;
    }
}