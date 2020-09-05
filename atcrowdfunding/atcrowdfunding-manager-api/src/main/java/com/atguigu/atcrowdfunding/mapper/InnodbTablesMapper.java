package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbTables;
import com.atguigu.atcrowdfunding.bean.InnodbTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTablesMapper {
    long countByExample(InnodbTablesExample example);

    int deleteByExample(InnodbTablesExample example);

    int insert(InnodbTables record);

    int insertSelective(InnodbTables record);

    List<InnodbTables> selectByExample(InnodbTablesExample example);

    int updateByExampleSelective(@Param("record") InnodbTables record, @Param("example") InnodbTablesExample example);

    int updateByExample(@Param("record") InnodbTables record, @Param("example") InnodbTablesExample example);
}