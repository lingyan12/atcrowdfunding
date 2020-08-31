package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XMemoryByUserByCurrentBytes;
import com.atguigu.atcrowdfunding.bean.XMemoryByUserByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryByUserByCurrentBytesMapper {
    long countByExample(XMemoryByUserByCurrentBytesExample example);

    int deleteByExample(XMemoryByUserByCurrentBytesExample example);

    int insert(XMemoryByUserByCurrentBytes record);

    int insertSelective(XMemoryByUserByCurrentBytes record);

    List<XMemoryByUserByCurrentBytes> selectByExample(XMemoryByUserByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") XMemoryByUserByCurrentBytes record, @Param("example") XMemoryByUserByCurrentBytesExample example);

    int updateByExample(@Param("record") XMemoryByUserByCurrentBytes record, @Param("example") XMemoryByUserByCurrentBytesExample example);
}