package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStatementsSummaryByProgram;
import com.atguigu.atcrowdfunding.bean.EventsStatementsSummaryByProgramExample;
import com.atguigu.atcrowdfunding.bean.EventsStatementsSummaryByProgramKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByProgramMapper {
    long countByExample(EventsStatementsSummaryByProgramExample example);

    int deleteByExample(EventsStatementsSummaryByProgramExample example);

    int deleteByPrimaryKey(EventsStatementsSummaryByProgramKey key);

    int insert(EventsStatementsSummaryByProgram record);

    int insertSelective(EventsStatementsSummaryByProgram record);

    List<EventsStatementsSummaryByProgram> selectByExample(EventsStatementsSummaryByProgramExample example);

    EventsStatementsSummaryByProgram selectByPrimaryKey(EventsStatementsSummaryByProgramKey key);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByProgram record, @Param("example") EventsStatementsSummaryByProgramExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryByProgram record, @Param("example") EventsStatementsSummaryByProgramExample example);

    int updateByPrimaryKeySelective(EventsStatementsSummaryByProgram record);

    int updateByPrimaryKey(EventsStatementsSummaryByProgram record);
}