package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XMemoryByHostByCurrentBytes;
import com.atguigu.atcrowdfunding.bean.XMemoryByHostByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryByHostByCurrentBytesMapper {
    long countByExample(XMemoryByHostByCurrentBytesExample example);

    int deleteByExample(XMemoryByHostByCurrentBytesExample example);

    int insert(XMemoryByHostByCurrentBytes record);

    int insertSelective(XMemoryByHostByCurrentBytes record);

    List<XMemoryByHostByCurrentBytes> selectByExample(XMemoryByHostByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") XMemoryByHostByCurrentBytes record, @Param("example") XMemoryByHostByCurrentBytesExample example);

    int updateByExample(@Param("record") XMemoryByHostByCurrentBytes record, @Param("example") XMemoryByHostByCurrentBytesExample example);
}