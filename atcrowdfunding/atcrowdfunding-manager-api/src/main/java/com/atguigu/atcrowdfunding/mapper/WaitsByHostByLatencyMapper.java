package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.WaitsByHostByLatency;
import com.atguigu.atcrowdfunding.bean.WaitsByHostByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitsByHostByLatencyMapper {
    long countByExample(WaitsByHostByLatencyExample example);

    int deleteByExample(WaitsByHostByLatencyExample example);

    int insert(WaitsByHostByLatency record);

    int insertSelective(WaitsByHostByLatency record);

    List<WaitsByHostByLatency> selectByExample(WaitsByHostByLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitsByHostByLatency record, @Param("example") WaitsByHostByLatencyExample example);

    int updateByExample(@Param("record") WaitsByHostByLatency record, @Param("example") WaitsByHostByLatencyExample example);
}