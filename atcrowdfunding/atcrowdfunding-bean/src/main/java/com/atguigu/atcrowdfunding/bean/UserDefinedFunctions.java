package com.atguigu.atcrowdfunding.bean;

public class UserDefinedFunctions {
    private String udfName;

    private String udfReturnType;

    private String udfType;

    private String udfLibrary;

    private Long udfUsageCount;

    public String getUdfName() {
        return udfName;
    }

    public void setUdfName(String udfName) {
        this.udfName = udfName == null ? null : udfName.trim();
    }

    public String getUdfReturnType() {
        return udfReturnType;
    }

    public void setUdfReturnType(String udfReturnType) {
        this.udfReturnType = udfReturnType == null ? null : udfReturnType.trim();
    }

    public String getUdfType() {
        return udfType;
    }

    public void setUdfType(String udfType) {
        this.udfType = udfType == null ? null : udfType.trim();
    }

    public String getUdfLibrary() {
        return udfLibrary;
    }

    public void setUdfLibrary(String udfLibrary) {
        this.udfLibrary = udfLibrary == null ? null : udfLibrary.trim();
    }

    public Long getUdfUsageCount() {
        return udfUsageCount;
    }

    public void setUdfUsageCount(Long udfUsageCount) {
        this.udfUsageCount = udfUsageCount;
    }
}