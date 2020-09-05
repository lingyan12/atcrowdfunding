package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsTransactionsSummaryByHostByEventName;
import com.atguigu.atcrowdfunding.bean.EventsTransactionsSummaryByHostByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsSummaryByHostByEventNameMapper {
    long countByExample(EventsTransactionsSummaryByHostByEventNameExample example);

    int deleteByExample(EventsTransactionsSummaryByHostByEventNameExample example);

    int insert(EventsTransactionsSummaryByHostByEventName record);

    int insertSelective(EventsTransactionsSummaryByHostByEventName record);

    List<EventsTransactionsSummaryByHostByEventName> selectByExample(EventsTransactionsSummaryByHostByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsTransactionsSummaryByHostByEventName record, @Param("example") EventsTransactionsSummaryByHostByEventNameExample example);

    int updateByExample(@Param("record") EventsTransactionsSummaryByHostByEventName record, @Param("example") EventsTransactionsSummaryByHostByEventNameExample example);
}