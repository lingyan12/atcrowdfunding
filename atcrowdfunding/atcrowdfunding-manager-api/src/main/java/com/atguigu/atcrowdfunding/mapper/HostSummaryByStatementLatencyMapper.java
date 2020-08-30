package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.HostSummaryByStatementLatency;
import com.atguigu.atcrowdfunding.bean.HostSummaryByStatementLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByStatementLatencyMapper {
    long countByExample(HostSummaryByStatementLatencyExample example);

    int deleteByExample(HostSummaryByStatementLatencyExample example);

    int insert(HostSummaryByStatementLatency record);

    int insertSelective(HostSummaryByStatementLatency record);

    List<HostSummaryByStatementLatency> selectByExample(HostSummaryByStatementLatencyExample example);

    int updateByExampleSelective(@Param("record") HostSummaryByStatementLatency record, @Param("example") HostSummaryByStatementLatencyExample example);

    int updateByExample(@Param("record") HostSummaryByStatementLatency record, @Param("example") HostSummaryByStatementLatencyExample example);
}