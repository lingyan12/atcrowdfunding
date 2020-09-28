package com.atguigu.scw.order.vo;

import lombok.Data;

@Data
public class OrderInfoSubmitVo {
	
    private String accessToken;

    private Integer projectid;

    private Integer returnid;

    private Integer rtncount;

    private String address;

    private Byte invoice;

    private String invoictitle;

    private String remark;

}
