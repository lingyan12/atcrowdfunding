package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.HostSummaryByFileIoType;
import com.atguigu.atcrowdfunding.bean.HostSummaryByFileIoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByFileIoTypeMapper {
    long countByExample(HostSummaryByFileIoTypeExample example);

    int deleteByExample(HostSummaryByFileIoTypeExample example);

    int insert(HostSummaryByFileIoType record);

    int insertSelective(HostSummaryByFileIoType record);

    List<HostSummaryByFileIoType> selectByExample(HostSummaryByFileIoTypeExample example);

    int updateByExampleSelective(@Param("record") HostSummaryByFileIoType record, @Param("example") HostSummaryByFileIoTypeExample example);

    int updateByExample(@Param("record") HostSummaryByFileIoType record, @Param("example") HostSummaryByFileIoTypeExample example);
}