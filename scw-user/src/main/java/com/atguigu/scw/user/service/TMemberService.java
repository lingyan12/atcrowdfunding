package com.atguigu.scw.user.service;


import com.atguigu.scw.user.bean.TMember;
import com.atguigu.scw.user.bean.TMemberAddress;
import com.atguigu.scw.user.vo.req.UserRegistVo;
import com.atguigu.scw.user.vo.resp.UserRepVo;

import java.util.List;

public interface TMemberService {
    Integer saveTMember(UserRegistVo vo);

    UserRepVo getUserByLogin(String loginacct, String pwd);


    TMember getMemberById(Integer id);

    List<TMemberAddress> listAddress(Integer id);
}
