package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XPsSchemaTableStatisticsIo;
import com.atguigu.atcrowdfunding.bean.XPsSchemaTableStatisticsIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XPsSchemaTableStatisticsIoMapper {
    long countByExample(XPsSchemaTableStatisticsIoExample example);

    int deleteByExample(XPsSchemaTableStatisticsIoExample example);

    int insert(XPsSchemaTableStatisticsIo record);

    int insertSelective(XPsSchemaTableStatisticsIo record);

    List<XPsSchemaTableStatisticsIo> selectByExample(XPsSchemaTableStatisticsIoExample example);

    int updateByExampleSelective(@Param("record") XPsSchemaTableStatisticsIo record, @Param("example") XPsSchemaTableStatisticsIoExample example);

    int updateByExample(@Param("record") XPsSchemaTableStatisticsIo record, @Param("example") XPsSchemaTableStatisticsIoExample example);
}