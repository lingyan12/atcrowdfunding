package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.TimeZoneName;
import com.atguigu.atcrowdfunding.bean.TimeZoneNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneNameMapper {
    long countByExample(TimeZoneNameExample example);

    int deleteByExample(TimeZoneNameExample example);

    int deleteByPrimaryKey(String name);

    int insert(TimeZoneName record);

    int insertSelective(TimeZoneName record);

    List<TimeZoneName> selectByExample(TimeZoneNameExample example);

    TimeZoneName selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") TimeZoneName record, @Param("example") TimeZoneNameExample example);

    int updateByExample(@Param("record") TimeZoneName record, @Param("example") TimeZoneNameExample example);

    int updateByPrimaryKeySelective(TimeZoneName record);

    int updateByPrimaryKey(TimeZoneName record);
}