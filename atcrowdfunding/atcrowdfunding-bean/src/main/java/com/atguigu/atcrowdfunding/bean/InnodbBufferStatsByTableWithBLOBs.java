package com.atguigu.atcrowdfunding.bean;

public class InnodbBufferStatsByTableWithBLOBs extends InnodbBufferStatsByTable {
    private String objectSchema;

    private String objectName;

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema == null ? null : objectSchema.trim();
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }
}