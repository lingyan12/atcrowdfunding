package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SchemaRedundantIndexes;
import com.atguigu.atcrowdfunding.bean.SchemaRedundantIndexesExample;
import com.atguigu.atcrowdfunding.bean.SchemaRedundantIndexesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaRedundantIndexesMapper {
    long countByExample(SchemaRedundantIndexesExample example);

    int deleteByExample(SchemaRedundantIndexesExample example);

    int insert(SchemaRedundantIndexesWithBLOBs record);

    int insertSelective(SchemaRedundantIndexesWithBLOBs record);

    List<SchemaRedundantIndexesWithBLOBs> selectByExampleWithBLOBs(SchemaRedundantIndexesExample example);

    List<SchemaRedundantIndexes> selectByExample(SchemaRedundantIndexesExample example);

    int updateByExampleSelective(@Param("record") SchemaRedundantIndexesWithBLOBs record, @Param("example") SchemaRedundantIndexesExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaRedundantIndexesWithBLOBs record, @Param("example") SchemaRedundantIndexesExample example);

    int updateByExample(@Param("record") SchemaRedundantIndexes record, @Param("example") SchemaRedundantIndexesExample example);
}