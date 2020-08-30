package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XUserSummaryByStatementLatency;
import com.atguigu.atcrowdfunding.bean.XUserSummaryByStatementLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryByStatementLatencyMapper {
    long countByExample(XUserSummaryByStatementLatencyExample example);

    int deleteByExample(XUserSummaryByStatementLatencyExample example);

    int insert(XUserSummaryByStatementLatency record);

    int insertSelective(XUserSummaryByStatementLatency record);

    List<XUserSummaryByStatementLatency> selectByExample(XUserSummaryByStatementLatencyExample example);

    int updateByExampleSelective(@Param("record") XUserSummaryByStatementLatency record, @Param("example") XUserSummaryByStatementLatencyExample example);

    int updateByExample(@Param("record") XUserSummaryByStatementLatency record, @Param("example") XUserSummaryByStatementLatencyExample example);
}