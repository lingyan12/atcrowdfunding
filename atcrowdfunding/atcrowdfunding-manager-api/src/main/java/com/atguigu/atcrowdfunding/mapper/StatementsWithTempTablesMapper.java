package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.StatementsWithTempTables;
import com.atguigu.atcrowdfunding.bean.StatementsWithTempTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementsWithTempTablesMapper {
    long countByExample(StatementsWithTempTablesExample example);

    int deleteByExample(StatementsWithTempTablesExample example);

    int insert(StatementsWithTempTables record);

    int insertSelective(StatementsWithTempTables record);

    List<StatementsWithTempTables> selectByExampleWithBLOBs(StatementsWithTempTablesExample example);

    List<StatementsWithTempTables> selectByExample(StatementsWithTempTablesExample example);

    int updateByExampleSelective(@Param("record") StatementsWithTempTables record, @Param("example") StatementsWithTempTablesExample example);

    int updateByExampleWithBLOBs(@Param("record") StatementsWithTempTables record, @Param("example") StatementsWithTempTablesExample example);

    int updateByExample(@Param("record") StatementsWithTempTables record, @Param("example") StatementsWithTempTablesExample example);
}