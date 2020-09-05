package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.GlobalVariables;
import com.atguigu.atcrowdfunding.bean.GlobalVariablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GlobalVariablesMapper {
    long countByExample(GlobalVariablesExample example);

    int deleteByExample(GlobalVariablesExample example);

    int deleteByPrimaryKey(String variableName);

    int insert(GlobalVariables record);

    int insertSelective(GlobalVariables record);

    List<GlobalVariables> selectByExample(GlobalVariablesExample example);

    GlobalVariables selectByPrimaryKey(String variableName);

    int updateByExampleSelective(@Param("record") GlobalVariables record, @Param("example") GlobalVariablesExample example);

    int updateByExample(@Param("record") GlobalVariables record, @Param("example") GlobalVariablesExample example);

    int updateByPrimaryKeySelective(GlobalVariables record);

    int updateByPrimaryKey(GlobalVariables record);
}