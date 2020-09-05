package com.atguigu.atcrowdfunding.controller;
import com.atguigu.atcrowdfunding.bean.TAdmin;
import com.atguigu.atcrowdfunding.bean.TMenu;
import com.atguigu.atcrowdfunding.service.TAdminService;
import com.atguigu.atcrowdfunding.service.TMenuService;
import com.atguigu.atcrowdfunding.service.impl.TAdminServiceImpl;
import com.atguigu.atcrowdfunding.util.Const;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
public class DispatcherController {

    Logger log = LoggerFactory.getLogger(DispatcherController.class);
//

    @Autowired
    TAdminService adminService;

    @Autowired
    TMenuService menuService;



@RequestMapping("/logout")
public String logout( HttpSession session ){
    log.debug("用户注销");

    if (session != null){
        session.removeAttribute(Const.LOGIN_ADMIN);
        session.invalidate();
    }


    log.debug("跳转到主页面........");
    return "redirect:/index";
}

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
        System.err.println(loginacct);
        System.err.println(userpwd);

        log.debug("loginacct: {}" , loginacct);
        log.debug("userpwd: {}" , userpwd);

        HashMap<String, Object> map = new HashMap<>();
        map.put("loginacct",loginacct);
        map.put("userpwd",userpwd);

        try {
            TAdmin admin = adminService.getTAdminByLogin(map);
            session.setAttribute(Const.LOGIN_ADMIN ,admin );
            log.debug("进入try");
//        return "main";//由于转发 每次刷新都会重新登陆一次  所以不如用重定向
            return "redirect:/main";
        } catch (Exception e) {
           log.debug( "登录失败,原因是 {}",e.getMessage());
           model.addAttribute("message" , e.getMessage());
           return "login";
        }

    }


    @RequestMapping("/main")
    public String main(HttpSession session){
        log.debug("跳转到后台系统的main页面");

        //存放父菜单
    List<TMenu> menulist = menuService.listMenuAll();
    session.setAttribute("menulist" , menulist);
        System.err.println(menulist);
        System.err.println("------------------------------------------------------------");


        return "main";
    }





}
