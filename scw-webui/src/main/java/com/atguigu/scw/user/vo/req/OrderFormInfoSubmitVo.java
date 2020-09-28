package com.atguigu.scw.user.vo.req;


import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

public class OrderFormInfoSubmitVo implements Serializable {

    private String address;//收货地址id
    private Byte invoice;//0代表不要  1-代表要
    private String invoictitle;//发票抬头
    private String remark;//订单的备注

    @Override
    public String toString() {
        return "OrderFormInfoSubmitVo{" +
                "address='" + address + '\'' +
                ", invoice=" + invoice +
                ", invoictitle='" + invoictitle + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getInvoice() {
        return invoice;
    }

    public void setInvoice(Byte invoice) {
        this.invoice = invoice;
    }

    public String getInvoictitle() {
        return invoictitle;
    }

    public void setInvoictitle(String invoictitle) {
        this.invoictitle = invoictitle;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public OrderFormInfoSubmitVo() {
    }

    public OrderFormInfoSubmitVo(String address, Byte invoice, String invoictitle, String remark) {
        this.address = address;
        this.invoice = invoice;
        this.invoictitle = invoictitle;
        this.remark = remark;
    }
}
