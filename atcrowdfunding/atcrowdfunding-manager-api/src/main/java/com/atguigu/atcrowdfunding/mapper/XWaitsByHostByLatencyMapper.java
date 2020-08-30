package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XWaitsByHostByLatency;
import com.atguigu.atcrowdfunding.bean.XWaitsByHostByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitsByHostByLatencyMapper {
    long countByExample(XWaitsByHostByLatencyExample example);

    int deleteByExample(XWaitsByHostByLatencyExample example);

    int insert(XWaitsByHostByLatency record);

    int insertSelective(XWaitsByHostByLatency record);

    List<XWaitsByHostByLatency> selectByExample(XWaitsByHostByLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitsByHostByLatency record, @Param("example") XWaitsByHostByLatencyExample example);

    int updateByExample(@Param("record") XWaitsByHostByLatency record, @Param("example") XWaitsByHostByLatencyExample example);
}