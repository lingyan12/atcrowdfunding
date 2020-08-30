package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStatementsSummaryByUserByEventName;
import com.atguigu.atcrowdfunding.bean.EventsStatementsSummaryByUserByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByUserByEventNameMapper {
    long countByExample(EventsStatementsSummaryByUserByEventNameExample example);

    int deleteByExample(EventsStatementsSummaryByUserByEventNameExample example);

    int insert(EventsStatementsSummaryByUserByEventName record);

    int insertSelective(EventsStatementsSummaryByUserByEventName record);

    List<EventsStatementsSummaryByUserByEventName> selectByExample(EventsStatementsSummaryByUserByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByUserByEventName record, @Param("example") EventsStatementsSummaryByUserByEventNameExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryByUserByEventName record, @Param("example") EventsStatementsSummaryByUserByEventNameExample example);
}