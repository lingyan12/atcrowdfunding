package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XIoByThreadByLatency;
import com.atguigu.atcrowdfunding.bean.XIoByThreadByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoByThreadByLatencyMapper {
    long countByExample(XIoByThreadByLatencyExample example);

    int deleteByExample(XIoByThreadByLatencyExample example);

    int insert(XIoByThreadByLatency record);

    int insertSelective(XIoByThreadByLatency record);

    List<XIoByThreadByLatency> selectByExample(XIoByThreadByLatencyExample example);

    int updateByExampleSelective(@Param("record") XIoByThreadByLatency record, @Param("example") XIoByThreadByLatencyExample example);

    int updateByExample(@Param("record") XIoByThreadByLatency record, @Param("example") XIoByThreadByLatencyExample example);
}