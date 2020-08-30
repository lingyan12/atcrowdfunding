package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XWaitClassesGlobalByLatency;
import com.atguigu.atcrowdfunding.bean.XWaitClassesGlobalByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitClassesGlobalByLatencyMapper {
    long countByExample(XWaitClassesGlobalByLatencyExample example);

    int deleteByExample(XWaitClassesGlobalByLatencyExample example);

    int insert(XWaitClassesGlobalByLatency record);

    int insertSelective(XWaitClassesGlobalByLatency record);

    List<XWaitClassesGlobalByLatency> selectByExample(XWaitClassesGlobalByLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitClassesGlobalByLatency record, @Param("example") XWaitClassesGlobalByLatencyExample example);

    int updateByExample(@Param("record") XWaitClassesGlobalByLatency record, @Param("example") XWaitClassesGlobalByLatencyExample example);
}