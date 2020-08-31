package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.IoGlobalByFileByLatency;
import com.atguigu.atcrowdfunding.bean.IoGlobalByFileByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByFileByLatencyMapper {
    long countByExample(IoGlobalByFileByLatencyExample example);

    int deleteByExample(IoGlobalByFileByLatencyExample example);

    int insert(IoGlobalByFileByLatency record);

    int insertSelective(IoGlobalByFileByLatency record);

    List<IoGlobalByFileByLatency> selectByExample(IoGlobalByFileByLatencyExample example);

    int updateByExampleSelective(@Param("record") IoGlobalByFileByLatency record, @Param("example") IoGlobalByFileByLatencyExample example);

    int updateByExample(@Param("record") IoGlobalByFileByLatency record, @Param("example") IoGlobalByFileByLatencyExample example);
}