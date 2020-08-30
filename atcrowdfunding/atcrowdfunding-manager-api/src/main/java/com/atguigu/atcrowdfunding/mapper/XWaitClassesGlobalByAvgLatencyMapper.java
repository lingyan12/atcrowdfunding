package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XWaitClassesGlobalByAvgLatency;
import com.atguigu.atcrowdfunding.bean.XWaitClassesGlobalByAvgLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitClassesGlobalByAvgLatencyMapper {
    long countByExample(XWaitClassesGlobalByAvgLatencyExample example);

    int deleteByExample(XWaitClassesGlobalByAvgLatencyExample example);

    int insert(XWaitClassesGlobalByAvgLatency record);

    int insertSelective(XWaitClassesGlobalByAvgLatency record);

    List<XWaitClassesGlobalByAvgLatency> selectByExample(XWaitClassesGlobalByAvgLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitClassesGlobalByAvgLatency record, @Param("example") XWaitClassesGlobalByAvgLatencyExample example);

    int updateByExample(@Param("record") XWaitClassesGlobalByAvgLatency record, @Param("example") XWaitClassesGlobalByAvgLatencyExample example);
}