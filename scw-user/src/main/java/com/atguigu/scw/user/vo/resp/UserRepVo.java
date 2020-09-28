package com.atguigu.scw.user.vo.resp;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ApiModel
@Data
@Slf4j
@ToString
public class UserRepVo {

    @ApiModelProperty("令牌 登录后悔分配给用户一个临时令牌，以后对系统任何操作都需要携带令牌")
    //令牌 登录后悔分配给用户一个临时令牌，以后对系统任何操作都需要携带令牌
    private String AcessToken;

    private String loginacct;

    private String username;

    private String email;

    private String authstatus = "0";

    private String usertype;

    private String realname;

    private String cardnum;

    private String accttype;


}
