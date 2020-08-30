package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbBufferStatsByTable;
import com.atguigu.atcrowdfunding.bean.InnodbBufferStatsByTableExample;
import com.atguigu.atcrowdfunding.bean.InnodbBufferStatsByTableWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbBufferStatsByTableMapper {
    long countByExample(InnodbBufferStatsByTableExample example);

    int deleteByExample(InnodbBufferStatsByTableExample example);

    int insert(InnodbBufferStatsByTableWithBLOBs record);

    int insertSelective(InnodbBufferStatsByTableWithBLOBs record);

    List<InnodbBufferStatsByTableWithBLOBs> selectByExampleWithBLOBs(InnodbBufferStatsByTableExample example);

    List<InnodbBufferStatsByTable> selectByExample(InnodbBufferStatsByTableExample example);

    int updateByExampleSelective(@Param("record") InnodbBufferStatsByTableWithBLOBs record, @Param("example") InnodbBufferStatsByTableExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbBufferStatsByTableWithBLOBs record, @Param("example") InnodbBufferStatsByTableExample example);

    int updateByExample(@Param("record") InnodbBufferStatsByTable record, @Param("example") InnodbBufferStatsByTableExample example);
}