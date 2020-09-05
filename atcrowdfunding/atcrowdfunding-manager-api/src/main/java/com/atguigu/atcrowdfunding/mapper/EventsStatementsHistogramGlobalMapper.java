package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStatementsHistogramGlobal;
import com.atguigu.atcrowdfunding.bean.EventsStatementsHistogramGlobalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsHistogramGlobalMapper {
    long countByExample(EventsStatementsHistogramGlobalExample example);

    int deleteByExample(EventsStatementsHistogramGlobalExample example);

    int deleteByPrimaryKey(Integer bucketNumber);

    int insert(EventsStatementsHistogramGlobal record);

    int insertSelective(EventsStatementsHistogramGlobal record);

    List<EventsStatementsHistogramGlobal> selectByExample(EventsStatementsHistogramGlobalExample example);

    EventsStatementsHistogramGlobal selectByPrimaryKey(Integer bucketNumber);

    int updateByExampleSelective(@Param("record") EventsStatementsHistogramGlobal record, @Param("example") EventsStatementsHistogramGlobalExample example);

    int updateByExample(@Param("record") EventsStatementsHistogramGlobal record, @Param("example") EventsStatementsHistogramGlobalExample example);

    int updateByPrimaryKeySelective(EventsStatementsHistogramGlobal record);

    int updateByPrimaryKey(EventsStatementsHistogramGlobal record);
}