package com.atguigu.scw.user.service.exp;


import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.user.service.TProjectServiceFeign;
import com.atguigu.scw.user.vo.resp.ProjectDetailVo;
import com.atguigu.scw.user.vo.resp.ProjectVo;
import com.atguigu.scw.user.vo.resp.ReturnPayConfirmVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
@Slf4j
@Component
public class TProjectServiceFeignExceptionHandler implements TProjectServiceFeign {


    @Override
    public AppResponse<List<ProjectVo>> all() {

        AppResponse<List<ProjectVo>> fail = AppResponse.fail(null);
        fail.setMsg("远程TProjectServiceFeignExceptionHandler失败");

        log.error("远程TProjectServiceFeignExceptionHandler失败");

        return fail;
    }

    @Override
    public AppResponse<ProjectDetailVo> detailsInfo(Integer projectId) {

        AppResponse<ProjectDetailVo> fail = AppResponse.fail(null);
        fail.setMsg("远程TProjectServiceFeignExceptionHandler失败");

        log.error("远程TProjectServiceFeignExceptionHandler失败");

        return fail;
    }

    @Override
    public AppResponse<ReturnPayConfirmVo> returnInfo(Integer projectId, Integer returnId) {
        AppResponse<ReturnPayConfirmVo> fail = AppResponse.fail(null);
        fail.setMsg("远程returnInfo失败");

        log.error("远程returnInfo失败");

        return fail;
    }


    public AppResponse<ReturnPayConfirmVo> confirmReturn(Integer returnId, Integer projectId) {
        AppResponse<ReturnPayConfirmVo> fail = AppResponse.fail(null);
        fail.setMsg("远程confirmReturn失败");

        log.error("远程confirmReturn失败");

        return fail;
    }


}
