package com.atguigu.atcrowdfunding.bean;

public class A {
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }
}