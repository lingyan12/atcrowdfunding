package com.atguigu.atcrowdfunding.bean;

public class ReplicationApplierConfiguration {
    private String channelName;

    private Integer desiredDelay;

    private String requireRowFormat;

    private String privilegeChecksUser;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Integer getDesiredDelay() {
        return desiredDelay;
    }

    public void setDesiredDelay(Integer desiredDelay) {
        this.desiredDelay = desiredDelay;
    }

    public String getRequireRowFormat() {
        return requireRowFormat;
    }

    public void setRequireRowFormat(String requireRowFormat) {
        this.requireRowFormat = requireRowFormat == null ? null : requireRowFormat.trim();
    }

    public String getPrivilegeChecksUser() {
        return privilegeChecksUser;
    }

    public void setPrivilegeChecksUser(String privilegeChecksUser) {
        this.privilegeChecksUser = privilegeChecksUser == null ? null : privilegeChecksUser.trim();
    }
}