package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.MemorySummaryByThreadByEventName;
import com.atguigu.atcrowdfunding.bean.MemorySummaryByThreadByEventNameExample;
import com.atguigu.atcrowdfunding.bean.MemorySummaryByThreadByEventNameKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemorySummaryByThreadByEventNameMapper {
    long countByExample(MemorySummaryByThreadByEventNameExample example);

    int deleteByExample(MemorySummaryByThreadByEventNameExample example);

    int deleteByPrimaryKey(MemorySummaryByThreadByEventNameKey key);

    int insert(MemorySummaryByThreadByEventName record);

    int insertSelective(MemorySummaryByThreadByEventName record);

    List<MemorySummaryByThreadByEventName> selectByExample(MemorySummaryByThreadByEventNameExample example);

    MemorySummaryByThreadByEventName selectByPrimaryKey(MemorySummaryByThreadByEventNameKey key);

    int updateByExampleSelective(@Param("record") MemorySummaryByThreadByEventName record, @Param("example") MemorySummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") MemorySummaryByThreadByEventName record, @Param("example") MemorySummaryByThreadByEventNameExample example);

    int updateByPrimaryKeySelective(MemorySummaryByThreadByEventName record);

    int updateByPrimaryKey(MemorySummaryByThreadByEventName record);
}