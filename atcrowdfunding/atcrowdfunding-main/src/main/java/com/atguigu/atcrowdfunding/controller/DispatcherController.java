package com.atguigu.atcrowdfunding.controller;









import com.atguigu.atcrowdfunding.bean.TAdmin;
import com.atguigu.atcrowdfunding.service.TAdminService;
import com.atguigu.atcrowdfunding.service.impl.TAdminServiceImpl;
import com.atguigu.atcrowdfunding.util.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class DispatcherController {

    Logger log = LoggerFactory.getLogger(DispatcherController.class);
//

    @Autowired
    TAdminService adminService;





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
    public String dologin(String loginacct , String userpwd , HttpSession session , Model model){
        log.debug("正在运行dologin");

        log.debug("loginacct: {}" , loginacct);
        log.debug("userpwd: {}" , userpwd);

        HashMap<String, Object> map = new HashMap<>();
        map.put("loginacct",loginacct);
        map.put("userpwd",userpwd);

        try {
//            TAdminServiceImpl adminService = new TAdminServiceImpl();
            TAdmin admin = adminService.getTAdminByLogin(map);
            session.setAttribute(Const.LOGIN_ADMIN ,admin );
            log.debug("进入try");
        return "main";

        } catch (Exception e) {
           log.debug( "登录失败,原因是 {}",e.getMessage());
           model.addAttribute("message" , e.getMessage());
           return "login";
        }

    }





}
