package com.atguigu.atcrowdfunding.service.impl;

import com.atguigu.atcrowdfunding.bean.TRole;
import com.atguigu.atcrowdfunding.bean.TRoleExample;
import com.atguigu.atcrowdfunding.mapper.TRoleMapper;
import com.atguigu.atcrowdfunding.service.TRoleService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;


@Service
public class TRoleServiceImpl implements TRoleService {

    @Autowired
    TRoleMapper roleMapper;


    @Override
    public PageInfo<TRole> listRolePage(Map<String ,Object> map) {


        String condition = (String) map.get("condition");
        List<TRole> list = null;


        if (StringUtils.isEmpty(condition)){

         list = roleMapper.selectByExample(null);
        }else {
            TRoleExample example = new TRoleExample();
            example.createCriteria().andNameLike("%"+condition+"%");
            list = roleMapper.selectByExample(example);

        }

        PageInfo<TRole> page =  new PageInfo(list , 5);


        return page;
    }

    @Override
    public void saveTRole(TRole role) {
        roleMapper.insertSelective(role);
    }
}
