package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.TablesPriv;
import com.atguigu.atcrowdfunding.bean.TablesPrivExample;
import com.atguigu.atcrowdfunding.bean.TablesPrivKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablesPrivMapper {
    long countByExample(TablesPrivExample example);

    int deleteByExample(TablesPrivExample example);

    int deleteByPrimaryKey(TablesPrivKey key);

    int insert(TablesPriv record);

    int insertSelective(TablesPriv record);

    List<TablesPriv> selectByExample(TablesPrivExample example);

    TablesPriv selectByPrimaryKey(TablesPrivKey key);

    int updateByExampleSelective(@Param("record") TablesPriv record, @Param("example") TablesPrivExample example);

    int updateByExample(@Param("record") TablesPriv record, @Param("example") TablesPrivExample example);

    int updateByPrimaryKeySelective(TablesPriv record);

    int updateByPrimaryKey(TablesPriv record);
}