package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SchemaAutoIncrementColumns;
import com.atguigu.atcrowdfunding.bean.SchemaAutoIncrementColumnsExample;
import com.atguigu.atcrowdfunding.bean.SchemaAutoIncrementColumnsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaAutoIncrementColumnsMapper {
    long countByExample(SchemaAutoIncrementColumnsExample example);

    int deleteByExample(SchemaAutoIncrementColumnsExample example);

    int insert(SchemaAutoIncrementColumnsWithBLOBs record);

    int insertSelective(SchemaAutoIncrementColumnsWithBLOBs record);

    List<SchemaAutoIncrementColumnsWithBLOBs> selectByExampleWithBLOBs(SchemaAutoIncrementColumnsExample example);

    List<SchemaAutoIncrementColumns> selectByExample(SchemaAutoIncrementColumnsExample example);

    int updateByExampleSelective(@Param("record") SchemaAutoIncrementColumnsWithBLOBs record, @Param("example") SchemaAutoIncrementColumnsExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaAutoIncrementColumnsWithBLOBs record, @Param("example") SchemaAutoIncrementColumnsExample example);

    int updateByExample(@Param("record") SchemaAutoIncrementColumns record, @Param("example") SchemaAutoIncrementColumnsExample example);
}