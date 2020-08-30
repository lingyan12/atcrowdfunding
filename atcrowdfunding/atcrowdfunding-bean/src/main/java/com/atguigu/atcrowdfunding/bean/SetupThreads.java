package com.atguigu.atcrowdfunding.bean;

public class SetupThreads {
    private String name;

    private String enabled;

    private String history;

    private String properties;

    private Integer volatility;

    private String documentation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

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

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties == null ? null : properties.trim();
    }

    public Integer getVolatility() {
        return volatility;
    }

    public void setVolatility(Integer volatility) {
        this.volatility = volatility;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation == null ? null : documentation.trim();
    }
}