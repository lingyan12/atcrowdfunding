package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XSchemaIndexStatistics;
import com.atguigu.atcrowdfunding.bean.XSchemaIndexStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSchemaIndexStatisticsMapper {
    long countByExample(XSchemaIndexStatisticsExample example);

    int deleteByExample(XSchemaIndexStatisticsExample example);

    int insert(XSchemaIndexStatistics record);

    int insertSelective(XSchemaIndexStatistics record);

    List<XSchemaIndexStatistics> selectByExample(XSchemaIndexStatisticsExample example);

    int updateByExampleSelective(@Param("record") XSchemaIndexStatistics record, @Param("example") XSchemaIndexStatisticsExample example);

    int updateByExample(@Param("record") XSchemaIndexStatistics record, @Param("example") XSchemaIndexStatisticsExample example);
}