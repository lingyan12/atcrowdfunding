package com.atguigu.atcrowdfunding.controller;


import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispatcherController {

    Logger log = LoggerFactory.getLogger(DiskFileItemFactory.class);

@RequestMapping("/index")
public String index(){
    log.debug("跳转到主页面........");
    return "index";
}

@RequestMapping("/login")
public String login(){
    log.debug("login");
    return "login";
}

    @RequestMapping("/dologin")
    public String dologin(String loginacct , String userpwd){
        log.debug("正在运行dologin");

        log.debug("loginacct: {}" , loginacct);
        log.debug("userpwd: {}" , userpwd);

        return "main";
    }





}
