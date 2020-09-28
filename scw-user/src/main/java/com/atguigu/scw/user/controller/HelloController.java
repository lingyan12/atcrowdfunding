package com.atguigu.scw.user.controller;



import org.apache.http.HttpRequest;
import org.springframework.cloud.client.loadbalancer.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @ResponseBody
    @GetMapping("/hello")
    public String hello (String name , Model model){
        System.err.println("我是get url name：" +name);
        ModelAndView m = new ModelAndView();

        return "ok" + name;
    }

    @GetMapping("/tset")
    public String dis(String name , Model model , HttpServletRequest request){

        model.addAttribute("name",name);

        request.setAttribute("model" , model);

        return "/t2";

    }
    @ResponseBody
    @GetMapping("/t2")
    public String t2(Model model , String name , HttpServletRequest request){

        System.err.println("name:   " + name);
        Model model1 = (Model)request.getAttribute("model");
        System.err.println("model1:     "+model1.getAttribute("name"));
        System.err.println("model2:     "+model.getAttribute("name"));



        return "收到model";
    }


}
