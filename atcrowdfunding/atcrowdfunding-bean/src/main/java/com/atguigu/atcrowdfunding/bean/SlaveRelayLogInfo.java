package com.atguigu.atcrowdfunding.bean;

public class SlaveRelayLogInfo {
    private String channelName;

    private Integer numberOfLines;

    private Long relayLogPos;

    private Long masterLogPos;

    private Integer sqlDelay;

    private Integer numberOfWorkers;

    private Integer id;

    private String privilegeChecksUsername;

    private String privilegeChecksHostname;

    private Boolean requireRowFormat;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public Long getRelayLogPos() {
        return relayLogPos;
    }

    public void setRelayLogPos(Long relayLogPos) {
        this.relayLogPos = relayLogPos;
    }

    public Long getMasterLogPos() {
        return masterLogPos;
    }

    public void setMasterLogPos(Long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    public Integer getSqlDelay() {
        return sqlDelay;
    }

    public void setSqlDelay(Integer sqlDelay) {
        this.sqlDelay = sqlDelay;
    }

    public Integer getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrivilegeChecksUsername() {
        return privilegeChecksUsername;
    }

    public void setPrivilegeChecksUsername(String privilegeChecksUsername) {
        this.privilegeChecksUsername = privilegeChecksUsername == null ? null : privilegeChecksUsername.trim();
    }

    public String getPrivilegeChecksHostname() {
        return privilegeChecksHostname;
    }

    public void setPrivilegeChecksHostname(String privilegeChecksHostname) {
        this.privilegeChecksHostname = privilegeChecksHostname == null ? null : privilegeChecksHostname.trim();
    }

    public Boolean getRequireRowFormat() {
        return requireRowFormat;
    }

    public void setRequireRowFormat(Boolean requireRowFormat) {
        this.requireRowFormat = requireRowFormat;
    }
}