package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsWaitsSummaryByInstance;
import com.atguigu.atcrowdfunding.bean.EventsWaitsSummaryByInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryByInstanceMapper {
    long countByExample(EventsWaitsSummaryByInstanceExample example);

    int deleteByExample(EventsWaitsSummaryByInstanceExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(EventsWaitsSummaryByInstance record);

    int insertSelective(EventsWaitsSummaryByInstance record);

    List<EventsWaitsSummaryByInstance> selectByExample(EventsWaitsSummaryByInstanceExample example);

    EventsWaitsSummaryByInstance selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") EventsWaitsSummaryByInstance record, @Param("example") EventsWaitsSummaryByInstanceExample example);

    int updateByExample(@Param("record") EventsWaitsSummaryByInstance record, @Param("example") EventsWaitsSummaryByInstanceExample example);

    int updateByPrimaryKeySelective(EventsWaitsSummaryByInstance record);

    int updateByPrimaryKey(EventsWaitsSummaryByInstance record);
}