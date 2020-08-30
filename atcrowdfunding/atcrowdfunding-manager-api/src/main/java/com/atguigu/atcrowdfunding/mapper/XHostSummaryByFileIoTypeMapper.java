package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XHostSummaryByFileIoType;
import com.atguigu.atcrowdfunding.bean.XHostSummaryByFileIoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XHostSummaryByFileIoTypeMapper {
    long countByExample(XHostSummaryByFileIoTypeExample example);

    int deleteByExample(XHostSummaryByFileIoTypeExample example);

    int insert(XHostSummaryByFileIoType record);

    int insertSelective(XHostSummaryByFileIoType record);

    List<XHostSummaryByFileIoType> selectByExample(XHostSummaryByFileIoTypeExample example);

    int updateByExampleSelective(@Param("record") XHostSummaryByFileIoType record, @Param("example") XHostSummaryByFileIoTypeExample example);

    int updateByExample(@Param("record") XHostSummaryByFileIoType record, @Param("example") XHostSummaryByFileIoTypeExample example);
}