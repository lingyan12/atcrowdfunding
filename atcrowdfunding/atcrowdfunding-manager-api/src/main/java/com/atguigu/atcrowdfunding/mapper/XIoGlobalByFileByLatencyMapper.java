package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XIoGlobalByFileByLatency;
import com.atguigu.atcrowdfunding.bean.XIoGlobalByFileByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoGlobalByFileByLatencyMapper {
    long countByExample(XIoGlobalByFileByLatencyExample example);

    int deleteByExample(XIoGlobalByFileByLatencyExample example);

    int insert(XIoGlobalByFileByLatency record);

    int insertSelective(XIoGlobalByFileByLatency record);

    List<XIoGlobalByFileByLatency> selectByExample(XIoGlobalByFileByLatencyExample example);

    int updateByExampleSelective(@Param("record") XIoGlobalByFileByLatency record, @Param("example") XIoGlobalByFileByLatencyExample example);

    int updateByExample(@Param("record") XIoGlobalByFileByLatency record, @Param("example") XIoGlobalByFileByLatencyExample example);
}