package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SchemaUnusedIndexes;
import com.atguigu.atcrowdfunding.bean.SchemaUnusedIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaUnusedIndexesMapper {
    long countByExample(SchemaUnusedIndexesExample example);

    int deleteByExample(SchemaUnusedIndexesExample example);

    int insert(SchemaUnusedIndexes record);

    int insertSelective(SchemaUnusedIndexes record);

    List<SchemaUnusedIndexes> selectByExample(SchemaUnusedIndexesExample example);

    int updateByExampleSelective(@Param("record") SchemaUnusedIndexes record, @Param("example") SchemaUnusedIndexesExample example);

    int updateByExample(@Param("record") SchemaUnusedIndexes record, @Param("example") SchemaUnusedIndexesExample example);
}