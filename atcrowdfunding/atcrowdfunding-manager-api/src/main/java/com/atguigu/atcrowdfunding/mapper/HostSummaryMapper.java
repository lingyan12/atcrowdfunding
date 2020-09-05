package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.HostSummary;
import com.atguigu.atcrowdfunding.bean.HostSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryMapper {
    long countByExample(HostSummaryExample example);

    int deleteByExample(HostSummaryExample example);

    int insert(HostSummary record);

    int insertSelective(HostSummary record);

    List<HostSummary> selectByExample(HostSummaryExample example);

    int updateByExampleSelective(@Param("record") HostSummary record, @Param("example") HostSummaryExample example);

    int updateByExample(@Param("record") HostSummary record, @Param("example") HostSummaryExample example);
}