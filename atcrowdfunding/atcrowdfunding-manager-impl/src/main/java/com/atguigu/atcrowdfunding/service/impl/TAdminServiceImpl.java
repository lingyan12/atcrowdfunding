package com.atguigu.atcrowdfunding.service.impl;

import com.atguigu.atcrowdfunding.bean.TAdmin;
import com.atguigu.atcrowdfunding.bean.TAdminExample;
import com.atguigu.atcrowdfunding.mapper.TAdminMapper;
import com.atguigu.atcrowdfunding.service.TAdminService;
import com.atguigu.atcrowdfunding.util.AppDateUtils;
import com.atguigu.atcrowdfunding.util.Const;


import com.atguigu.atcrowdfunding.exception.LoginException ;
import com.atguigu.atcrowdfunding.util.MD5Util;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        System.err.println("判断密码--------------");
                TAdmin admin = list.get(0);
        System.out.println(userpwd);
        System.err.println("admin: " + admin.getUserpswd());
        System.err.println("admin: " + MD5Util.digest(userpwd));
                if (!admin.getUserpswd().equals(MD5Util.digest(userpwd))){
                    throw new LoginException(Const.LOGIN_USERPSWD_ERROR);
                }

                return admin;








    }

    @Override
    public PageInfo<TAdmin> listAdminPage(Map<String, Object> paramMap) {

        TAdminExample example = new TAdminExample();

        List<TAdmin> list = adminMapper.selectByExample(example);

        PageInfo<TAdmin> page = new PageInfo<>(list , 5);


        return page;
    }

    @Override
    public void saveTAdmin(TAdmin admin) {
        admin.setUserpswd(MD5Util.digest(Const.DEFAULT_USERPSWD));

        admin.setCreatetime(AppDateUtils.getFormatTime());

        adminMapper.insertSelective(admin); //动态sql 有选择性的保存
    }

    @Override
    public TAdmin getTAdminById(Integer id) {



        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateTAdmin(TAdmin admin) {

        admin.setUserpswd(MD5Util.digest(Const.DEFAULT_USERPSWD));

        adminMapper.updateByPrimaryKey(admin);


    }

    @Override
    public void delTAdmin(Integer id   ) {

        adminMapper.deleteByPrimaryKey(id);

    }


}
