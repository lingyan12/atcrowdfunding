package com.atguigu.atcrowdfunding.controller;


import com.atguigu.atcrowdfunding.bean.TRole;
import com.atguigu.atcrowdfunding.service.TRoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TRoleController {


    @Autowired
    TRoleService roleService;

    @RequestMapping("/role/index")
    public String index(){


        return "role/index";
    }

    /**
     * 消息转换器 org.springframework.http.converter.HttpMessageConverter
     *
     * 如果返回的结果是对象类型(Entity Class , List , Map....)，
     * 则启用 -》org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
     * 将对象序列化为字符串,使用jackson组件 转化
     *
     * 如果返回结果是String类型，
     * 则启用 -》org.springframework.http.converter.StringHttpMessageConverter
     * 这个转换器会将字符串原样输出
     * @param pageNum
     * @param pageSize
     * @return
     */


    @ResponseBody //加了这个注解以后 返回值就是json  如果不加就会 跳转页面  原理是启用了消息转换器
    @RequestMapping("/role/loadData")
    public PageInfo<TRole> loadData(@RequestParam(value = "pageNum" ,required = false,defaultValue = "1") Integer pageNum ,
                                    @RequestParam(value = "pageSize" ,required = false,defaultValue = "2")Integer pageSize,
                                    @RequestParam(value = "condition" ,required = false,defaultValue = "")String condition){

        System.err.println(pageNum);

        PageHelper.startPage(pageNum,pageSize);

        Map<String ,Object> map = new HashMap<>();

        map.put("pageNum" ,pageNum);
        map.put("condition" ,condition);

        PageInfo<TRole> page = roleService.listRolePage(map);

        return page; //转化为json串
    }




}
