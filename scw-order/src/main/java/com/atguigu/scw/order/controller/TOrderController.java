package com.atguigu.scw.order.controller;


import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.order.bean.TOrder;
import com.atguigu.scw.order.service.TOrderService;
import com.atguigu.scw.order.vo.OrderInfoSubmitVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TOrderController {



    @Autowired
    TOrderService orderService;

    @RequestMapping("/order/saveOrder")
    AppResponse<TOrder> saveOrder(@RequestBody OrderInfoSubmitVo vo){


        try {

            log.debug("保存开始========================== vo ==== {}" , vo);
            TOrder order = orderService.saveOrder(vo);

            log.debug("保存成功=============    order {} ",order);
            return AppResponse.ok(order);
        } catch (Exception e) {
            e.printStackTrace();
            AppResponse<TOrder> fail = AppResponse.fail(null);
            fail.setMsg("TOrder 保存订单失败失败");

            log.error("TOrder 保存订单失败失败=====================================");
            return fail;
        }
    }








}
