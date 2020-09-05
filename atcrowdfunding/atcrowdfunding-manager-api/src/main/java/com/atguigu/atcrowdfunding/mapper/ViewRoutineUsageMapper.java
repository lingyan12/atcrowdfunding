package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ViewRoutineUsage;
import com.atguigu.atcrowdfunding.bean.ViewRoutineUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewRoutineUsageMapper {
    long countByExample(ViewRoutineUsageExample example);

    int deleteByExample(ViewRoutineUsageExample example);

    int insert(ViewRoutineUsage record);

    int insertSelective(ViewRoutineUsage record);

    List<ViewRoutineUsage> selectByExample(ViewRoutineUsageExample example);

    int updateByExampleSelective(@Param("record") ViewRoutineUsage record, @Param("example") ViewRoutineUsageExample example);

    int updateByExample(@Param("record") ViewRoutineUsage record, @Param("example") ViewRoutineUsageExample example);
}