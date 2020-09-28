package com.atguigu.scw.order.service.impl;

import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.component.utils.AppDateUtils;
import com.atguigu.scw.enums.OrderStatusEnumes;
import com.atguigu.scw.order.bean.TOrder;
import com.atguigu.scw.order.bean.TReturn;
import com.atguigu.scw.order.mapper.TOrderMapper;
import com.atguigu.scw.order.service.TOrderService;
import com.atguigu.scw.order.service.TProjectServiceFeign;
import com.atguigu.scw.order.vo.OrderInfoSubmitVo;
import com.atguigu.scw.order.vo.resp.ProjectDetailVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Slf4j
@Service
public class TOrderServiceImpl implements TOrderService {

    @Autowired
    StringRedisTemplate redis;

    @Autowired
    TOrderMapper orderMapper;


    @Autowired
    TProjectServiceFeign projectServiceFeign;

    @Override
    public TOrder saveOrder(OrderInfoSubmitVo vo) {

        log.debug("public TOrder saveOrder(OrderInfoSubmitVo vo) =========={}" ,vo);

        TOrder order = new TOrder();



        String token = vo.getAccessToken();
        System.err.println("token ++++++++++++++" + token);

//        d95bac3d11614e2cb577bcfa93cdaf28
//
//        d95bac3d11614e2cb577bcfa93cdaf28
//
//        d95bac3d11614e2cb577bcfa93cdaf28




        String memberId = redis.opsForValue().get(token);

        System.err.println("memberId======="+ memberId);

        order.setMemberid(Integer.parseInt(memberId));

        order.setReturnid(vo.getReturnid());

        order.setOrdernum(UUID.randomUUID().toString().replace("-", ""));

        order.setCreatedate(AppDateUtils.getFormatTime());

        AppResponse<TReturn> resp = projectServiceFeign.returnInfo(vo.getProjectid());  //需要调用远程接口

        TReturn data = (TReturn)resp.getData();


        Integer totalMoney = vo.getRtncount() * data.getSupportmoney() + data.getFreight();  //     //  need  totalPrice

        System.err.println("totalMoney ============" + totalMoney);


        log.error("vo +++++++++++{}",vo);
        log.error("data +++++++++++{}",data);

        order.setMoney(totalMoney);

        order.setRtncount(vo.getRtncount());

        order.setStatus(OrderStatusEnumes.UNPAY.getCode() + "");

        order.setAddress(vo.getAddress());

        order.setInvoice(vo.getInvoice().toString());

        order.setInvoictitle(vo.getInvoictitle());

        order.setRemark(vo.getRemark());

        orderMapper.insertSelective(order);


        log.debug("public TOrder saveOrder(OrderInfoSubmitVo vo) 输出的order ============={}" , order);



        return order;
    }
}
