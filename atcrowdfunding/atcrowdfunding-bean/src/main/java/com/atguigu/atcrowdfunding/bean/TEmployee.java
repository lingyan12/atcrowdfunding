package com.atguigu.atcrowdfunding.bean;

import java.util.Date;

public class TEmployee {
    private Integer eid;

    private String ename;

    private String tel;

    private String gender;

    private Double salary;

    private Double commissionPct;

    private Date birthday;

    private Date hiredate;

    private Integer jobId;

    private String email;

    private Integer mid;

    private String addresss;

    private String naticePlace;

    private Integer did;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(Double commissionPct) {
        this.commissionPct = commissionPct;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss == null ? null : addresss.trim();
    }

    public String getNaticePlace() {
        return naticePlace;
    }

    public void setNaticePlace(String naticePlace) {
        this.naticePlace = naticePlace == null ? null : naticePlace.trim();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}