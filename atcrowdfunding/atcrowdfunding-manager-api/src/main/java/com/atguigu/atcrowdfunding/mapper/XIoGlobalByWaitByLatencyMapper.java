package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XIoGlobalByWaitByLatency;
import com.atguigu.atcrowdfunding.bean.XIoGlobalByWaitByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoGlobalByWaitByLatencyMapper {
    long countByExample(XIoGlobalByWaitByLatencyExample example);

    int deleteByExample(XIoGlobalByWaitByLatencyExample example);

    int insert(XIoGlobalByWaitByLatency record);

    int insertSelective(XIoGlobalByWaitByLatency record);

    List<XIoGlobalByWaitByLatency> selectByExample(XIoGlobalByWaitByLatencyExample example);

    int updateByExampleSelective(@Param("record") XIoGlobalByWaitByLatency record, @Param("example") XIoGlobalByWaitByLatencyExample example);

    int updateByExample(@Param("record") XIoGlobalByWaitByLatency record, @Param("example") XIoGlobalByWaitByLatencyExample example);
}