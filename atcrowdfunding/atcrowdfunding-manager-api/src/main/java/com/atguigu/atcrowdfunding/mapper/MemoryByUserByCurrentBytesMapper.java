package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.MemoryByUserByCurrentBytes;
import com.atguigu.atcrowdfunding.bean.MemoryByUserByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryByUserByCurrentBytesMapper {
    long countByExample(MemoryByUserByCurrentBytesExample example);

    int deleteByExample(MemoryByUserByCurrentBytesExample example);

    int insert(MemoryByUserByCurrentBytes record);

    int insertSelective(MemoryByUserByCurrentBytes record);

    List<MemoryByUserByCurrentBytes> selectByExample(MemoryByUserByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryByUserByCurrentBytes record, @Param("example") MemoryByUserByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryByUserByCurrentBytes record, @Param("example") MemoryByUserByCurrentBytesExample example);
}