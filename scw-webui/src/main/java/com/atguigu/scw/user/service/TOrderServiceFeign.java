package com.atguigu.scw.user.service;


import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.user.bean.TOrder;
import com.atguigu.scw.user.service.exp.TOrderServiceFeignExceptHandler;
import com.atguigu.scw.user.vo.req.OrderInfoSubmitVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "SCW-ORDER" , fallback = TOrderServiceFeignExceptHandler.class )
public interface TOrderServiceFeign {

    /**
     *
     * 如果简单地参数 可以直接通过 PathVariable 或者 RequestParam 来传参
     * 如果复杂的话 应该用 RequestBody  将其装换成一个类似于Json的对象 且封装在  body中才传输
     *
     *
     * @param vo
     * @return
     */


    @RequestMapping("/order/saveOrder")
    AppResponse<TOrder> saveOrder(@RequestBody OrderInfoSubmitVo vo);


//    @RequestMapping("/order/saveOrder")
//    AppResponse<TOrder> saveOrder(@RequestBody OrderInfoSubmitVo vo)




}
