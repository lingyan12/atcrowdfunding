package com.atguigu.atcrowdfunding.bean;

public class SchemaIndexStatistics {
    private String tableSchema;

    private String tableName;

    private String indexName;

    private Long rowsSelected;

    private String selectLatency;

    private Long rowsInserted;

    private String insertLatency;

    private Long rowsUpdated;

    private String updateLatency;

    private Long rowsDeleted;

    private String deleteLatency;

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema == null ? null : tableSchema.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName == null ? null : indexName.trim();
    }

    public Long getRowsSelected() {
        return rowsSelected;
    }

    public void setRowsSelected(Long rowsSelected) {
        this.rowsSelected = rowsSelected;
    }

    public String getSelectLatency() {
        return selectLatency;
    }

    public void setSelectLatency(String selectLatency) {
        this.selectLatency = selectLatency == null ? null : selectLatency.trim();
    }

    public Long getRowsInserted() {
        return rowsInserted;
    }

    public void setRowsInserted(Long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    public String getInsertLatency() {
        return insertLatency;
    }

    public void setInsertLatency(String insertLatency) {
        this.insertLatency = insertLatency == null ? null : insertLatency.trim();
    }

    public Long getRowsUpdated() {
        return rowsUpdated;
    }

    public void setRowsUpdated(Long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    public String getUpdateLatency() {
        return updateLatency;
    }

    public void setUpdateLatency(String updateLatency) {
        this.updateLatency = updateLatency == null ? null : updateLatency.trim();
    }

    public Long getRowsDeleted() {
        return rowsDeleted;
    }

    public void setRowsDeleted(Long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    public String getDeleteLatency() {
        return deleteLatency;
    }

    public void setDeleteLatency(String deleteLatency) {
        this.deleteLatency = deleteLatency == null ? null : deleteLatency.trim();
    }
}