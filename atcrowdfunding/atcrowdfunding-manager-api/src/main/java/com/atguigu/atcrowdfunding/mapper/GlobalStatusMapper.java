package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.GlobalStatus;
import com.atguigu.atcrowdfunding.bean.GlobalStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GlobalStatusMapper {
    long countByExample(GlobalStatusExample example);

    int deleteByExample(GlobalStatusExample example);

    int deleteByPrimaryKey(String variableName);

    int insert(GlobalStatus record);

    int insertSelective(GlobalStatus record);

    List<GlobalStatus> selectByExample(GlobalStatusExample example);

    GlobalStatus selectByPrimaryKey(String variableName);

    int updateByExampleSelective(@Param("record") GlobalStatus record, @Param("example") GlobalStatusExample example);

    int updateByExample(@Param("record") GlobalStatus record, @Param("example") GlobalStatusExample example);

    int updateByPrimaryKeySelective(GlobalStatus record);

    int updateByPrimaryKey(GlobalStatus record);
}