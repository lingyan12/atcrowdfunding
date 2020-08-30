package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XHostSummary;
import com.atguigu.atcrowdfunding.bean.XHostSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XHostSummaryMapper {
    long countByExample(XHostSummaryExample example);

    int deleteByExample(XHostSummaryExample example);

    int insert(XHostSummary record);

    int insertSelective(XHostSummary record);

    List<XHostSummary> selectByExample(XHostSummaryExample example);

    int updateByExampleSelective(@Param("record") XHostSummary record, @Param("example") XHostSummaryExample example);

    int updateByExample(@Param("record") XHostSummary record, @Param("example") XHostSummaryExample example);
}