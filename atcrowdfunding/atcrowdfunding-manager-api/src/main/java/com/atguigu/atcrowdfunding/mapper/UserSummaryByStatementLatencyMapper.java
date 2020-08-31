package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.UserSummaryByStatementLatency;
import com.atguigu.atcrowdfunding.bean.UserSummaryByStatementLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByStatementLatencyMapper {
    long countByExample(UserSummaryByStatementLatencyExample example);

    int deleteByExample(UserSummaryByStatementLatencyExample example);

    int insert(UserSummaryByStatementLatency record);

    int insertSelective(UserSummaryByStatementLatency record);

    List<UserSummaryByStatementLatency> selectByExample(UserSummaryByStatementLatencyExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByStatementLatency record, @Param("example") UserSummaryByStatementLatencyExample example);

    int updateByExample(@Param("record") UserSummaryByStatementLatency record, @Param("example") UserSummaryByStatementLatencyExample example);
}