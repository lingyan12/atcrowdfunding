package com.atguigu.atcrowdfunding.bean;

public class EventsStatementsHistogramGlobal {
    private Integer bucketNumber;

    private Long bucketTimerLow;

    private Long bucketTimerHigh;

    private Long countBucket;

    private Long countBucketAndLower;

    private Double bucketQuantile;

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