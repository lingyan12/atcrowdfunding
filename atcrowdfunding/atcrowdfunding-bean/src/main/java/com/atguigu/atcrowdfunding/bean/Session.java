package com.atguigu.atcrowdfunding.bean;

import java.math.BigDecimal;

public class Session {
    private Long thdId;

    private Long connId;

    private String user;

    private String db;

    private String command;

    private String state;

    private Long time;

    private String statementLatency;

    private BigDecimal progress;

    private String lockLatency;

    private Long rowsExamined;

    private Long rowsSent;

    private Long rowsAffected;

    private Long tmpTables;

    private Long tmpDiskTables;

    private String fullScan;

    private String lastStatementLatency;

    private String currentMemory;

    private String lastWait;

    private String lastWaitLatency;

    private String source;

    private String trxLatency;

    private String trxState;

    private String trxAutocommit;

    private String pid;

    private String programName;

    public Long getThdId() {
        return thdId;
    }

    public void setThdId(Long thdId) {
        this.thdId = thdId;
    }

    public Long getConnId() {
        return connId;
    }

    public void setConnId(Long connId) {
        this.connId = connId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getStatementLatency() {
        return statementLatency;
    }

    public void setStatementLatency(String statementLatency) {
        this.statementLatency = statementLatency == null ? null : statementLatency.trim();
    }

    public BigDecimal getProgress() {
        return progress;
    }

    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    public String getLockLatency() {
        return lockLatency;
    }

    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency == null ? null : lockLatency.trim();
    }

    public Long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public Long getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    public Long getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public Long getTmpTables() {
        return tmpTables;
    }

    public void setTmpTables(Long tmpTables) {
        this.tmpTables = tmpTables;
    }

    public Long getTmpDiskTables() {
        return tmpDiskTables;
    }

    public void setTmpDiskTables(Long tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }

    public String getFullScan() {
        return fullScan;
    }

    public void setFullScan(String fullScan) {
        this.fullScan = fullScan == null ? null : fullScan.trim();
    }

    public String getLastStatementLatency() {
        return lastStatementLatency;
    }

    public void setLastStatementLatency(String lastStatementLatency) {
        this.lastStatementLatency = lastStatementLatency == null ? null : lastStatementLatency.trim();
    }

    public String getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(String currentMemory) {
        this.currentMemory = currentMemory == null ? null : currentMemory.trim();
    }

    public String getLastWait() {
        return lastWait;
    }

    public void setLastWait(String lastWait) {
        this.lastWait = lastWait == null ? null : lastWait.trim();
    }

    public String getLastWaitLatency() {
        return lastWaitLatency;
    }

    public void setLastWaitLatency(String lastWaitLatency) {
        this.lastWaitLatency = lastWaitLatency == null ? null : lastWaitLatency.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getTrxLatency() {
        return trxLatency;
    }

    public void setTrxLatency(String trxLatency) {
        this.trxLatency = trxLatency == null ? null : trxLatency.trim();
    }

    public String getTrxState() {
        return trxState;
    }

    public void setTrxState(String trxState) {
        this.trxState = trxState == null ? null : trxState.trim();
    }

    public String getTrxAutocommit() {
        return trxAutocommit;
    }

    public void setTrxAutocommit(String trxAutocommit) {
        this.trxAutocommit = trxAutocommit == null ? null : trxAutocommit.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName == null ? null : programName.trim();
    }
}