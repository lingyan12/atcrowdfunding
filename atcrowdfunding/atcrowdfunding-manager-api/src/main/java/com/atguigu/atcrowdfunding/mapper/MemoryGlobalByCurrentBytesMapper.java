package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.MemoryGlobalByCurrentBytes;
import com.atguigu.atcrowdfunding.bean.MemoryGlobalByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryGlobalByCurrentBytesMapper {
    long countByExample(MemoryGlobalByCurrentBytesExample example);

    int deleteByExample(MemoryGlobalByCurrentBytesExample example);

    int insert(MemoryGlobalByCurrentBytes record);

    int insertSelective(MemoryGlobalByCurrentBytes record);

    List<MemoryGlobalByCurrentBytes> selectByExample(MemoryGlobalByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryGlobalByCurrentBytes record, @Param("example") MemoryGlobalByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryGlobalByCurrentBytes record, @Param("example") MemoryGlobalByCurrentBytesExample example);
}