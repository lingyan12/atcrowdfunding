package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbDatafiles;
import com.atguigu.atcrowdfunding.bean.InnodbDatafilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbDatafilesMapper {
    long countByExample(InnodbDatafilesExample example);

    int deleteByExample(InnodbDatafilesExample example);

    int insert(InnodbDatafiles record);

    int insertSelective(InnodbDatafiles record);

    List<InnodbDatafiles> selectByExampleWithBLOBs(InnodbDatafilesExample example);

    List<InnodbDatafiles> selectByExample(InnodbDatafilesExample example);

    int updateByExampleSelective(@Param("record") InnodbDatafiles record, @Param("example") InnodbDatafilesExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbDatafiles record, @Param("example") InnodbDatafilesExample example);

    int updateByExample(@Param("record") InnodbDatafiles record, @Param("example") InnodbDatafilesExample example);
}