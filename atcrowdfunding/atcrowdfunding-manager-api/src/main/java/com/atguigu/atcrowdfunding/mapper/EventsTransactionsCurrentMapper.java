package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsTransactionsCurrent;
import com.atguigu.atcrowdfunding.bean.EventsTransactionsCurrentExample;
import com.atguigu.atcrowdfunding.bean.EventsTransactionsCurrentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsCurrentMapper {
    long countByExample(EventsTransactionsCurrentExample example);

    int deleteByExample(EventsTransactionsCurrentExample example);

    int deleteByPrimaryKey(EventsTransactionsCurrentKey key);

    int insert(EventsTransactionsCurrent record);

    int insertSelective(EventsTransactionsCurrent record);

    List<EventsTransactionsCurrent> selectByExample(EventsTransactionsCurrentExample example);

    EventsTransactionsCurrent selectByPrimaryKey(EventsTransactionsCurrentKey key);

    int updateByExampleSelective(@Param("record") EventsTransactionsCurrent record, @Param("example") EventsTransactionsCurrentExample example);

    int updateByExample(@Param("record") EventsTransactionsCurrent record, @Param("example") EventsTransactionsCurrentExample example);

    int updateByPrimaryKeySelective(EventsTransactionsCurrent record);

    int updateByPrimaryKey(EventsTransactionsCurrent record);
}