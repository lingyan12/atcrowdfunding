package com.atguigu.atcrowdfunding.bean;

public class DataLocksKey {
    private String engineLockId;

    private String engine;

    public String getEngineLockId() {
        return engineLockId;
    }

    public void setEngineLockId(String engineLockId) {
        this.engineLockId = engineLockId == null ? null : engineLockId.trim();
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine == null ? null : engine.trim();
    }
}