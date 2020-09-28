package com.atguigu.scw.user.controller;


import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.user.service.TMemberServiceFeign;
import com.atguigu.scw.user.service.TProjectServiceFeign;
import com.atguigu.scw.user.vo.resp.ProjectDetailVo;
import com.atguigu.scw.user.vo.resp.ReturnPayConfirmVo;
import com.atguigu.scw.user.vo.resp.UserAddressVo;
import com.atguigu.scw.user.vo.resp.UserRepVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.math.BigDecimal;
import java.util.List;


@Slf4j
@Controller
public class ProjectController {
    @Autowired
    TProjectServiceFeign projectServiceFeign;


    @Autowired
    TMemberServiceFeign memberServiceFeign;




    @GetMapping("/project/projectInfo")
    public String projectInfo(@RequestParam("id") Integer id , Model model){
        System.err.println();

        System.err.println("已经进入project/projectInfo controller");

        ProjectDetailVo vo = projectServiceFeign.detailsInfo(id).getData();

        System.err.println(vo);

        model.addAttribute("ProjectDetailVo",vo);

        System.err.println("vo "+ vo);

        return "project/index";
    }

//
    @GetMapping("/project/confim/returns/{projectId}/{returnId}")
    public String support(
            @PathVariable("projectId") Integer projectId ,
            @PathVariable("returnId") Integer returnId ,
            Model model ,HttpSession session){

        System.err.println("support================projectId===" +projectId+":==returnId"+returnId);


        AppResponse<ReturnPayConfirmVo> response = projectServiceFeign.confirmReturn(projectId, returnId);

        ReturnPayConfirmVo data = response.getData();
        model.addAttribute("returnPayConfirmVo",data);

        session.setAttribute("returnPayConfirmVoSession" , data);

        return "project/pay-step-1";
    }



    @GetMapping("/project/confirm/order/{num}")
    public String confirmOrder(Model model , HttpSession session,
                               @PathVariable("num") Integer num
                               ){
        System.err.println("进入confirmOrder");

        String PreUrl = "/project/confirm/order/" + num;

        session.setAttribute("PreUrl",PreUrl);

        UserRepVo loginMember =(UserRepVo) session.getAttribute("loginMember");



        if (loginMember == null){


            return "redirect:/login";
        }
        String token = loginMember.getAcessToken();

        System.err.println("num===========" + num);


        AppResponse<List<UserAddressVo>> address = memberServiceFeign.address(token);




        model.addAttribute("memberAddress" , address);

        ReturnPayConfirmVo data =(ReturnPayConfirmVo) session.getAttribute("returnPayConfirmVoSession");

        data.setNum(num);
        data.setTotalPrice(new BigDecimal( num * data.getPrice() + data.getFreight() ));

        //由于从 redis缓存区中取出的数据 所以必须要重新往 session 中set一次 以保证session的一致性
        session.setAttribute("returnPayConfirmVoSession" , data);
        model.addAttribute("returnPayConfirmVo",data);


        return "project/pay-step-2";

    }















}
