package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SessionVariables;
import com.atguigu.atcrowdfunding.bean.SessionVariablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionVariablesMapper {
    long countByExample(SessionVariablesExample example);

    int deleteByExample(SessionVariablesExample example);

    int deleteByPrimaryKey(String variableName);

    int insert(SessionVariables record);

    int insertSelective(SessionVariables record);

    List<SessionVariables> selectByExample(SessionVariablesExample example);

    SessionVariables selectByPrimaryKey(String variableName);

    int updateByExampleSelective(@Param("record") SessionVariables record, @Param("example") SessionVariablesExample example);

    int updateByExample(@Param("record") SessionVariables record, @Param("example") SessionVariablesExample example);

    int updateByPrimaryKeySelective(SessionVariables record);

    int updateByPrimaryKey(SessionVariables record);
}