package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.StUnitsOfMeasure;
import com.atguigu.atcrowdfunding.bean.StUnitsOfMeasureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StUnitsOfMeasureMapper {
    long countByExample(StUnitsOfMeasureExample example);

    int deleteByExample(StUnitsOfMeasureExample example);

    int insert(StUnitsOfMeasure record);

    int insertSelective(StUnitsOfMeasure record);

    List<StUnitsOfMeasure> selectByExample(StUnitsOfMeasureExample example);

    int updateByExampleSelective(@Param("record") StUnitsOfMeasure record, @Param("example") StUnitsOfMeasureExample example);

    int updateByExample(@Param("record") StUnitsOfMeasure record, @Param("example") StUnitsOfMeasureExample example);
}