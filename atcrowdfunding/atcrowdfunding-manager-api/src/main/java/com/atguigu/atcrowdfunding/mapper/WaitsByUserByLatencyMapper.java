package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.WaitsByUserByLatency;
import com.atguigu.atcrowdfunding.bean.WaitsByUserByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitsByUserByLatencyMapper {
    long countByExample(WaitsByUserByLatencyExample example);

    int deleteByExample(WaitsByUserByLatencyExample example);

    int insert(WaitsByUserByLatency record);

    int insertSelective(WaitsByUserByLatency record);

    List<WaitsByUserByLatency> selectByExample(WaitsByUserByLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitsByUserByLatency record, @Param("example") WaitsByUserByLatencyExample example);

    int updateByExample(@Param("record") WaitsByUserByLatency record, @Param("example") WaitsByUserByLatencyExample example);
}