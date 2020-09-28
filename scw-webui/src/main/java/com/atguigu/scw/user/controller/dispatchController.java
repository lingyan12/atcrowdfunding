package com.atguigu.scw.user.controller;


import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.user.service.TMemberServiceFeign;
import com.atguigu.scw.user.service.TProjectServiceFeign;
import com.atguigu.scw.user.vo.resp.ProjectVo;
import com.atguigu.scw.user.vo.resp.UserRepVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class dispatchController {


    @Autowired
    TMemberServiceFeign memberServiceFeign;

    @Autowired
    TProjectServiceFeign projectServiceFeign;


//    @Autowired
//    StringRedisTemplate strRedis;

    @Qualifier("redisTemplate")
    @Autowired
    RedisTemplate objRedis;


//当某个controller 的作用只是用来跳转的时候  在有mvc.xml的时候 可以直接使用
// <mvc:view-controller path="/index" view-name="index">这个配置 一步写完 而没有必要再配置controlle
    //但是现在 并没有xml文件的存在 所以可以直接写一个配置类 implements WebMvcConfigurer 这个接口
    // 然后配合注解完成这个一步controller 案例在config/AppWebMvcConfigurer中
//    @GetMapping("/index")
//    public String index(Model model){ return "index";}


    @GetMapping("/logout")
    public String logout(HttpSession session) {

        session.removeAttribute("loginMember");

        session.removeAttribute("user");

        session.invalidate();


        return "redirect:/index";


    }





    @GetMapping({"/index",""} )
    public String index(Model model) {

        System.err.println("进入index");


        List<ProjectVo> projectInfo = (List<ProjectVo>) objRedis.opsForValue().get("projectInfo");

        if (projectInfo == null) {

            AppResponse<List<ProjectVo>> all = projectServiceFeign.all();

            projectInfo = all.getData();

//            projectInfo = JSON.toJSONString(data);

            objRedis.opsForValue().set("projectInfo", projectInfo, 1, TimeUnit.HOURS);
            return "redirect:/index";
        } else {

            model.addAttribute("hello", "hello");

            model.addAttribute("user", Arrays.asList("1", "2", "3", "4"));

            model.addAttribute("projectVoList", projectInfo);

            System.err.println("projectVoList" +projectInfo);

        return "index";

        }


    }

    @RequestMapping("/doLogin")
    public String doLogin(String loginacct, String pwd, HttpSession session) {

        AppResponse<UserRepVo> resp = memberServiceFeign.login(loginacct, pwd);
        UserRepVo data = resp.getData();

        String PreUrl = (String) session.getAttribute("PreUrl");


        if (data == null) {

            System.err.println("data =====null");
            return "login";

        } else {

            session.setAttribute("loginMember", data);
            session.setAttribute("user", loginacct);

        if (!StringUtils.isEmpty(PreUrl)){
            session.removeAttribute("PreUrl");
            return "redirect:"+ PreUrl;
//            return "redirect:login";


        }
            System.err.println("有返回数据");
            return "redirect:/index";
//            return "forward:/project/confirm/order/{num}";

        }


    }


    @RequestMapping("/login")
    public String login() {


        return "login";
    }


}
