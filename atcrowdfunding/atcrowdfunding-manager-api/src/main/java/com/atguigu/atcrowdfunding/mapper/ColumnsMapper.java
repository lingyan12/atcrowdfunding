package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Columns;
import com.atguigu.atcrowdfunding.bean.ColumnsExample;
import com.atguigu.atcrowdfunding.bean.ColumnsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnsMapper {
    long countByExample(ColumnsExample example);

    int deleteByExample(ColumnsExample example);

    int insert(ColumnsWithBLOBs record);

    int insertSelective(ColumnsWithBLOBs record);

    List<ColumnsWithBLOBs> selectByExampleWithBLOBs(ColumnsExample example);

    List<Columns> selectByExample(ColumnsExample example);

    int updateByExampleSelective(@Param("record") ColumnsWithBLOBs record, @Param("example") ColumnsExample example);

    int updateByExampleWithBLOBs(@Param("record") ColumnsWithBLOBs record, @Param("example") ColumnsExample example);

    int updateByExample(@Param("record") Columns record, @Param("example") ColumnsExample example);
}