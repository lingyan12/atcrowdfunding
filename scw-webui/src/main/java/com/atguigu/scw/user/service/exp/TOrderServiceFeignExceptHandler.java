package com.atguigu.scw.user.service.exp;

import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.user.bean.TOrder;
import com.atguigu.scw.user.service.TOrderServiceFeign;
import com.atguigu.scw.user.vo.req.OrderInfoSubmitVo;
import com.atguigu.scw.user.vo.resp.UserRepVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class TOrderServiceFeignExceptHandler implements TOrderServiceFeign {


    @Override
    public AppResponse<TOrder> saveOrder(OrderInfoSubmitVo vo) {


        AppResponse<TOrder> fail = AppResponse.fail(null);
        fail.setMsg("saveOrder远程调用失败");

        log.error("saveOrder调用远程失败");

        return fail;
    }
}

