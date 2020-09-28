package com.atguigu.scw.user.controller;


import com.atguigu.scw.user.service.TOrderServiceFeign;
import com.atguigu.scw.user.vo.req.OrderFormInfoSubmitVo;
import com.atguigu.scw.user.vo.req.UserRegistVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;


@Slf4j
@Controller
public class PayOrderController {


    @Autowired
    TOrderServiceFeign orderServiceFeign;

@PostMapping("/order/pay")
public String payOrder(OrderFormInfoSubmitVo vo ,  HttpSession session){


    System.err.println("进入@PostMapping(\"/order/pay\")  ");


    System.err.println("vo =============" + vo);

    log.debug("UserRegistVo ======{}" , vo);


    session.setAttribute("OrderFormInfoSubmitVo" , vo);



    return "redirect:/member/minecrowdfunding";

}












}
