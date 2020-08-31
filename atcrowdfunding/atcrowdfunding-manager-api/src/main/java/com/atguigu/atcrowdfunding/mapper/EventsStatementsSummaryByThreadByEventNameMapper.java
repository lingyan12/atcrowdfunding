package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStatementsSummaryByThreadByEventName;
import com.atguigu.atcrowdfunding.bean.EventsStatementsSummaryByThreadByEventNameExample;
import com.atguigu.atcrowdfunding.bean.EventsStatementsSummaryByThreadByEventNameKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByThreadByEventNameMapper {
    long countByExample(EventsStatementsSummaryByThreadByEventNameExample example);

    int deleteByExample(EventsStatementsSummaryByThreadByEventNameExample example);

    int deleteByPrimaryKey(EventsStatementsSummaryByThreadByEventNameKey key);

    int insert(EventsStatementsSummaryByThreadByEventName record);

    int insertSelective(EventsStatementsSummaryByThreadByEventName record);

    List<EventsStatementsSummaryByThreadByEventName> selectByExample(EventsStatementsSummaryByThreadByEventNameExample example);

    EventsStatementsSummaryByThreadByEventName selectByPrimaryKey(EventsStatementsSummaryByThreadByEventNameKey key);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByThreadByEventName record, @Param("example") EventsStatementsSummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryByThreadByEventName record, @Param("example") EventsStatementsSummaryByThreadByEventNameExample example);

    int updateByPrimaryKeySelective(EventsStatementsSummaryByThreadByEventName record);

    int updateByPrimaryKey(EventsStatementsSummaryByThreadByEventName record);
}