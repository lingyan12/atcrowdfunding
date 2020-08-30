package com.atguigu.atcrowdfunding.bean;

public class KeyringKeys {
    private String keyId;

    private String keyOwner;

    private String backendKeyId;

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId == null ? null : keyId.trim();
    }

    public String getKeyOwner() {
        return keyOwner;
    }

    public void setKeyOwner(String keyOwner) {
        this.keyOwner = keyOwner == null ? null : keyOwner.trim();
    }

    public String getBackendKeyId() {
        return backendKeyId;
    }

    public void setBackendKeyId(String backendKeyId) {
        this.backendKeyId = backendKeyId == null ? null : backendKeyId.trim();
    }
}