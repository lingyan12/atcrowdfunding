package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsWaitsCurrent;
import com.atguigu.atcrowdfunding.bean.EventsWaitsCurrentExample;
import com.atguigu.atcrowdfunding.bean.EventsWaitsCurrentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsCurrentMapper {
    long countByExample(EventsWaitsCurrentExample example);

    int deleteByExample(EventsWaitsCurrentExample example);

    int deleteByPrimaryKey(EventsWaitsCurrentKey key);

    int insert(EventsWaitsCurrent record);

    int insertSelective(EventsWaitsCurrent record);

    List<EventsWaitsCurrent> selectByExample(EventsWaitsCurrentExample example);

    EventsWaitsCurrent selectByPrimaryKey(EventsWaitsCurrentKey key);

    int updateByExampleSelective(@Param("record") EventsWaitsCurrent record, @Param("example") EventsWaitsCurrentExample example);

    int updateByExample(@Param("record") EventsWaitsCurrent record, @Param("example") EventsWaitsCurrentExample example);

    int updateByPrimaryKeySelective(EventsWaitsCurrent record);

    int updateByPrimaryKey(EventsWaitsCurrent record);
}