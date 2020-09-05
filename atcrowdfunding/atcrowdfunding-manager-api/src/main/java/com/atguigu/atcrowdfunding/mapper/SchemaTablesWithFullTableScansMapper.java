package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SchemaTablesWithFullTableScans;
import com.atguigu.atcrowdfunding.bean.SchemaTablesWithFullTableScansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTablesWithFullTableScansMapper {
    long countByExample(SchemaTablesWithFullTableScansExample example);

    int deleteByExample(SchemaTablesWithFullTableScansExample example);

    int insert(SchemaTablesWithFullTableScans record);

    int insertSelective(SchemaTablesWithFullTableScans record);

    List<SchemaTablesWithFullTableScans> selectByExample(SchemaTablesWithFullTableScansExample example);

    int updateByExampleSelective(@Param("record") SchemaTablesWithFullTableScans record, @Param("example") SchemaTablesWithFullTableScansExample example);

    int updateByExample(@Param("record") SchemaTablesWithFullTableScans record, @Param("example") SchemaTablesWithFullTableScansExample example);
}