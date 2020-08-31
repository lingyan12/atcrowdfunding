package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ViewTableUsage;
import com.atguigu.atcrowdfunding.bean.ViewTableUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewTableUsageMapper {
    long countByExample(ViewTableUsageExample example);

    int deleteByExample(ViewTableUsageExample example);

    int insert(ViewTableUsage record);

    int insertSelective(ViewTableUsage record);

    List<ViewTableUsage> selectByExample(ViewTableUsageExample example);

    int updateByExampleSelective(@Param("record") ViewTableUsage record, @Param("example") ViewTableUsageExample example);

    int updateByExample(@Param("record") ViewTableUsage record, @Param("example") ViewTableUsageExample example);
}