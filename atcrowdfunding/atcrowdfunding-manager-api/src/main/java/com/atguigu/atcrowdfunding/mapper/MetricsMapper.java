package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Metrics;
import com.atguigu.atcrowdfunding.bean.MetricsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetricsMapper {
    long countByExample(MetricsExample example);

    int deleteByExample(MetricsExample example);

    int insert(Metrics record);

    int insertSelective(Metrics record);

    List<Metrics> selectByExampleWithBLOBs(MetricsExample example);

    List<Metrics> selectByExample(MetricsExample example);

    int updateByExampleSelective(@Param("record") Metrics record, @Param("example") MetricsExample example);

    int updateByExampleWithBLOBs(@Param("record") Metrics record, @Param("example") MetricsExample example);

    int updateByExample(@Param("record") Metrics record, @Param("example") MetricsExample example);
}