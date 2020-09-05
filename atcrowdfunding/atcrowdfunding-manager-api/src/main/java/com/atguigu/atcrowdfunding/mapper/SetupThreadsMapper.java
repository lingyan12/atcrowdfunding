package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SetupThreads;
import com.atguigu.atcrowdfunding.bean.SetupThreadsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupThreadsMapper {
    long countByExample(SetupThreadsExample example);

    int deleteByExample(SetupThreadsExample example);

    int deleteByPrimaryKey(String name);

    int insert(SetupThreads record);

    int insertSelective(SetupThreads record);

    List<SetupThreads> selectByExampleWithBLOBs(SetupThreadsExample example);

    List<SetupThreads> selectByExample(SetupThreadsExample example);

    SetupThreads selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") SetupThreads record, @Param("example") SetupThreadsExample example);

    int updateByExampleWithBLOBs(@Param("record") SetupThreads record, @Param("example") SetupThreadsExample example);

    int updateByExample(@Param("record") SetupThreads record, @Param("example") SetupThreadsExample example);

    int updateByPrimaryKeySelective(SetupThreads record);

    int updateByPrimaryKeyWithBLOBs(SetupThreads record);

    int updateByPrimaryKey(SetupThreads record);
}