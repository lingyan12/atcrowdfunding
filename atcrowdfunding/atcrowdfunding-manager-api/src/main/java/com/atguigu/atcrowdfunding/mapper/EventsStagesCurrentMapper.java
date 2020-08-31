package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStagesCurrent;
import com.atguigu.atcrowdfunding.bean.EventsStagesCurrentExample;
import com.atguigu.atcrowdfunding.bean.EventsStagesCurrentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesCurrentMapper {
    long countByExample(EventsStagesCurrentExample example);

    int deleteByExample(EventsStagesCurrentExample example);

    int deleteByPrimaryKey(EventsStagesCurrentKey key);

    int insert(EventsStagesCurrent record);

    int insertSelective(EventsStagesCurrent record);

    List<EventsStagesCurrent> selectByExample(EventsStagesCurrentExample example);

    EventsStagesCurrent selectByPrimaryKey(EventsStagesCurrentKey key);

    int updateByExampleSelective(@Param("record") EventsStagesCurrent record, @Param("example") EventsStagesCurrentExample example);

    int updateByExample(@Param("record") EventsStagesCurrent record, @Param("example") EventsStagesCurrentExample example);

    int updateByPrimaryKeySelective(EventsStagesCurrent record);

    int updateByPrimaryKey(EventsStagesCurrent record);
}