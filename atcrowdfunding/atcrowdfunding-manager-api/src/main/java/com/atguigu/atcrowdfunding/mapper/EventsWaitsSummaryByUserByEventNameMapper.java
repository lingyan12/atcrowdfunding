package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsWaitsSummaryByUserByEventName;
import com.atguigu.atcrowdfunding.bean.EventsWaitsSummaryByUserByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryByUserByEventNameMapper {
    long countByExample(EventsWaitsSummaryByUserByEventNameExample example);

    int deleteByExample(EventsWaitsSummaryByUserByEventNameExample example);

    int insert(EventsWaitsSummaryByUserByEventName record);

    int insertSelective(EventsWaitsSummaryByUserByEventName record);

    List<EventsWaitsSummaryByUserByEventName> selectByExample(EventsWaitsSummaryByUserByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsSummaryByUserByEventName record, @Param("example") EventsWaitsSummaryByUserByEventNameExample example);

    int updateByExample(@Param("record") EventsWaitsSummaryByUserByEventName record, @Param("example") EventsWaitsSummaryByUserByEventNameExample example);
}