package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsWaitsSummaryGlobalByEventName;
import com.atguigu.atcrowdfunding.bean.EventsWaitsSummaryGlobalByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryGlobalByEventNameMapper {
    long countByExample(EventsWaitsSummaryGlobalByEventNameExample example);

    int deleteByExample(EventsWaitsSummaryGlobalByEventNameExample example);

    int deleteByPrimaryKey(String eventName);

    int insert(EventsWaitsSummaryGlobalByEventName record);

    int insertSelective(EventsWaitsSummaryGlobalByEventName record);

    List<EventsWaitsSummaryGlobalByEventName> selectByExample(EventsWaitsSummaryGlobalByEventNameExample example);

    EventsWaitsSummaryGlobalByEventName selectByPrimaryKey(String eventName);

    int updateByExampleSelective(@Param("record") EventsWaitsSummaryGlobalByEventName record, @Param("example") EventsWaitsSummaryGlobalByEventNameExample example);

    int updateByExample(@Param("record") EventsWaitsSummaryGlobalByEventName record, @Param("example") EventsWaitsSummaryGlobalByEventNameExample example);

    int updateByPrimaryKeySelective(EventsWaitsSummaryGlobalByEventName record);

    int updateByPrimaryKey(EventsWaitsSummaryGlobalByEventName record);
}