package com.atguigu.atcrowdfunding.service.impl;
import com.atguigu.atcrowdfunding.bean.TAdmin;
import com.atguigu.atcrowdfunding.bean.TAdminExample;
import com.atguigu.atcrowdfunding.mapper.TAdminMapper;


import com.atguigu.atcrowdfunding.service.TAdminService;
import com.atguigu.atcrowdfunding.util.Const;
import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.atcrowdfunding.exception.LoginException ;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class TAdminServiceImpl implements TAdminService {
    @Autowired
    TAdminMapper adminMapper;

    @Override
    public TAdmin getTAdminByLogin(HashMap<String, Object> map) throws LoginException {
        //密码加密


//        //查询用户
        String loginacct = (String) map.get("loginacct");
        String userpwd = (String) map.get("userpwd");

        //判断用户是否null
        TAdminExample ex = new TAdminExample(); //创建一个 条件查询的example对象
        ex.createCriteria().andLoginacctEqualTo(loginacct);

        List<TAdmin> list = adminMapper.selectByExample(ex);




////if else 写的不够优雅
//        if (list!=null && list.size()>0){
//            TAdmin admin = list.get(0);
//            //密码是否一致
//
//            if(admin.getLoginacct().equals(userpwd)){
//                //返回结果
//                return admin;
//            }else {
//                throw new LoginException(Const.LOGIN_USERPSWD_ERROR);
//            }
//        }else {
//            throw new LoginException(Const.LOGIN_USERPSWD_ERROR);
//
//        }


                //如果用户名不对
                if (list==null || list.size()==0){
                    throw new LoginException(Const.LOGIN_LOGINACCT_ERROR);
                }

                //判断密码
                TAdmin admin = list.get(0);
                if (!admin.getUserpswd().equals(userpwd)){
                    throw new LoginException(Const.LOGIN_USERPSWD_ERROR);
                }

                return admin;








    }
}
