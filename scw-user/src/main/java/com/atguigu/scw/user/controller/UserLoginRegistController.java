package com.atguigu.scw.user.controller;

import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.user.service.TMemberService;
import com.atguigu.scw.user.vo.req.UserRegistVo;
import com.atguigu.scw.user.vo.resp.UserRepVo;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.TimeUnit;
@Slf4j
@ApiModel("用户注册中心")
@Controller
public class UserLoginRegistController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    TMemberService memberService;

    @ResponseBody
    @PostMapping("/regist")
    @ApiOperation("用户注册中心")
    public AppResponse<Object> regist(UserRegistVo vo) {

        String loginacct = vo.getLoginacct();
        stringRedisTemplate.opsForValue().set(loginacct, loginacct.toString(), 20, TimeUnit.MINUTES);


        if (!StringUtils.isEmpty(loginacct)) {

            String verify = stringRedisTemplate.opsForValue().get(loginacct);


            if (!StringUtils.isEmpty(verify)) {

                if (verify.equals(vo.getCode())) {

                    Integer i = memberService.saveTMember(vo);

                    if (i == 1){

                        stringRedisTemplate.delete(loginacct);  //手动清理redis缓存

                    return AppResponse.ok("ok");

                    }else {
                        return AppResponse.fail(null);
                    }

                } else {
                    AppResponse<Object> err = AppResponse.fail(null);

                    err.setMsg("验证码错误");
                    return err;
                }


            } else {

                AppResponse<Object> fallEmpyt = AppResponse.fail(null);
                fallEmpyt.setMsg("verfiy超时");

                return fallEmpyt;

            }

//            return AppResponse.ok("ok");


        } else {

            AppResponse<Object> fail = AppResponse.fail(null);
            fail.setMsg("用户名为空");


            return fail;
        }


    }



    @ResponseBody
    @ApiOperation("用户登陆")
    @PostMapping("/login")
    public AppResponse<UserRepVo> login(@RequestParam("loginacct")String loginacct , @RequestParam("pwd")String pwd){

        System.err.println("loginacct:    "+loginacct);
        System.err.println("pwd:    "+pwd);


        try {
            UserRepVo vo = memberService.getUserByLogin(loginacct , pwd);

            log.debug("用户登陆成功！----{}",loginacct);
            return  AppResponse.ok(vo);
        } catch (Exception e) {
            e.getStackTrace();

            log.debug("登录失败---loginacct:  {} ， 失败原因{}" , loginacct , e.getMessage());

            AppResponse<UserRepVo> response = AppResponse.fail(null);
            response.setMsg(e.getMessage());

            return response;
        }

    }













}
