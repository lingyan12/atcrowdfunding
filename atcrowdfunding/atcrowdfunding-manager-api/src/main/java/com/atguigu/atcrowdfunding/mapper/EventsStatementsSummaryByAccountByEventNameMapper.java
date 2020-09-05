package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStatementsSummaryByAccountByEventName;
import com.atguigu.atcrowdfunding.bean.EventsStatementsSummaryByAccountByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByAccountByEventNameMapper {
    long countByExample(EventsStatementsSummaryByAccountByEventNameExample example);

    int deleteByExample(EventsStatementsSummaryByAccountByEventNameExample example);

    int insert(EventsStatementsSummaryByAccountByEventName record);

    int insertSelective(EventsStatementsSummaryByAccountByEventName record);

    List<EventsStatementsSummaryByAccountByEventName> selectByExample(EventsStatementsSummaryByAccountByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByAccountByEventName record, @Param("example") EventsStatementsSummaryByAccountByEventNameExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryByAccountByEventName record, @Param("example") EventsStatementsSummaryByAccountByEventNameExample example);
}