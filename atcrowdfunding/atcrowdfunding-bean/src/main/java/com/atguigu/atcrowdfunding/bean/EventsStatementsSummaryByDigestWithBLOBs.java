package com.atguigu.atcrowdfunding.bean;

public class EventsStatementsSummaryByDigestWithBLOBs extends EventsStatementsSummaryByDigest {
    private String digestText;

    private String querySampleText;

    public String getDigestText() {
        return digestText;
    }

    public void setDigestText(String digestText) {
        this.digestText = digestText == null ? null : digestText.trim();
    }

    public String getQuerySampleText() {
        return querySampleText;
    }

    public void setQuerySampleText(String querySampleText) {
        this.querySampleText = querySampleText == null ? null : querySampleText.trim();
    }
}