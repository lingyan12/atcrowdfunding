package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.StatementsWithFullTableScans;
import com.atguigu.atcrowdfunding.bean.StatementsWithFullTableScansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementsWithFullTableScansMapper {
    long countByExample(StatementsWithFullTableScansExample example);

    int deleteByExample(StatementsWithFullTableScansExample example);

    int insert(StatementsWithFullTableScans record);

    int insertSelective(StatementsWithFullTableScans record);

    List<StatementsWithFullTableScans> selectByExampleWithBLOBs(StatementsWithFullTableScansExample example);

    List<StatementsWithFullTableScans> selectByExample(StatementsWithFullTableScansExample example);

    int updateByExampleSelective(@Param("record") StatementsWithFullTableScans record, @Param("example") StatementsWithFullTableScansExample example);

    int updateByExampleWithBLOBs(@Param("record") StatementsWithFullTableScans record, @Param("example") StatementsWithFullTableScansExample example);

    int updateByExample(@Param("record") StatementsWithFullTableScans record, @Param("example") StatementsWithFullTableScansExample example);
}