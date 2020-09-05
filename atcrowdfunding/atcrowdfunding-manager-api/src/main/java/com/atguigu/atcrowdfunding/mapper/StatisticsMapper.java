package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Statistics;
import com.atguigu.atcrowdfunding.bean.StatisticsExample;
import com.atguigu.atcrowdfunding.bean.StatisticsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatisticsMapper {
    long countByExample(StatisticsExample example);

    int deleteByExample(StatisticsExample example);

    int insert(StatisticsWithBLOBs record);

    int insertSelective(StatisticsWithBLOBs record);

    List<StatisticsWithBLOBs> selectByExampleWithBLOBs(StatisticsExample example);

    List<Statistics> selectByExample(StatisticsExample example);

    int updateByExampleSelective(@Param("record") StatisticsWithBLOBs record, @Param("example") StatisticsExample example);

    int updateByExampleWithBLOBs(@Param("record") StatisticsWithBLOBs record, @Param("example") StatisticsExample example);

    int updateByExample(@Param("record") Statistics record, @Param("example") StatisticsExample example);
}