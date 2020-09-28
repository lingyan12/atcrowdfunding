package com.atguigu.scw.project.service;


import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.project.bean.TMember;
import com.atguigu.scw.project.service.exp.TmemberServiceFeignExceptionHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SCW-USER",fallback = TmemberServiceFeignExceptionHandler.class)
public interface TmemberServiceFeign {

    @RequestMapping("/user/info/getMemberById")
    public AppResponse<TMember> getMemberById(@RequestParam("id") Integer id);




}
