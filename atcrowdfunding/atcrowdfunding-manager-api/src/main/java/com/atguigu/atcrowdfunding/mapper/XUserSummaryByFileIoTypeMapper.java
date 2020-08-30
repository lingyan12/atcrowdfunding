package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XUserSummaryByFileIoType;
import com.atguigu.atcrowdfunding.bean.XUserSummaryByFileIoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryByFileIoTypeMapper {
    long countByExample(XUserSummaryByFileIoTypeExample example);

    int deleteByExample(XUserSummaryByFileIoTypeExample example);

    int insert(XUserSummaryByFileIoType record);

    int insertSelective(XUserSummaryByFileIoType record);

    List<XUserSummaryByFileIoType> selectByExample(XUserSummaryByFileIoTypeExample example);

    int updateByExampleSelective(@Param("record") XUserSummaryByFileIoType record, @Param("example") XUserSummaryByFileIoTypeExample example);

    int updateByExample(@Param("record") XUserSummaryByFileIoType record, @Param("example") XUserSummaryByFileIoTypeExample example);
}