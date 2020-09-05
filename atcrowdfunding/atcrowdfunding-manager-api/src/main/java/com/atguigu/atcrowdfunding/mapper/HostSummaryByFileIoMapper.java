package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.HostSummaryByFileIo;
import com.atguigu.atcrowdfunding.bean.HostSummaryByFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByFileIoMapper {
    long countByExample(HostSummaryByFileIoExample example);

    int deleteByExample(HostSummaryByFileIoExample example);

    int insert(HostSummaryByFileIo record);

    int insertSelective(HostSummaryByFileIo record);

    List<HostSummaryByFileIo> selectByExample(HostSummaryByFileIoExample example);

    int updateByExampleSelective(@Param("record") HostSummaryByFileIo record, @Param("example") HostSummaryByFileIoExample example);

    int updateByExample(@Param("record") HostSummaryByFileIo record, @Param("example") HostSummaryByFileIoExample example);
}