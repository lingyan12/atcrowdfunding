package com.atguigu.atcrowdfunding.bean;

public class EventsStatementsHistogramByDigest {
    private String schemaName;

    private String digest;

    private Integer bucketNumber;

    private Long bucketTimerLow;

    private Long bucketTimerHigh;

    private Long countBucket;

    private Long countBucketAndLower;

    private Double bucketQuantile;

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName == null ? null : schemaName.trim();
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }

    public Integer getBucketNumber() {
        return bucketNumber;
    }

    public void setBucketNumber(Integer bucketNumber) {
        this.bucketNumber = bucketNumber;
    }

    public Long getBucketTimerLow() {
        return bucketTimerLow;
    }

    public void setBucketTimerLow(Long bucketTimerLow) {
        this.bucketTimerLow = bucketTimerLow;
    }

    public Long getBucketTimerHigh() {
        return bucketTimerHigh;
    }

    public void setBucketTimerHigh(Long bucketTimerHigh) {
        this.bucketTimerHigh = bucketTimerHigh;
    }

    public Long getCountBucket() {
        return countBucket;
    }

    public void setCountBucket(Long countBucket) {
        this.countBucket = countBucket;
    }

    public Long getCountBucketAndLower() {
        return countBucketAndLower;
    }

    public void setCountBucketAndLower(Long countBucketAndLower) {
        this.countBucketAndLower = countBucketAndLower;
    }

    public Double getBucketQuantile() {
        return bucketQuantile;
    }

    public void setBucketQuantile(Double bucketQuantile) {
        this.bucketQuantile = bucketQuantile;
    }
}