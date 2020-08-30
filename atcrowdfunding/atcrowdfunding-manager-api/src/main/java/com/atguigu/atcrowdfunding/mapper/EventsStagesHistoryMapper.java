package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStagesHistory;
import com.atguigu.atcrowdfunding.bean.EventsStagesHistoryExample;
import com.atguigu.atcrowdfunding.bean.EventsStagesHistoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesHistoryMapper {
    long countByExample(EventsStagesHistoryExample example);

    int deleteByExample(EventsStagesHistoryExample example);

    int deleteByPrimaryKey(EventsStagesHistoryKey key);

    int insert(EventsStagesHistory record);

    int insertSelective(EventsStagesHistory record);

    List<EventsStagesHistory> selectByExample(EventsStagesHistoryExample example);

    EventsStagesHistory selectByPrimaryKey(EventsStagesHistoryKey key);

    int updateByExampleSelective(@Param("record") EventsStagesHistory record, @Param("example") EventsStagesHistoryExample example);

    int updateByExample(@Param("record") EventsStagesHistory record, @Param("example") EventsStagesHistoryExample example);

    int updateByPrimaryKeySelective(EventsStagesHistory record);

    int updateByPrimaryKey(EventsStagesHistory record);
}