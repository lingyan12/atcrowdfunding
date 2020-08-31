package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStatementsHistoryLong;
import com.atguigu.atcrowdfunding.bean.EventsStatementsHistoryLongExample;
import com.atguigu.atcrowdfunding.bean.EventsStatementsHistoryLongWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsHistoryLongMapper {
    long countByExample(EventsStatementsHistoryLongExample example);

    int deleteByExample(EventsStatementsHistoryLongExample example);

    int insert(EventsStatementsHistoryLongWithBLOBs record);

    int insertSelective(EventsStatementsHistoryLongWithBLOBs record);

    List<EventsStatementsHistoryLongWithBLOBs> selectByExampleWithBLOBs(EventsStatementsHistoryLongExample example);

    List<EventsStatementsHistoryLong> selectByExample(EventsStatementsHistoryLongExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsHistoryLongWithBLOBs record, @Param("example") EventsStatementsHistoryLongExample example);

    int updateByExampleWithBLOBs(@Param("record") EventsStatementsHistoryLongWithBLOBs record, @Param("example") EventsStatementsHistoryLongExample example);

    int updateByExample(@Param("record") EventsStatementsHistoryLong record, @Param("example") EventsStatementsHistoryLongExample example);
}