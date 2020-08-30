package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.WaitClassesGlobalByAvgLatency;
import com.atguigu.atcrowdfunding.bean.WaitClassesGlobalByAvgLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitClassesGlobalByAvgLatencyMapper {
    long countByExample(WaitClassesGlobalByAvgLatencyExample example);

    int deleteByExample(WaitClassesGlobalByAvgLatencyExample example);

    int insert(WaitClassesGlobalByAvgLatency record);

    int insertSelective(WaitClassesGlobalByAvgLatency record);

    List<WaitClassesGlobalByAvgLatency> selectByExample(WaitClassesGlobalByAvgLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitClassesGlobalByAvgLatency record, @Param("example") WaitClassesGlobalByAvgLatencyExample example);

    int updateByExample(@Param("record") WaitClassesGlobalByAvgLatency record, @Param("example") WaitClassesGlobalByAvgLatencyExample example);
}