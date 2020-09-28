package com.atguigu.scw.user.vo.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserRegistVo implements Serializable {
    @ApiModelProperty("手机号")
    private String loginacct;
    @ApiModelProperty("密码")
    private String userpswd;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("验证码")
    private String code;
    @ApiModelProperty("用户类型 0 企业 ， 1 个人")
    private String usertype;
}
