package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.StatementsWithSorting;
import com.atguigu.atcrowdfunding.bean.StatementsWithSortingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementsWithSortingMapper {
    long countByExample(StatementsWithSortingExample example);

    int deleteByExample(StatementsWithSortingExample example);

    int insert(StatementsWithSorting record);

    int insertSelective(StatementsWithSorting record);

    List<StatementsWithSorting> selectByExampleWithBLOBs(StatementsWithSortingExample example);

    List<StatementsWithSorting> selectByExample(StatementsWithSortingExample example);

    int updateByExampleSelective(@Param("record") StatementsWithSorting record, @Param("example") StatementsWithSortingExample example);

    int updateByExampleWithBLOBs(@Param("record") StatementsWithSorting record, @Param("example") StatementsWithSortingExample example);

    int updateByExample(@Param("record") StatementsWithSorting record, @Param("example") StatementsWithSortingExample example);
}