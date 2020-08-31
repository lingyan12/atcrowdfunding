package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStatementsHistory;
import com.atguigu.atcrowdfunding.bean.EventsStatementsHistoryExample;
import com.atguigu.atcrowdfunding.bean.EventsStatementsHistoryKey;
import com.atguigu.atcrowdfunding.bean.EventsStatementsHistoryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsHistoryMapper {
    long countByExample(EventsStatementsHistoryExample example);

    int deleteByExample(EventsStatementsHistoryExample example);

    int deleteByPrimaryKey(EventsStatementsHistoryKey key);

    int insert(EventsStatementsHistoryWithBLOBs record);

    int insertSelective(EventsStatementsHistoryWithBLOBs record);

    List<EventsStatementsHistoryWithBLOBs> selectByExampleWithBLOBs(EventsStatementsHistoryExample example);

    List<EventsStatementsHistory> selectByExample(EventsStatementsHistoryExample example);

    EventsStatementsHistoryWithBLOBs selectByPrimaryKey(EventsStatementsHistoryKey key);

    int updateByExampleSelective(@Param("record") EventsStatementsHistoryWithBLOBs record, @Param("example") EventsStatementsHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") EventsStatementsHistoryWithBLOBs record, @Param("example") EventsStatementsHistoryExample example);

    int updateByExample(@Param("record") EventsStatementsHistory record, @Param("example") EventsStatementsHistoryExample example);

    int updateByPrimaryKeySelective(EventsStatementsHistoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EventsStatementsHistoryWithBLOBs record);

    int updateByPrimaryKey(EventsStatementsHistory record);
}