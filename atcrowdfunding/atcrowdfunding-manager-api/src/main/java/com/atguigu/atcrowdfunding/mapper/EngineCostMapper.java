package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EngineCost;
import com.atguigu.atcrowdfunding.bean.EngineCostExample;
import com.atguigu.atcrowdfunding.bean.EngineCostKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngineCostMapper {
    long countByExample(EngineCostExample example);

    int deleteByExample(EngineCostExample example);

    int deleteByPrimaryKey(EngineCostKey key);

    int insert(EngineCost record);

    int insertSelective(EngineCost record);

    List<EngineCost> selectByExample(EngineCostExample example);

    EngineCost selectByPrimaryKey(EngineCostKey key);

    int updateByExampleSelective(@Param("record") EngineCost record, @Param("example") EngineCostExample example);

    int updateByExample(@Param("record") EngineCost record, @Param("example") EngineCostExample example);

    int updateByPrimaryKeySelective(EngineCost record);

    int updateByPrimaryKey(EngineCost record);
}