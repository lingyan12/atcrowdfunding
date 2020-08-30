package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.TimeZoneTransitionType;
import com.atguigu.atcrowdfunding.bean.TimeZoneTransitionTypeExample;
import com.atguigu.atcrowdfunding.bean.TimeZoneTransitionTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneTransitionTypeMapper {
    long countByExample(TimeZoneTransitionTypeExample example);

    int deleteByExample(TimeZoneTransitionTypeExample example);

    int deleteByPrimaryKey(TimeZoneTransitionTypeKey key);

    int insert(TimeZoneTransitionType record);

    int insertSelective(TimeZoneTransitionType record);

    List<TimeZoneTransitionType> selectByExample(TimeZoneTransitionTypeExample example);

    TimeZoneTransitionType selectByPrimaryKey(TimeZoneTransitionTypeKey key);

    int updateByExampleSelective(@Param("record") TimeZoneTransitionType record, @Param("example") TimeZoneTransitionTypeExample example);

    int updateByExample(@Param("record") TimeZoneTransitionType record, @Param("example") TimeZoneTransitionTypeExample example);

    int updateByPrimaryKeySelective(TimeZoneTransitionType record);

    int updateByPrimaryKey(TimeZoneTransitionType record);
}