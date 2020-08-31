package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStagesSummaryByThreadByEventName;
import com.atguigu.atcrowdfunding.bean.EventsStagesSummaryByThreadByEventNameExample;
import com.atguigu.atcrowdfunding.bean.EventsStagesSummaryByThreadByEventNameKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesSummaryByThreadByEventNameMapper {
    long countByExample(EventsStagesSummaryByThreadByEventNameExample example);

    int deleteByExample(EventsStagesSummaryByThreadByEventNameExample example);

    int deleteByPrimaryKey(EventsStagesSummaryByThreadByEventNameKey key);

    int insert(EventsStagesSummaryByThreadByEventName record);

    int insertSelective(EventsStagesSummaryByThreadByEventName record);

    List<EventsStagesSummaryByThreadByEventName> selectByExample(EventsStagesSummaryByThreadByEventNameExample example);

    EventsStagesSummaryByThreadByEventName selectByPrimaryKey(EventsStagesSummaryByThreadByEventNameKey key);

    int updateByExampleSelective(@Param("record") EventsStagesSummaryByThreadByEventName record, @Param("example") EventsStagesSummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") EventsStagesSummaryByThreadByEventName record, @Param("example") EventsStagesSummaryByThreadByEventNameExample example);

    int updateByPrimaryKeySelective(EventsStagesSummaryByThreadByEventName record);

    int updateByPrimaryKey(EventsStagesSummaryByThreadByEventName record);
}