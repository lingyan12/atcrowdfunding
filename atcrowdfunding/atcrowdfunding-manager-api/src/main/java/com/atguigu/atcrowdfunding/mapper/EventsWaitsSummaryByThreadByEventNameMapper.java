package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsWaitsSummaryByThreadByEventName;
import com.atguigu.atcrowdfunding.bean.EventsWaitsSummaryByThreadByEventNameExample;
import com.atguigu.atcrowdfunding.bean.EventsWaitsSummaryByThreadByEventNameKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryByThreadByEventNameMapper {
    long countByExample(EventsWaitsSummaryByThreadByEventNameExample example);

    int deleteByExample(EventsWaitsSummaryByThreadByEventNameExample example);

    int deleteByPrimaryKey(EventsWaitsSummaryByThreadByEventNameKey key);

    int insert(EventsWaitsSummaryByThreadByEventName record);

    int insertSelective(EventsWaitsSummaryByThreadByEventName record);

    List<EventsWaitsSummaryByThreadByEventName> selectByExample(EventsWaitsSummaryByThreadByEventNameExample example);

    EventsWaitsSummaryByThreadByEventName selectByPrimaryKey(EventsWaitsSummaryByThreadByEventNameKey key);

    int updateByExampleSelective(@Param("record") EventsWaitsSummaryByThreadByEventName record, @Param("example") EventsWaitsSummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") EventsWaitsSummaryByThreadByEventName record, @Param("example") EventsWaitsSummaryByThreadByEventNameExample example);

    int updateByPrimaryKeySelective(EventsWaitsSummaryByThreadByEventName record);

    int updateByPrimaryKey(EventsWaitsSummaryByThreadByEventName record);
}