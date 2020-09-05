package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsWaitsHistory;
import com.atguigu.atcrowdfunding.bean.EventsWaitsHistoryExample;
import com.atguigu.atcrowdfunding.bean.EventsWaitsHistoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsHistoryMapper {
    long countByExample(EventsWaitsHistoryExample example);

    int deleteByExample(EventsWaitsHistoryExample example);

    int deleteByPrimaryKey(EventsWaitsHistoryKey key);

    int insert(EventsWaitsHistory record);

    int insertSelective(EventsWaitsHistory record);

    List<EventsWaitsHistory> selectByExample(EventsWaitsHistoryExample example);

    EventsWaitsHistory selectByPrimaryKey(EventsWaitsHistoryKey key);

    int updateByExampleSelective(@Param("record") EventsWaitsHistory record, @Param("example") EventsWaitsHistoryExample example);

    int updateByExample(@Param("record") EventsWaitsHistory record, @Param("example") EventsWaitsHistoryExample example);

    int updateByPrimaryKeySelective(EventsWaitsHistory record);

    int updateByPrimaryKey(EventsWaitsHistory record);
}