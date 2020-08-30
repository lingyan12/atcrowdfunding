package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.IoByThreadByLatency;
import com.atguigu.atcrowdfunding.bean.IoByThreadByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoByThreadByLatencyMapper {
    long countByExample(IoByThreadByLatencyExample example);

    int deleteByExample(IoByThreadByLatencyExample example);

    int insert(IoByThreadByLatency record);

    int insertSelective(IoByThreadByLatency record);

    List<IoByThreadByLatency> selectByExample(IoByThreadByLatencyExample example);

    int updateByExampleSelective(@Param("record") IoByThreadByLatency record, @Param("example") IoByThreadByLatencyExample example);

    int updateByExample(@Param("record") IoByThreadByLatency record, @Param("example") IoByThreadByLatencyExample example);
}