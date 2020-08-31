package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsErrorsSummaryByAccountByError;
import com.atguigu.atcrowdfunding.bean.EventsErrorsSummaryByAccountByErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsErrorsSummaryByAccountByErrorMapper {
    long countByExample(EventsErrorsSummaryByAccountByErrorExample example);

    int deleteByExample(EventsErrorsSummaryByAccountByErrorExample example);

    int insert(EventsErrorsSummaryByAccountByError record);

    int insertSelective(EventsErrorsSummaryByAccountByError record);

    List<EventsErrorsSummaryByAccountByError> selectByExample(EventsErrorsSummaryByAccountByErrorExample example);

    int updateByExampleSelective(@Param("record") EventsErrorsSummaryByAccountByError record, @Param("example") EventsErrorsSummaryByAccountByErrorExample example);

    int updateByExample(@Param("record") EventsErrorsSummaryByAccountByError record, @Param("example") EventsErrorsSummaryByAccountByErrorExample example);
}