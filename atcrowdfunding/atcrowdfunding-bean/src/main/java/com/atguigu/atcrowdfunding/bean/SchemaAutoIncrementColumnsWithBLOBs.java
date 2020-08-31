package com.atguigu.atcrowdfunding.bean;

public class SchemaAutoIncrementColumnsWithBLOBs extends SchemaAutoIncrementColumns {
    private String dataType;

    private String columnType;

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType == null ? null : columnType.trim();
    }
}