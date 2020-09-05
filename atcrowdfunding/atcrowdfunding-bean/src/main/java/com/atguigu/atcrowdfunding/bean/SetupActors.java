package com.atguigu.atcrowdfunding.bean;

public class SetupActors extends SetupActorsKey {
    private String enabled;

    private String history;

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history == null ? null : history.trim();
    }
}