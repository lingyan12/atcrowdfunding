package com.atguigu.scw.user.service;


import com.atguigu.scw.IO.AppResponse;

import com.atguigu.scw.user.bean.TMember;
import com.atguigu.scw.user.service.exp.TMemberServiceFeignExpHandler;
import com.atguigu.scw.user.vo.resp.UserAddressVo;
import com.atguigu.scw.user.vo.resp.UserRepVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "SCW-USER",fallback = TMemberServiceFeignExpHandler.class)
public interface TMemberServiceFeign {

//    @ResponseBody
//    @PostMapping("/login")
//    public AppResponse<UserRepVo> login(@RequestParam("loginacct")String loginacct , @RequestParam("pwd")String pwd);

    @PostMapping("/login")
    public AppResponse<UserRepVo> login(@RequestParam("loginacct")String loginacct , @RequestParam("pwd")String pwd);

    @GetMapping("/getMemberById")
    public AppResponse<TMember> getMemberById(@RequestParam("id") Integer id);


    @GetMapping("/user/info/address")
    public AppResponse<List<UserAddressVo>> address(@RequestParam("accessToken")String accessToken);
}
