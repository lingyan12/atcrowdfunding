package com.atguigu.scw.user.vo.req;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class OrderInfoSubmitVo implements Serializable {
	
    private String accessToken;

    private Integer projectid;

    private Integer returnid;

    private Integer rtncount;

    private String address;

    private Byte invoice;

    private String invoictitle;

    private String remark;

}
