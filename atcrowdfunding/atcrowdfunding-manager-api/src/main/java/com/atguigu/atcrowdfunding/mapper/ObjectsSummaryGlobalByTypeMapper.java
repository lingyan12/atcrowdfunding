package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ObjectsSummaryGlobalByType;
import com.atguigu.atcrowdfunding.bean.ObjectsSummaryGlobalByTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectsSummaryGlobalByTypeMapper {
    long countByExample(ObjectsSummaryGlobalByTypeExample example);

    int deleteByExample(ObjectsSummaryGlobalByTypeExample example);

    int insert(ObjectsSummaryGlobalByType record);

    int insertSelective(ObjectsSummaryGlobalByType record);

    List<ObjectsSummaryGlobalByType> selectByExample(ObjectsSummaryGlobalByTypeExample example);

    int updateByExampleSelective(@Param("record") ObjectsSummaryGlobalByType record, @Param("example") ObjectsSummaryGlobalByTypeExample example);

    int updateByExample(@Param("record") ObjectsSummaryGlobalByType record, @Param("example") ObjectsSummaryGlobalByTypeExample example);
}