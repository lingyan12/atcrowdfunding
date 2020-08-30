package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsTransactionsSummaryByThreadByEventName;
import com.atguigu.atcrowdfunding.bean.EventsTransactionsSummaryByThreadByEventNameExample;
import com.atguigu.atcrowdfunding.bean.EventsTransactionsSummaryByThreadByEventNameKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsSummaryByThreadByEventNameMapper {
    long countByExample(EventsTransactionsSummaryByThreadByEventNameExample example);

    int deleteByExample(EventsTransactionsSummaryByThreadByEventNameExample example);

    int deleteByPrimaryKey(EventsTransactionsSummaryByThreadByEventNameKey key);

    int insert(EventsTransactionsSummaryByThreadByEventName record);

    int insertSelective(EventsTransactionsSummaryByThreadByEventName record);

    List<EventsTransactionsSummaryByThreadByEventName> selectByExample(EventsTransactionsSummaryByThreadByEventNameExample example);

    EventsTransactionsSummaryByThreadByEventName selectByPrimaryKey(EventsTransactionsSummaryByThreadByEventNameKey key);

    int updateByExampleSelective(@Param("record") EventsTransactionsSummaryByThreadByEventName record, @Param("example") EventsTransactionsSummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") EventsTransactionsSummaryByThreadByEventName record, @Param("example") EventsTransactionsSummaryByThreadByEventNameExample example);

    int updateByPrimaryKeySelective(EventsTransactionsSummaryByThreadByEventName record);

    int updateByPrimaryKey(EventsTransactionsSummaryByThreadByEventName record);
}