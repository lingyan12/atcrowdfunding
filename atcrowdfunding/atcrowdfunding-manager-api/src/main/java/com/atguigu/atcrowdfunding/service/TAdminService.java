package com.atguigu.atcrowdfunding.service;



import com.atguigu.atcrowdfunding.bean.TAdmin;
import com.github.pagehelper.PageInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface TAdminService {
    TAdmin getTAdminByLogin(HashMap<String, Object> map);


    PageInfo<TAdmin> listAdminPage(Map<String, Object> paramMap);

    void saveTAdmin(TAdmin admin);

    TAdmin getTAdminById(Integer id);


    void updateTAdmin(TAdmin admin);

    void delTAdmin(Integer id);

    void deleteBatch(List<Integer> idList);
}
