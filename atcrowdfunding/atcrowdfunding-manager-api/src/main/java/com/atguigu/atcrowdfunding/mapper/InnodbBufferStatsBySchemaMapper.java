package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbBufferStatsBySchema;
import com.atguigu.atcrowdfunding.bean.InnodbBufferStatsBySchemaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbBufferStatsBySchemaMapper {
    long countByExample(InnodbBufferStatsBySchemaExample example);

    int deleteByExample(InnodbBufferStatsBySchemaExample example);

    int insert(InnodbBufferStatsBySchema record);

    int insertSelective(InnodbBufferStatsBySchema record);

    List<InnodbBufferStatsBySchema> selectByExampleWithBLOBs(InnodbBufferStatsBySchemaExample example);

    List<InnodbBufferStatsBySchema> selectByExample(InnodbBufferStatsBySchemaExample example);

    int updateByExampleSelective(@Param("record") InnodbBufferStatsBySchema record, @Param("example") InnodbBufferStatsBySchemaExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbBufferStatsBySchema record, @Param("example") InnodbBufferStatsBySchemaExample example);

    int updateByExample(@Param("record") InnodbBufferStatsBySchema record, @Param("example") InnodbBufferStatsBySchemaExample example);
}