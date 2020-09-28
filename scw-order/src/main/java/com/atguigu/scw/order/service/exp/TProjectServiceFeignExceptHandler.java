package com.atguigu.scw.order.service.exp;

import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.order.bean.TReturn;
import com.atguigu.scw.order.service.TProjectServiceFeign;
import com.atguigu.scw.order.vo.resp.ProjectDetailVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Slf4j
@Component
public class TProjectServiceFeignExceptHandler implements TProjectServiceFeign {


    @Override
    public AppResponse<TReturn> returnInfo(Integer returnId) {


        log.error("package com.atguigu.scw.order.service.exp;     detailsInfo 远程调用接口是失败 ");

        AppResponse<TReturn> fail = AppResponse.fail(null);
        fail.setMsg("package com.atguigu.scw.order.service.exp;     detailsInfo 远程调用接口是失败");


        return fail;
    }
}
