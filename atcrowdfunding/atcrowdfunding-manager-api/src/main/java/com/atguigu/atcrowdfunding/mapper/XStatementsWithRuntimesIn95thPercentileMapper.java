package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XStatementsWithRuntimesIn95thPercentile;
import com.atguigu.atcrowdfunding.bean.XStatementsWithRuntimesIn95thPercentileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XStatementsWithRuntimesIn95thPercentileMapper {
    long countByExample(XStatementsWithRuntimesIn95thPercentileExample example);

    int deleteByExample(XStatementsWithRuntimesIn95thPercentileExample example);

    int insert(XStatementsWithRuntimesIn95thPercentile record);

    int insertSelective(XStatementsWithRuntimesIn95thPercentile record);

    List<XStatementsWithRuntimesIn95thPercentile> selectByExampleWithBLOBs(XStatementsWithRuntimesIn95thPercentileExample example);

    List<XStatementsWithRuntimesIn95thPercentile> selectByExample(XStatementsWithRuntimesIn95thPercentileExample example);

    int updateByExampleSelective(@Param("record") XStatementsWithRuntimesIn95thPercentile record, @Param("example") XStatementsWithRuntimesIn95thPercentileExample example);

    int updateByExampleWithBLOBs(@Param("record") XStatementsWithRuntimesIn95thPercentile record, @Param("example") XStatementsWithRuntimesIn95thPercentileExample example);

    int updateByExample(@Param("record") XStatementsWithRuntimesIn95thPercentile record, @Param("example") XStatementsWithRuntimesIn95thPercentileExample example);
}