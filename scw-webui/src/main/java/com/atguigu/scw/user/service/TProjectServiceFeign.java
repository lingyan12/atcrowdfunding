package com.atguigu.scw.user.service;


import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.user.service.exp.TProjectServiceFeignExceptionHandler;
import com.atguigu.scw.user.vo.resp.ProjectDetailVo;
import com.atguigu.scw.user.vo.resp.ProjectVo;
import com.atguigu.scw.user.vo.resp.ReturnPayConfirmVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "SCW-PROJECT",fallback = TProjectServiceFeignExceptionHandler.class)
public interface TProjectServiceFeign {


    @GetMapping("/project/all")
    public AppResponse<List<ProjectVo>> all() ;


    @GetMapping("/project/details/info/{projectId}")
    public AppResponse<ProjectDetailVo> detailsInfo(@PathVariable("projectId") Integer projectId) ;



    @GetMapping("/project/confim/returns/{projectId}/{returnId}")
    public AppResponse<ReturnPayConfirmVo> returnInfo(
            @PathVariable("projectId") Integer projectId ,
            @PathVariable("returnId") Integer returnId );



    @GetMapping("/project/confirm/returns/{projectId}/{returnId}")
    public AppResponse<ReturnPayConfirmVo> confirmReturn(
            @PathVariable("returnId") Integer returnId,
            @PathVariable("projectId") Integer projectId);



    }
