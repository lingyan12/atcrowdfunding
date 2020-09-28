package com.atguigu.scw.user.controller;


import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.user.bean.TOrder;
import com.atguigu.scw.user.service.TOrderServiceFeign;
import com.atguigu.scw.user.vo.req.OrderFormInfoSubmitVo;
import com.atguigu.scw.user.vo.req.OrderInfoSubmitVo;
import com.atguigu.scw.user.vo.resp.ReturnPayConfirmVo;
import com.atguigu.scw.user.vo.resp.UserRepVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;


@Slf4j
@Controller
public class TMemberController {

    @Autowired
    TOrderServiceFeign orderServiceFeign;


///member/minecrowdfunding

    @GetMapping("member/minecrowdfunding")
    public String MyOrderList( HttpSession session , Model model) {
        //1.下单

         OrderFormInfoSubmitVo form= (OrderFormInfoSubmitVo)session.getAttribute("OrderFormInfoSubmitVo");
        log.debug(" 重定向提交的表单详情 OrderFormInfoSubmitVo form{} ==============", form);

        OrderInfoSubmitVo vo = new OrderInfoSubmitVo();

        BeanUtils.copyProperties(form, vo);

        UserRepVo loginMember = (UserRepVo)session.getAttribute("loginMember");

        if (loginMember == null){
            return "redirect:/login";
        }


        vo.setAccessToken((String) loginMember.getAcessToken());

        ReturnPayConfirmVo data = (ReturnPayConfirmVo) session.getAttribute("returnPayConfirmVoSession");

        if (data == null){

            return "redirect:/login";

        }

        vo.setProjectid(data.getProjectId());
        vo.setReturnid(data.getReturnId());
        vo.setRtncount(data.getNum());

//        log.debug(" 重定向提交的表单详情 OrderFormInfoSubmitVo form ==============", form);
//        UserRegistVo ======OrderFormInfoSubmitVo(address=北京, invoice=0, invoictitle=, remark=22222222222)
/// address=null, invoice=null, invoictitle=null, remark=null)
        vo.setAddress(form.getAddress());
        vo.setInvoice(form.getInvoice());
        vo.setInvoictitle(form.getInvoictitle());
        vo.setRemark(form.getRemark());

        log.debug(" 经过封装后的经过封装后的 OrderInfoSubmitVo vo =============={}", vo);

        AppResponse<TOrder> resp = orderServiceFeign.saveOrder(vo);


        TOrder order = resp.getData();




        //  TODO
        //2.TODO支付


        return "member/minecrowdfunding";
    }


}
