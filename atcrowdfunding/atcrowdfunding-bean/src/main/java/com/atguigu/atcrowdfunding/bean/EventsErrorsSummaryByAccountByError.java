package com.atguigu.atcrowdfunding.bean;

import java.util.Date;

public class EventsErrorsSummaryByAccountByError {
    private String user;

    private String host;

    private Integer errorNumber;

    private String errorName;

    private String sqlState;

    private Long sumErrorRaised;

    private Long sumErrorHandled;

    private Date firstSeen;

    private Date lastSeen;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public Integer getErrorNumber() {
        return errorNumber;
    }

    public void setErrorNumber(Integer errorNumber) {
        this.errorNumber = errorNumber;
    }

    public String getErrorName() {
        return errorName;
    }

    public void setErrorName(String errorName) {
        this.errorName = errorName == null ? null : errorName.trim();
    }

    public String getSqlState() {
        return sqlState;
    }

    public void setSqlState(String sqlState) {
        this.sqlState = sqlState == null ? null : sqlState.trim();
    }

    public Long getSumErrorRaised() {
        return sumErrorRaised;
    }

    public void setSumErrorRaised(Long sumErrorRaised) {
        this.sumErrorRaised = sumErrorRaised;
    }

    public Long getSumErrorHandled() {
        return sumErrorHandled;
    }

    public void setSumErrorHandled(Long sumErrorHandled) {
        this.sumErrorHandled = sumErrorHandled;
    }

    public Date getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }
}