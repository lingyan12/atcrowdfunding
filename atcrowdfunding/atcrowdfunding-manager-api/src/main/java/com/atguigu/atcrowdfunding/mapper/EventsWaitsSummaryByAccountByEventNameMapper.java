package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsWaitsSummaryByAccountByEventName;
import com.atguigu.atcrowdfunding.bean.EventsWaitsSummaryByAccountByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryByAccountByEventNameMapper {
    long countByExample(EventsWaitsSummaryByAccountByEventNameExample example);

    int deleteByExample(EventsWaitsSummaryByAccountByEventNameExample example);

    int insert(EventsWaitsSummaryByAccountByEventName record);

    int insertSelective(EventsWaitsSummaryByAccountByEventName record);

    List<EventsWaitsSummaryByAccountByEventName> selectByExample(EventsWaitsSummaryByAccountByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsSummaryByAccountByEventName record, @Param("example") EventsWaitsSummaryByAccountByEventNameExample example);

    int updateByExample(@Param("record") EventsWaitsSummaryByAccountByEventName record, @Param("example") EventsWaitsSummaryByAccountByEventNameExample example);
}