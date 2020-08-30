package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SchemaTableStatistics;
import com.atguigu.atcrowdfunding.bean.SchemaTableStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTableStatisticsMapper {
    long countByExample(SchemaTableStatisticsExample example);

    int deleteByExample(SchemaTableStatisticsExample example);

    int insert(SchemaTableStatistics record);

    int insertSelective(SchemaTableStatistics record);

    List<SchemaTableStatistics> selectByExample(SchemaTableStatisticsExample example);

    int updateByExampleSelective(@Param("record") SchemaTableStatistics record, @Param("example") SchemaTableStatisticsExample example);

    int updateByExample(@Param("record") SchemaTableStatistics record, @Param("example") SchemaTableStatisticsExample example);
}