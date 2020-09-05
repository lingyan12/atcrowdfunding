package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.MemorySummaryByAccountByEventName;
import com.atguigu.atcrowdfunding.bean.MemorySummaryByAccountByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemorySummaryByAccountByEventNameMapper {
    long countByExample(MemorySummaryByAccountByEventNameExample example);

    int deleteByExample(MemorySummaryByAccountByEventNameExample example);

    int insert(MemorySummaryByAccountByEventName record);

    int insertSelective(MemorySummaryByAccountByEventName record);

    List<MemorySummaryByAccountByEventName> selectByExample(MemorySummaryByAccountByEventNameExample example);

    int updateByExampleSelective(@Param("record") MemorySummaryByAccountByEventName record, @Param("example") MemorySummaryByAccountByEventNameExample example);

    int updateByExample(@Param("record") MemorySummaryByAccountByEventName record, @Param("example") MemorySummaryByAccountByEventNameExample example);
}