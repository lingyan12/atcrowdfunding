package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XPsDigestAvgLatencyDistribution;
import com.atguigu.atcrowdfunding.bean.XPsDigestAvgLatencyDistributionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XPsDigestAvgLatencyDistributionMapper {
    long countByExample(XPsDigestAvgLatencyDistributionExample example);

    int deleteByExample(XPsDigestAvgLatencyDistributionExample example);

    int insert(XPsDigestAvgLatencyDistribution record);

    int insertSelective(XPsDigestAvgLatencyDistribution record);

    List<XPsDigestAvgLatencyDistribution> selectByExample(XPsDigestAvgLatencyDistributionExample example);

    int updateByExampleSelective(@Param("record") XPsDigestAvgLatencyDistribution record, @Param("example") XPsDigestAvgLatencyDistributionExample example);

    int updateByExample(@Param("record") XPsDigestAvgLatencyDistribution record, @Param("example") XPsDigestAvgLatencyDistributionExample example);
}