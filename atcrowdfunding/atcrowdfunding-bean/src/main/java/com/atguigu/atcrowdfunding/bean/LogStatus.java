package com.atguigu.atcrowdfunding.bean;

public class LogStatus {
    private String serverUuid;

    private String local;

    private String replication;

    private String storageEngines;

    public String getServerUuid() {
        return serverUuid;
    }

    public void setServerUuid(String serverUuid) {
        this.serverUuid = serverUuid == null ? null : serverUuid.trim();
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local == null ? null : local.trim();
    }

    public String getReplication() {
        return replication;
    }

    public void setReplication(String replication) {
        this.replication = replication == null ? null : replication.trim();
    }

    public String getStorageEngines() {
        return storageEngines;
    }

    public void setStorageEngines(String storageEngines) {
        this.storageEngines = storageEngines == null ? null : storageEngines.trim();
    }
}