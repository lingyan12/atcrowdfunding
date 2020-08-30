package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.MemoryByHostByCurrentBytes;
import com.atguigu.atcrowdfunding.bean.MemoryByHostByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryByHostByCurrentBytesMapper {
    long countByExample(MemoryByHostByCurrentBytesExample example);

    int deleteByExample(MemoryByHostByCurrentBytesExample example);

    int insert(MemoryByHostByCurrentBytes record);

    int insertSelective(MemoryByHostByCurrentBytes record);

    List<MemoryByHostByCurrentBytes> selectByExample(MemoryByHostByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryByHostByCurrentBytes record, @Param("example") MemoryByHostByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryByHostByCurrentBytes record, @Param("example") MemoryByHostByCurrentBytesExample example);
}