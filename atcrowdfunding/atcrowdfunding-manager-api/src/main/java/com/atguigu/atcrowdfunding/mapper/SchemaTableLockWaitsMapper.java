package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SchemaTableLockWaits;
import com.atguigu.atcrowdfunding.bean.SchemaTableLockWaitsExample;
import com.atguigu.atcrowdfunding.bean.SchemaTableLockWaitsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTableLockWaitsMapper {
    long countByExample(SchemaTableLockWaitsExample example);

    int deleteByExample(SchemaTableLockWaitsExample example);

    int insert(SchemaTableLockWaitsWithBLOBs record);

    int insertSelective(SchemaTableLockWaitsWithBLOBs record);

    List<SchemaTableLockWaitsWithBLOBs> selectByExampleWithBLOBs(SchemaTableLockWaitsExample example);

    List<SchemaTableLockWaits> selectByExample(SchemaTableLockWaitsExample example);

    int updateByExampleSelective(@Param("record") SchemaTableLockWaitsWithBLOBs record, @Param("example") SchemaTableLockWaitsExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaTableLockWaitsWithBLOBs record, @Param("example") SchemaTableLockWaitsExample example);

    int updateByExample(@Param("record") SchemaTableLockWaits record, @Param("example") SchemaTableLockWaitsExample example);
}