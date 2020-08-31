package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsTransactionsHistoryLong;
import com.atguigu.atcrowdfunding.bean.EventsTransactionsHistoryLongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsHistoryLongMapper {
    long countByExample(EventsTransactionsHistoryLongExample example);

    int deleteByExample(EventsTransactionsHistoryLongExample example);

    int insert(EventsTransactionsHistoryLong record);

    int insertSelective(EventsTransactionsHistoryLong record);

    List<EventsTransactionsHistoryLong> selectByExample(EventsTransactionsHistoryLongExample example);

    int updateByExampleSelective(@Param("record") EventsTransactionsHistoryLong record, @Param("example") EventsTransactionsHistoryLongExample example);

    int updateByExample(@Param("record") EventsTransactionsHistoryLong record, @Param("example") EventsTransactionsHistoryLongExample example);
}