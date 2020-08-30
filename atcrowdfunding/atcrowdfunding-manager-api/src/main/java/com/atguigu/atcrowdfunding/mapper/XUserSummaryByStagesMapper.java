package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XUserSummaryByStages;
import com.atguigu.atcrowdfunding.bean.XUserSummaryByStagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryByStagesMapper {
    long countByExample(XUserSummaryByStagesExample example);

    int deleteByExample(XUserSummaryByStagesExample example);

    int insert(XUserSummaryByStages record);

    int insertSelective(XUserSummaryByStages record);

    List<XUserSummaryByStages> selectByExample(XUserSummaryByStagesExample example);

    int updateByExampleSelective(@Param("record") XUserSummaryByStages record, @Param("example") XUserSummaryByStagesExample example);

    int updateByExample(@Param("record") XUserSummaryByStages record, @Param("example") XUserSummaryByStagesExample example);
}