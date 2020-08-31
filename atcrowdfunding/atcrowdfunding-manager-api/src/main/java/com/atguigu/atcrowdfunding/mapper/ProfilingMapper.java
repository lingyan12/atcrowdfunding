package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Profiling;
import com.atguigu.atcrowdfunding.bean.ProfilingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfilingMapper {
    long countByExample(ProfilingExample example);

    int deleteByExample(ProfilingExample example);

    int insert(Profiling record);

    int insertSelective(Profiling record);

    List<Profiling> selectByExample(ProfilingExample example);

    int updateByExampleSelective(@Param("record") Profiling record, @Param("example") ProfilingExample example);

    int updateByExample(@Param("record") Profiling record, @Param("example") ProfilingExample example);
}