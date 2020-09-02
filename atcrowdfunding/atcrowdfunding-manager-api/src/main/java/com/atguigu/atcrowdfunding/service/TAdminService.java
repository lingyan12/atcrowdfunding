package com.atguigu.atcrowdfunding.service;

import com.atguigu.atcrowdfunding.bean.TAdmin;

import java.util.HashMap;


public interface TAdminService {
    TAdmin getTAdminByLogin(HashMap<String, Object> map);
}
