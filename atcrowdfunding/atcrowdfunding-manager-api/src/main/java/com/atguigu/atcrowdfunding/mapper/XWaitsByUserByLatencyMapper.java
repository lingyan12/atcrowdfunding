package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XWaitsByUserByLatency;
import com.atguigu.atcrowdfunding.bean.XWaitsByUserByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitsByUserByLatencyMapper {
    long countByExample(XWaitsByUserByLatencyExample example);

    int deleteByExample(XWaitsByUserByLatencyExample example);

    int insert(XWaitsByUserByLatency record);

    int insertSelective(XWaitsByUserByLatency record);

    List<XWaitsByUserByLatency> selectByExample(XWaitsByUserByLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitsByUserByLatency record, @Param("example") XWaitsByUserByLatencyExample example);

    int updateByExample(@Param("record") XWaitsByUserByLatency record, @Param("example") XWaitsByUserByLatencyExample example);
}