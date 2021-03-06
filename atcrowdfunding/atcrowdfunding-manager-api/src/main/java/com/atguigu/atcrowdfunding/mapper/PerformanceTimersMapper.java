package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.PerformanceTimers;
import com.atguigu.atcrowdfunding.bean.PerformanceTimersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerformanceTimersMapper {
    long countByExample(PerformanceTimersExample example);

    int deleteByExample(PerformanceTimersExample example);

    int insert(PerformanceTimers record);

    int insertSelective(PerformanceTimers record);

    List<PerformanceTimers> selectByExample(PerformanceTimersExample example);

    int updateByExampleSelective(@Param("record") PerformanceTimers record, @Param("example") PerformanceTimersExample example);

    int updateByExample(@Param("record") PerformanceTimers record, @Param("example") PerformanceTimersExample example);
}