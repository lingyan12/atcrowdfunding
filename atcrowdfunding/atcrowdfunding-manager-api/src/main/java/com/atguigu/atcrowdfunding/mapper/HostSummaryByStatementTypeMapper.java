package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.HostSummaryByStatementType;
import com.atguigu.atcrowdfunding.bean.HostSummaryByStatementTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByStatementTypeMapper {
    long countByExample(HostSummaryByStatementTypeExample example);

    int deleteByExample(HostSummaryByStatementTypeExample example);

    int insert(HostSummaryByStatementType record);

    int insertSelective(HostSummaryByStatementType record);

    List<HostSummaryByStatementType> selectByExample(HostSummaryByStatementTypeExample example);

    int updateByExampleSelective(@Param("record") HostSummaryByStatementType record, @Param("example") HostSummaryByStatementTypeExample example);

    int updateByExample(@Param("record") HostSummaryByStatementType record, @Param("example") HostSummaryByStatementTypeExample example);
}