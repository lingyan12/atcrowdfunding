package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.TimeZoneTransition;
import com.atguigu.atcrowdfunding.bean.TimeZoneTransitionExample;
import com.atguigu.atcrowdfunding.bean.TimeZoneTransitionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneTransitionMapper {
    long countByExample(TimeZoneTransitionExample example);

    int deleteByExample(TimeZoneTransitionExample example);

    int deleteByPrimaryKey(TimeZoneTransitionKey key);

    int insert(TimeZoneTransition record);

    int insertSelective(TimeZoneTransition record);

    List<TimeZoneTransition> selectByExample(TimeZoneTransitionExample example);

    TimeZoneTransition selectByPrimaryKey(TimeZoneTransitionKey key);

    int updateByExampleSelective(@Param("record") TimeZoneTransition record, @Param("example") TimeZoneTransitionExample example);

    int updateByExample(@Param("record") TimeZoneTransition record, @Param("example") TimeZoneTransitionExample example);

    int updateByPrimaryKeySelective(TimeZoneTransition record);

    int updateByPrimaryKey(TimeZoneTransition record);
}