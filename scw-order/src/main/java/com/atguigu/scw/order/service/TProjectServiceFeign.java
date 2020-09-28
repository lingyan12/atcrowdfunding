package com.atguigu.scw.order.service;


import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.order.bean.TReturn;
import com.atguigu.scw.order.service.exp.TProjectServiceFeignExceptHandler;
import com.atguigu.scw.order.vo.resp.ProjectDetailVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "SCW-PROJECT" , fallback = TProjectServiceFeignExceptHandler.class)
public interface TProjectServiceFeign {

    @GetMapping("/project/details/returns/info/{returnId}")
    public AppResponse<TReturn> returnInfo(@PathVariable("returnId") Integer returnId );


}
