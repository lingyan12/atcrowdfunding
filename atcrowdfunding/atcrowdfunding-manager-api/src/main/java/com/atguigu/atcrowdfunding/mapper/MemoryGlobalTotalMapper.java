package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.MemoryGlobalTotal;
import com.atguigu.atcrowdfunding.bean.MemoryGlobalTotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryGlobalTotalMapper {
    long countByExample(MemoryGlobalTotalExample example);

    int deleteByExample(MemoryGlobalTotalExample example);

    int insert(MemoryGlobalTotal record);

    int insertSelective(MemoryGlobalTotal record);

    List<MemoryGlobalTotal> selectByExample(MemoryGlobalTotalExample example);

    int updateByExampleSelective(@Param("record") MemoryGlobalTotal record, @Param("example") MemoryGlobalTotalExample example);

    int updateByExample(@Param("record") MemoryGlobalTotal record, @Param("example") MemoryGlobalTotalExample example);
}