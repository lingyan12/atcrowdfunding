package com.atguigu.scw.project.service.exp;

import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.project.bean.TMember;
import com.atguigu.scw.project.service.TmemberServiceFeign;
import org.springframework.stereotype.Component;

@Component
public class TmemberServiceFeignExceptionHandler implements TmemberServiceFeign {
    @Override
    public AppResponse<TMember> getMemberById(Integer id) {

        System.err.println("getMemberById id=============" + id);

        AppResponse<TMember> fail = AppResponse.fail(null);
        fail.setMsg("TmemberServiceFeignExceptionHandler implements TmemberServiceFeign 调用失败");

        return fail;
    }
}
