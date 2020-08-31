package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsErrorsSummaryByUserByError;
import com.atguigu.atcrowdfunding.bean.EventsErrorsSummaryByUserByErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsErrorsSummaryByUserByErrorMapper {
    long countByExample(EventsErrorsSummaryByUserByErrorExample example);

    int deleteByExample(EventsErrorsSummaryByUserByErrorExample example);

    int insert(EventsErrorsSummaryByUserByError record);

    int insertSelective(EventsErrorsSummaryByUserByError record);

    List<EventsErrorsSummaryByUserByError> selectByExample(EventsErrorsSummaryByUserByErrorExample example);

    int updateByExampleSelective(@Param("record") EventsErrorsSummaryByUserByError record, @Param("example") EventsErrorsSummaryByUserByErrorExample example);

    int updateByExample(@Param("record") EventsErrorsSummaryByUserByError record, @Param("example") EventsErrorsSummaryByUserByErrorExample example);
}