package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.TimeZone;
import com.atguigu.atcrowdfunding.bean.TimeZoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneMapper {
    long countByExample(TimeZoneExample example);

    int deleteByExample(TimeZoneExample example);

    int deleteByPrimaryKey(Integer timeZoneId);

    int insert(TimeZone record);

    int insertSelective(TimeZone record);

    List<TimeZone> selectByExample(TimeZoneExample example);

    TimeZone selectByPrimaryKey(Integer timeZoneId);

    int updateByExampleSelective(@Param("record") TimeZone record, @Param("example") TimeZoneExample example);

    int updateByExample(@Param("record") TimeZone record, @Param("example") TimeZoneExample example);

    int updateByPrimaryKeySelective(TimeZone record);

    int updateByPrimaryKey(TimeZone record);
}