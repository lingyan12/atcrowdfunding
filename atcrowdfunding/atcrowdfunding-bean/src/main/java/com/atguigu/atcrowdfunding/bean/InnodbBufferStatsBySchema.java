package com.atguigu.atcrowdfunding.bean;

import java.math.BigDecimal;

public class InnodbBufferStatsBySchema {
    private String allocated;

    private String data;

    private Long pages;

    private Long pagesHashed;

    private Long pagesOld;

    private BigDecimal rowsCached;

    private String objectSchema;

    public String getAllocated() {
        return allocated;
    }

    public void setAllocated(String allocated) {
        this.allocated = allocated == null ? null : allocated.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public Long getPagesHashed() {
        return pagesHashed;
    }

    public void setPagesHashed(Long pagesHashed) {
        this.pagesHashed = pagesHashed;
    }

    public Long getPagesOld() {
        return pagesOld;
    }

    public void setPagesOld(Long pagesOld) {
        this.pagesOld = pagesOld;
    }

    public BigDecimal getRowsCached() {
        return rowsCached;
    }

    public void setRowsCached(BigDecimal rowsCached) {
        this.rowsCached = rowsCached;
    }

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema == null ? null : objectSchema.trim();
    }
}