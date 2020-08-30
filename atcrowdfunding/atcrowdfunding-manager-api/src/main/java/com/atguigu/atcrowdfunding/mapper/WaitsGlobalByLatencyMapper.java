package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.WaitsGlobalByLatency;
import com.atguigu.atcrowdfunding.bean.WaitsGlobalByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitsGlobalByLatencyMapper {
    long countByExample(WaitsGlobalByLatencyExample example);

    int deleteByExample(WaitsGlobalByLatencyExample example);

    int insert(WaitsGlobalByLatency record);

    int insertSelective(WaitsGlobalByLatency record);

    List<WaitsGlobalByLatency> selectByExample(WaitsGlobalByLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitsGlobalByLatency record, @Param("example") WaitsGlobalByLatencyExample example);

    int updateByExample(@Param("record") WaitsGlobalByLatency record, @Param("example") WaitsGlobalByLatencyExample example);
}