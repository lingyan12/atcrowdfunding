package com.atguigu.atcrowdfunding.controller;

import com.atguigu.atcrowdfunding.bean.TAdmin;
import com.atguigu.atcrowdfunding.service.TAdminService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.http.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TAdminController {

    Logger log = LoggerFactory.getLogger(TAdminController.class);

        @Autowired
        TAdminService adminService;


    @RequestMapping("/admin/index")
    public String index(@RequestParam(value = "pageNum" , required = false , defaultValue = "1") Integer pageNum ,
                        @RequestParam(value = "pageSize" , required = false , defaultValue = "2") Integer pageSize ,
                        Model model,
                        @RequestParam(value = "condition" , required = false , defaultValue = "") String condition ){
    log.debug("进入到/admin/index请求的servlet中");

    log.debug("condition:-----: {}",condition);
    log.debug("pageNum:-----: {}",pageNum);
    log.debug("pageSize:-----: {}",pageSize);
    System.err.println("condition:-----: "+ condition);

    System.err.println(pageNum);

    PageHelper.startPage(pageNum,pageSize);

    Map<String , Object> paramMap = new HashMap<>();
    paramMap.put("condition" , condition);

    PageInfo<TAdmin> page = adminService.listAdminPage(paramMap);
        System.err.println("正在打印page");
        System.err.println(page);

    model.addAttribute("page" , page);

    return "admin/index";
    }

    @RequestMapping("/admin/toAdd")
    public String toAdd(){
        log.debug("进入/admin/add");


        return "admin/add";
    }


    @RequestMapping("/admin/doAdd")
    public String doAdd(TAdmin admin){
        log.debug("进入/admin/doAdd");

        adminService.saveTAdmin(admin);


//        return "redirect:/admin/index";

        return "redirect:/admin/index?pageNum="+Integer.MAX_VALUE;
    }


    @RequestMapping("/admin/toUpdate")
    public String toUpdate(Integer id, Model model){
        log.debug("进入/admin/toUpdate");

        TAdmin admin = adminService.getTAdminById(id);

        model.addAttribute("admin" , admin);

        return "admin/update";
    }



    @RequestMapping("/admin/doUpdate")
    public String doUpdate(TAdmin admin , Integer pageNum){
        log.debug("进入/admin/doUpdate");

        System.err.println("doUpdate---pageNum: "+pageNum);

        adminService.updateTAdmin(admin);


        return "redirect:/admin/index?pageNum="+pageNum;
    }



    @RequestMapping("/admin/toDelete")
    public String toDelete( Integer id , Integer pageNum ){
        log.debug("进入/admin/doDelete");

        System.err.println("------id: "+id);
        System.err.println("------pageNum: "+pageNum);

        adminService.delTAdmin(id);



        return "redirect:/admin/index?pageNum="+pageNum;
    }



    @RequestMapping("/admin/doDeleteBatch")
    public String doDeleteBatch(Integer pageNum ,  String ids ){ //ids = 1,2,3,4,5
        System.err.println("ids---------------------------"+ids);
        log.debug("进入/admin/doDeleteBatch");
        List<Integer> idList = new ArrayList<>();

        String[] split = ids.split(",");


            for (String s : split) {
                int i = Integer.parseInt(s);
                System.err.println(i);
                idList.add(i);
            }

        adminService.deleteBatch(idList);


        System.err.println("------ids: "+ids);
//        System.err.println("------pageNum: "+pageNum);




        return "redirect:/admin/index?pageNum="+pageNum;
    }




}
