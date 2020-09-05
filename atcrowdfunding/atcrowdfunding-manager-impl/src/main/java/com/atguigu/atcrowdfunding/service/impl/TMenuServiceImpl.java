package com.atguigu.atcrowdfunding.service.impl;


import com.atguigu.atcrowdfunding.bean.TMenu;
import com.atguigu.atcrowdfunding.mapper.TMenuMapper;
import com.atguigu.atcrowdfunding.service.TMenuService;
import org.junit.jupiter.api.DynamicTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class TMenuServiceImpl implements TMenuService {



    @Autowired
    TMenuMapper menuMapper;

     Logger log = LoggerFactory.getLogger(TMenuServiceImpl.class);


    @Override
    public List<TMenu> listMenuAll() {

        List<TMenu> menuList = new ArrayList<TMenu>();  //只存放父 但是children赋值

        Map<Integer,TMenu> map = new HashMap<>();

        List<TMenu> tMenus = menuMapper.selectByExample(null);
        for (TMenu tMenu : tMenus) {
            if (tMenu.getPid() == 0){
                menuList.add(tMenu);
                map.put(tMenu.getId() , tMenu);
            }
        }

        for (TMenu tMenu : tMenus) {
            if (tMenu.getPid() != 0){
                 Integer pid= tMenu.getPid();
                TMenu parent = map.get(pid);//根据子pid 查询复id 然后塞进父 对象的 children属性
                parent.getChildren().add(tMenu);
//                List<TMenu> children = (List<TMenu>) parent;
//                children.add()
            }
        }
        System.err.println("菜单等于={}");
        log.debug("菜单等于={}",menuList);


        return menuList;
    }
}
