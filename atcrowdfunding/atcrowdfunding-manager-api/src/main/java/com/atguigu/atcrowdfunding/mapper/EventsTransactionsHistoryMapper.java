package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsTransactionsHistory;
import com.atguigu.atcrowdfunding.bean.EventsTransactionsHistoryExample;
import com.atguigu.atcrowdfunding.bean.EventsTransactionsHistoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsHistoryMapper {
    long countByExample(EventsTransactionsHistoryExample example);

    int deleteByExample(EventsTransactionsHistoryExample example);

    int deleteByPrimaryKey(EventsTransactionsHistoryKey key);

    int insert(EventsTransactionsHistory record);

    int insertSelective(EventsTransactionsHistory record);

    List<EventsTransactionsHistory> selectByExample(EventsTransactionsHistoryExample example);

    EventsTransactionsHistory selectByPrimaryKey(EventsTransactionsHistoryKey key);

    int updateByExampleSelective(@Param("record") EventsTransactionsHistory record, @Param("example") EventsTransactionsHistoryExample example);

    int updateByExample(@Param("record") EventsTransactionsHistory record, @Param("example") EventsTransactionsHistoryExample example);

    int updateByPrimaryKeySelective(EventsTransactionsHistory record);

    int updateByPrimaryKey(EventsTransactionsHistory record);
}