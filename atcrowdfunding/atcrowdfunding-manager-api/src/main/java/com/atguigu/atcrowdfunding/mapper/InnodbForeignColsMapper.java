package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbForeignCols;
import com.atguigu.atcrowdfunding.bean.InnodbForeignColsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbForeignColsMapper {
    long countByExample(InnodbForeignColsExample example);

    int deleteByExample(InnodbForeignColsExample example);

    int insert(InnodbForeignCols record);

    int insertSelective(InnodbForeignCols record);

    List<InnodbForeignCols> selectByExample(InnodbForeignColsExample example);

    int updateByExampleSelective(@Param("record") InnodbForeignCols record, @Param("example") InnodbForeignColsExample example);

    int updateByExample(@Param("record") InnodbForeignCols record, @Param("example") InnodbForeignColsExample example);
}