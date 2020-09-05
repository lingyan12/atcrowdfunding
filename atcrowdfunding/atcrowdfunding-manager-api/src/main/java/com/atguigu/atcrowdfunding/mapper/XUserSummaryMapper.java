package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XUserSummary;
import com.atguigu.atcrowdfunding.bean.XUserSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryMapper {
    long countByExample(XUserSummaryExample example);

    int deleteByExample(XUserSummaryExample example);

    int insert(XUserSummary record);

    int insertSelective(XUserSummary record);

    List<XUserSummary> selectByExample(XUserSummaryExample example);

    int updateByExampleSelective(@Param("record") XUserSummary record, @Param("example") XUserSummaryExample example);

    int updateByExample(@Param("record") XUserSummary record, @Param("example") XUserSummaryExample example);
}