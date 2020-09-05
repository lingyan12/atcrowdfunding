package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Files;
import com.atguigu.atcrowdfunding.bean.FilesExample;
import com.atguigu.atcrowdfunding.bean.FilesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilesMapper {
    long countByExample(FilesExample example);

    int deleteByExample(FilesExample example);

    int insert(FilesWithBLOBs record);

    int insertSelective(FilesWithBLOBs record);

    List<FilesWithBLOBs> selectByExampleWithBLOBs(FilesExample example);

    List<Files> selectByExample(FilesExample example);

    int updateByExampleSelective(@Param("record") FilesWithBLOBs record, @Param("example") FilesExample example);

    int updateByExampleWithBLOBs(@Param("record") FilesWithBLOBs record, @Param("example") FilesExample example);

    int updateByExample(@Param("record") Files record, @Param("example") FilesExample example);
}