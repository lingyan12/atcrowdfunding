package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SchemaIndexStatistics;
import com.atguigu.atcrowdfunding.bean.SchemaIndexStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaIndexStatisticsMapper {
    long countByExample(SchemaIndexStatisticsExample example);

    int deleteByExample(SchemaIndexStatisticsExample example);

    int insert(SchemaIndexStatistics record);

    int insertSelective(SchemaIndexStatistics record);

    List<SchemaIndexStatistics> selectByExample(SchemaIndexStatisticsExample example);

    int updateByExampleSelective(@Param("record") SchemaIndexStatistics record, @Param("example") SchemaIndexStatisticsExample example);

    int updateByExample(@Param("record") SchemaIndexStatistics record, @Param("example") SchemaIndexStatisticsExample example);
}