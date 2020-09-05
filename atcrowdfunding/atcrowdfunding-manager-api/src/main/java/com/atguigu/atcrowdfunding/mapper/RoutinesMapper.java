package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Routines;
import com.atguigu.atcrowdfunding.bean.RoutinesExample;
import com.atguigu.atcrowdfunding.bean.RoutinesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutinesMapper {
    long countByExample(RoutinesExample example);

    int deleteByExample(RoutinesExample example);

    int insert(RoutinesWithBLOBs record);

    int insertSelective(RoutinesWithBLOBs record);

    List<RoutinesWithBLOBs> selectByExampleWithBLOBs(RoutinesExample example);

    List<Routines> selectByExample(RoutinesExample example);

    int updateByExampleSelective(@Param("record") RoutinesWithBLOBs record, @Param("example") RoutinesExample example);

    int updateByExampleWithBLOBs(@Param("record") RoutinesWithBLOBs record, @Param("example") RoutinesExample example);

    int updateByExample(@Param("record") Routines record, @Param("example") RoutinesExample example);
}