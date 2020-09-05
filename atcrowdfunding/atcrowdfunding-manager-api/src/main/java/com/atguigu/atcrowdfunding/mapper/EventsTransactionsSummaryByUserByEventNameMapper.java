package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsTransactionsSummaryByUserByEventName;
import com.atguigu.atcrowdfunding.bean.EventsTransactionsSummaryByUserByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsSummaryByUserByEventNameMapper {
    long countByExample(EventsTransactionsSummaryByUserByEventNameExample example);

    int deleteByExample(EventsTransactionsSummaryByUserByEventNameExample example);

    int insert(EventsTransactionsSummaryByUserByEventName record);

    int insertSelective(EventsTransactionsSummaryByUserByEventName record);

    List<EventsTransactionsSummaryByUserByEventName> selectByExample(EventsTransactionsSummaryByUserByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsTransactionsSummaryByUserByEventName record, @Param("example") EventsTransactionsSummaryByUserByEventNameExample example);

    int updateByExample(@Param("record") EventsTransactionsSummaryByUserByEventName record, @Param("example") EventsTransactionsSummaryByUserByEventNameExample example);
}