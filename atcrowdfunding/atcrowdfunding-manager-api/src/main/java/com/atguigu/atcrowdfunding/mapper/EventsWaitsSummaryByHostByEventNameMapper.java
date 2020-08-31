package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsWaitsSummaryByHostByEventName;
import com.atguigu.atcrowdfunding.bean.EventsWaitsSummaryByHostByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryByHostByEventNameMapper {
    long countByExample(EventsWaitsSummaryByHostByEventNameExample example);

    int deleteByExample(EventsWaitsSummaryByHostByEventNameExample example);

    int insert(EventsWaitsSummaryByHostByEventName record);

    int insertSelective(EventsWaitsSummaryByHostByEventName record);

    List<EventsWaitsSummaryByHostByEventName> selectByExample(EventsWaitsSummaryByHostByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsSummaryByHostByEventName record, @Param("example") EventsWaitsSummaryByHostByEventNameExample example);

    int updateByExample(@Param("record") EventsWaitsSummaryByHostByEventName record, @Param("example") EventsWaitsSummaryByHostByEventNameExample example);
}