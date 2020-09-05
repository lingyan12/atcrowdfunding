package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XMemoryGlobalByCurrentBytes;
import com.atguigu.atcrowdfunding.bean.XMemoryGlobalByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryGlobalByCurrentBytesMapper {
    long countByExample(XMemoryGlobalByCurrentBytesExample example);

    int deleteByExample(XMemoryGlobalByCurrentBytesExample example);

    int insert(XMemoryGlobalByCurrentBytes record);

    int insertSelective(XMemoryGlobalByCurrentBytes record);

    List<XMemoryGlobalByCurrentBytes> selectByExample(XMemoryGlobalByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") XMemoryGlobalByCurrentBytes record, @Param("example") XMemoryGlobalByCurrentBytesExample example);

    int updateByExample(@Param("record") XMemoryGlobalByCurrentBytes record, @Param("example") XMemoryGlobalByCurrentBytesExample example);
}