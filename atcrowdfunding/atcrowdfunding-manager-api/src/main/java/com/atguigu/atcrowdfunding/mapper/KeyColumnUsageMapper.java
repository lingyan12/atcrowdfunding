package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.KeyColumnUsage;
import com.atguigu.atcrowdfunding.bean.KeyColumnUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeyColumnUsageMapper {
    long countByExample(KeyColumnUsageExample example);

    int deleteByExample(KeyColumnUsageExample example);

    int insert(KeyColumnUsage record);

    int insertSelective(KeyColumnUsage record);

    List<KeyColumnUsage> selectByExample(KeyColumnUsageExample example);

    int updateByExampleSelective(@Param("record") KeyColumnUsage record, @Param("example") KeyColumnUsageExample example);

    int updateByExample(@Param("record") KeyColumnUsage record, @Param("example") KeyColumnUsageExample example);
}