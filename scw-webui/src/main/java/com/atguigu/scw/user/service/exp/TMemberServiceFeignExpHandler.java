package com.atguigu.scw.user.service.exp;

import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.user.bean.TMember;
import com.atguigu.scw.user.service.TMemberServiceFeign;
import com.atguigu.scw.user.vo.resp.UserAddressVo;
import com.atguigu.scw.user.vo.resp.UserRepVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;


@Slf4j
@Component
public class TMemberServiceFeignExpHandler implements TMemberServiceFeign {


    @Override
    public AppResponse<UserRepVo> login(String loginacct, String pwd) {

        AppResponse<UserRepVo> fail = AppResponse.fail(null);
        fail.setMsg("login远程调用失败");

        log.error("login调用远程失败");

        return fail;
    }

    @Override
    public AppResponse<TMember> getMemberById(Integer id) {

        AppResponse<TMember> fail = AppResponse.fail(null);
        fail.setMsg("getMemberById远程调用失败");

        log.error("getMemberById调用远程失败");

        return fail;

    }

    @Override
    public AppResponse<List<UserAddressVo>> address(String accessToken) {
        AppResponse<List<UserAddressVo>> fail = AppResponse.fail(null);
        fail.setMsg("address远程调用失败");

        log.error("address调用远程失败");

        return fail;

    }
}
