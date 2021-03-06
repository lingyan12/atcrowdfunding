package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.StatementsWithRuntimesIn95thPercentile;
import com.atguigu.atcrowdfunding.bean.StatementsWithRuntimesIn95thPercentileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementsWithRuntimesIn95thPercentileMapper {
    long countByExample(StatementsWithRuntimesIn95thPercentileExample example);

    int deleteByExample(StatementsWithRuntimesIn95thPercentileExample example);

    int insert(StatementsWithRuntimesIn95thPercentile record);

    int insertSelective(StatementsWithRuntimesIn95thPercentile record);

    List<StatementsWithRuntimesIn95thPercentile> selectByExampleWithBLOBs(StatementsWithRuntimesIn95thPercentileExample example);

    List<StatementsWithRuntimesIn95thPercentile> selectByExample(StatementsWithRuntimesIn95thPercentileExample example);

    int updateByExampleSelective(@Param("record") StatementsWithRuntimesIn95thPercentile record, @Param("example") StatementsWithRuntimesIn95thPercentileExample example);

    int updateByExampleWithBLOBs(@Param("record") StatementsWithRuntimesIn95thPercentile record, @Param("example") StatementsWithRuntimesIn95thPercentileExample example);

    int updateByExample(@Param("record") StatementsWithRuntimesIn95thPercentile record, @Param("example") StatementsWithRuntimesIn95thPercentileExample example);
}