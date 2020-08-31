package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.MemoryByThreadByCurrentBytes;
import com.atguigu.atcrowdfunding.bean.MemoryByThreadByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryByThreadByCurrentBytesMapper {
    long countByExample(MemoryByThreadByCurrentBytesExample example);

    int deleteByExample(MemoryByThreadByCurrentBytesExample example);

    int insert(MemoryByThreadByCurrentBytes record);

    int insertSelective(MemoryByThreadByCurrentBytes record);

    List<MemoryByThreadByCurrentBytes> selectByExample(MemoryByThreadByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryByThreadByCurrentBytes record, @Param("example") MemoryByThreadByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryByThreadByCurrentBytes record, @Param("example") MemoryByThreadByCurrentBytesExample example);
}