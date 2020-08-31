package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStatementsCurrent;
import com.atguigu.atcrowdfunding.bean.EventsStatementsCurrentExample;
import com.atguigu.atcrowdfunding.bean.EventsStatementsCurrentKey;
import com.atguigu.atcrowdfunding.bean.EventsStatementsCurrentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsCurrentMapper {
    long countByExample(EventsStatementsCurrentExample example);

    int deleteByExample(EventsStatementsCurrentExample example);

    int deleteByPrimaryKey(EventsStatementsCurrentKey key);

    int insert(EventsStatementsCurrentWithBLOBs record);

    int insertSelective(EventsStatementsCurrentWithBLOBs record);

    List<EventsStatementsCurrentWithBLOBs> selectByExampleWithBLOBs(EventsStatementsCurrentExample example);

    List<EventsStatementsCurrent> selectByExample(EventsStatementsCurrentExample example);

    EventsStatementsCurrentWithBLOBs selectByPrimaryKey(EventsStatementsCurrentKey key);

    int updateByExampleSelective(@Param("record") EventsStatementsCurrentWithBLOBs record, @Param("example") EventsStatementsCurrentExample example);

    int updateByExampleWithBLOBs(@Param("record") EventsStatementsCurrentWithBLOBs record, @Param("example") EventsStatementsCurrentExample example);

    int updateByExample(@Param("record") EventsStatementsCurrent record, @Param("example") EventsStatementsCurrentExample example);

    int updateByPrimaryKeySelective(EventsStatementsCurrentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EventsStatementsCurrentWithBLOBs record);

    int updateByPrimaryKey(EventsStatementsCurrent record);
}