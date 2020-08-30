package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.OptimizerTrace;
import com.atguigu.atcrowdfunding.bean.OptimizerTraceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OptimizerTraceMapper {
    long countByExample(OptimizerTraceExample example);

    int deleteByExample(OptimizerTraceExample example);

    int insert(OptimizerTrace record);

    int insertSelective(OptimizerTrace record);

    List<OptimizerTrace> selectByExample(OptimizerTraceExample example);

    int updateByExampleSelective(@Param("record") OptimizerTrace record, @Param("example") OptimizerTraceExample example);

    int updateByExample(@Param("record") OptimizerTrace record, @Param("example") OptimizerTraceExample example);
}