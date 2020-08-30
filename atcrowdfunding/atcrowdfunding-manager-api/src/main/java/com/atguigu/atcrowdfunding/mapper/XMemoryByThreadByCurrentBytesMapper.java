package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XMemoryByThreadByCurrentBytes;
import com.atguigu.atcrowdfunding.bean.XMemoryByThreadByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryByThreadByCurrentBytesMapper {
    long countByExample(XMemoryByThreadByCurrentBytesExample example);

    int deleteByExample(XMemoryByThreadByCurrentBytesExample example);

    int insert(XMemoryByThreadByCurrentBytes record);

    int insertSelective(XMemoryByThreadByCurrentBytes record);

    List<XMemoryByThreadByCurrentBytes> selectByExample(XMemoryByThreadByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") XMemoryByThreadByCurrentBytes record, @Param("example") XMemoryByThreadByCurrentBytesExample example);

    int updateByExample(@Param("record") XMemoryByThreadByCurrentBytes record, @Param("example") XMemoryByThreadByCurrentBytesExample example);
}