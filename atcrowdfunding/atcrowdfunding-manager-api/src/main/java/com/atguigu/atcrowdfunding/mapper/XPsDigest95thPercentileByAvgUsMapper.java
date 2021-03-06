package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XPsDigest95thPercentileByAvgUs;
import com.atguigu.atcrowdfunding.bean.XPsDigest95thPercentileByAvgUsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XPsDigest95thPercentileByAvgUsMapper {
    long countByExample(XPsDigest95thPercentileByAvgUsExample example);

    int deleteByExample(XPsDigest95thPercentileByAvgUsExample example);

    int insert(XPsDigest95thPercentileByAvgUs record);

    int insertSelective(XPsDigest95thPercentileByAvgUs record);

    List<XPsDigest95thPercentileByAvgUs> selectByExample(XPsDigest95thPercentileByAvgUsExample example);

    int updateByExampleSelective(@Param("record") XPsDigest95thPercentileByAvgUs record, @Param("example") XPsDigest95thPercentileByAvgUsExample example);

    int updateByExample(@Param("record") XPsDigest95thPercentileByAvgUs record, @Param("example") XPsDigest95thPercentileByAvgUsExample example);
}