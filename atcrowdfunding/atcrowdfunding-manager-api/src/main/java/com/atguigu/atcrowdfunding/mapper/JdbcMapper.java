package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Jdbc;
import com.atguigu.atcrowdfunding.bean.JdbcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JdbcMapper {
    long countByExample(JdbcExample example);

    int deleteByExample(JdbcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jdbc record);

    int insertSelective(Jdbc record);

    List<Jdbc> selectByExample(JdbcExample example);

    Jdbc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jdbc record, @Param("example") JdbcExample example);

    int updateByExample(@Param("record") Jdbc record, @Param("example") JdbcExample example);

    int updateByPrimaryKeySelective(Jdbc record);

    int updateByPrimaryKey(Jdbc record);
}