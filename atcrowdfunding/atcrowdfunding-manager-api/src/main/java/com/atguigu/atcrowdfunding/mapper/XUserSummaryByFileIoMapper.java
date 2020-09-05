package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XUserSummaryByFileIo;
import com.atguigu.atcrowdfunding.bean.XUserSummaryByFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryByFileIoMapper {
    long countByExample(XUserSummaryByFileIoExample example);

    int deleteByExample(XUserSummaryByFileIoExample example);

    int insert(XUserSummaryByFileIo record);

    int insertSelective(XUserSummaryByFileIo record);

    List<XUserSummaryByFileIo> selectByExample(XUserSummaryByFileIoExample example);

    int updateByExampleSelective(@Param("record") XUserSummaryByFileIo record, @Param("example") XUserSummaryByFileIoExample example);

    int updateByExample(@Param("record") XUserSummaryByFileIo record, @Param("example") XUserSummaryByFileIoExample example);
}