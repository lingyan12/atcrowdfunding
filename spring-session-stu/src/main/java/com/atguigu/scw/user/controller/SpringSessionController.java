package com.atguigu.scw.user.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SpringSessionController {

    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("msg" , "Hello");

        System.err.println(session.getClass());
        //解决session一致性 使用redis 持久化

        return "ok";

    }

    @GetMapping("/get")
    public String getSession(HttpSession session){
        String msg =(String) session.getAttribute("msg");
        System.err.println(session.getClass());

        return msg;

    }



}
