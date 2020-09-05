package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.VariablesByThread;
import com.atguigu.atcrowdfunding.bean.VariablesByThreadExample;
import com.atguigu.atcrowdfunding.bean.VariablesByThreadKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VariablesByThreadMapper {
    long countByExample(VariablesByThreadExample example);

    int deleteByExample(VariablesByThreadExample example);

    int deleteByPrimaryKey(VariablesByThreadKey key);

    int insert(VariablesByThread record);

    int insertSelective(VariablesByThread record);

    List<VariablesByThread> selectByExample(VariablesByThreadExample example);

    VariablesByThread selectByPrimaryKey(VariablesByThreadKey key);

    int updateByExampleSelective(@Param("record") VariablesByThread record, @Param("example") VariablesByThreadExample example);

    int updateByExample(@Param("record") VariablesByThread record, @Param("example") VariablesByThreadExample example);

    int updateByPrimaryKeySelective(VariablesByThread record);

    int updateByPrimaryKey(VariablesByThread record);
}