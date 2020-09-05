package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsWaitsHistoryLong;
import com.atguigu.atcrowdfunding.bean.EventsWaitsHistoryLongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsHistoryLongMapper {
    long countByExample(EventsWaitsHistoryLongExample example);

    int deleteByExample(EventsWaitsHistoryLongExample example);

    int insert(EventsWaitsHistoryLong record);

    int insertSelective(EventsWaitsHistoryLong record);

    List<EventsWaitsHistoryLong> selectByExample(EventsWaitsHistoryLongExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsHistoryLong record, @Param("example") EventsWaitsHistoryLongExample example);

    int updateByExample(@Param("record") EventsWaitsHistoryLong record, @Param("example") EventsWaitsHistoryLongExample example);
}