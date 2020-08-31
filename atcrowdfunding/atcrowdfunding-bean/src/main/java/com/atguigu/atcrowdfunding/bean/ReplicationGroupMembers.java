package com.atguigu.atcrowdfunding.bean;

public class ReplicationGroupMembers {
    private String channelName;

    private String memberId;

    private String memberHost;

    private Integer memberPort;

    private String memberState;

    private String memberRole;

    private String memberVersion;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getMemberHost() {
        return memberHost;
    }

    public void setMemberHost(String memberHost) {
        this.memberHost = memberHost == null ? null : memberHost.trim();
    }

    public Integer getMemberPort() {
        return memberPort;
    }

    public void setMemberPort(Integer memberPort) {
        this.memberPort = memberPort;
    }

    public String getMemberState() {
        return memberState;
    }

    public void setMemberState(String memberState) {
        this.memberState = memberState == null ? null : memberState.trim();
    }

    public String getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(String memberRole) {
        this.memberRole = memberRole == null ? null : memberRole.trim();
    }

    public String getMemberVersion() {
        return memberVersion;
    }

    public void setMemberVersion(String memberVersion) {
        this.memberVersion = memberVersion == null ? null : memberVersion.trim();
    }
}