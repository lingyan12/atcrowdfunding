package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XWaitsGlobalByLatency;
import com.atguigu.atcrowdfunding.bean.XWaitsGlobalByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitsGlobalByLatencyMapper {
    long countByExample(XWaitsGlobalByLatencyExample example);

    int deleteByExample(XWaitsGlobalByLatencyExample example);

    int insert(XWaitsGlobalByLatency record);

    int insertSelective(XWaitsGlobalByLatency record);

    List<XWaitsGlobalByLatency> selectByExample(XWaitsGlobalByLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitsGlobalByLatency record, @Param("example") XWaitsGlobalByLatencyExample example);

    int updateByExample(@Param("record") XWaitsGlobalByLatency record, @Param("example") XWaitsGlobalByLatencyExample example);
}