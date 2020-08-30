package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.MemorySummaryGlobalByEventName;
import com.atguigu.atcrowdfunding.bean.MemorySummaryGlobalByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemorySummaryGlobalByEventNameMapper {
    long countByExample(MemorySummaryGlobalByEventNameExample example);

    int deleteByExample(MemorySummaryGlobalByEventNameExample example);

    int deleteByPrimaryKey(String eventName);

    int insert(MemorySummaryGlobalByEventName record);

    int insertSelective(MemorySummaryGlobalByEventName record);

    List<MemorySummaryGlobalByEventName> selectByExample(MemorySummaryGlobalByEventNameExample example);

    MemorySummaryGlobalByEventName selectByPrimaryKey(String eventName);

    int updateByExampleSelective(@Param("record") MemorySummaryGlobalByEventName record, @Param("example") MemorySummaryGlobalByEventNameExample example);

    int updateByExample(@Param("record") MemorySummaryGlobalByEventName record, @Param("example") MemorySummaryGlobalByEventNameExample example);

    int updateByPrimaryKeySelective(MemorySummaryGlobalByEventName record);

    int updateByPrimaryKey(MemorySummaryGlobalByEventName record);
}