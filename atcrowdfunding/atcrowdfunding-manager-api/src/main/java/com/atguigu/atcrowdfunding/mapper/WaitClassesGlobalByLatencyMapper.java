package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.WaitClassesGlobalByLatency;
import com.atguigu.atcrowdfunding.bean.WaitClassesGlobalByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitClassesGlobalByLatencyMapper {
    long countByExample(WaitClassesGlobalByLatencyExample example);

    int deleteByExample(WaitClassesGlobalByLatencyExample example);

    int insert(WaitClassesGlobalByLatency record);

    int insertSelective(WaitClassesGlobalByLatency record);

    List<WaitClassesGlobalByLatency> selectByExample(WaitClassesGlobalByLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitClassesGlobalByLatency record, @Param("example") WaitClassesGlobalByLatencyExample example);

    int updateByExample(@Param("record") WaitClassesGlobalByLatency record, @Param("example") WaitClassesGlobalByLatencyExample example);
}