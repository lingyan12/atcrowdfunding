package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SchemaTableStatisticsWithBuffer;
import com.atguigu.atcrowdfunding.bean.SchemaTableStatisticsWithBufferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTableStatisticsWithBufferMapper {
    long countByExample(SchemaTableStatisticsWithBufferExample example);

    int deleteByExample(SchemaTableStatisticsWithBufferExample example);

    int insert(SchemaTableStatisticsWithBuffer record);

    int insertSelective(SchemaTableStatisticsWithBuffer record);

    List<SchemaTableStatisticsWithBuffer> selectByExample(SchemaTableStatisticsWithBufferExample example);

    int updateByExampleSelective(@Param("record") SchemaTableStatisticsWithBuffer record, @Param("example") SchemaTableStatisticsWithBufferExample example);

    int updateByExample(@Param("record") SchemaTableStatisticsWithBuffer record, @Param("example") SchemaTableStatisticsWithBufferExample example);
}