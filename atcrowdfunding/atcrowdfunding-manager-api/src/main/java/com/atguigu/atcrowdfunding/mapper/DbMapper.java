package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Db;
import com.atguigu.atcrowdfunding.bean.DbExample;
import com.atguigu.atcrowdfunding.bean.DbKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbMapper {
    long countByExample(DbExample example);

    int deleteByExample(DbExample example);

    int deleteByPrimaryKey(DbKey key);

    int insert(Db record);

    int insertSelective(Db record);

    List<Db> selectByExample(DbExample example);

    Db selectByPrimaryKey(DbKey key);

    int updateByExampleSelective(@Param("record") Db record, @Param("example") DbExample example);

    int updateByExample(@Param("record") Db record, @Param("example") DbExample example);

    int updateByPrimaryKeySelective(Db record);

    int updateByPrimaryKey(Db record);
}