package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStagesSummaryByHostByEventName;
import com.atguigu.atcrowdfunding.bean.EventsStagesSummaryByHostByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesSummaryByHostByEventNameMapper {
    long countByExample(EventsStagesSummaryByHostByEventNameExample example);

    int deleteByExample(EventsStagesSummaryByHostByEventNameExample example);

    int insert(EventsStagesSummaryByHostByEventName record);

    int insertSelective(EventsStagesSummaryByHostByEventName record);

    List<EventsStagesSummaryByHostByEventName> selectByExample(EventsStagesSummaryByHostByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsStagesSummaryByHostByEventName record, @Param("example") EventsStagesSummaryByHostByEventNameExample example);

    int updateByExample(@Param("record") EventsStagesSummaryByHostByEventName record, @Param("example") EventsStagesSummaryByHostByEventNameExample example);
}