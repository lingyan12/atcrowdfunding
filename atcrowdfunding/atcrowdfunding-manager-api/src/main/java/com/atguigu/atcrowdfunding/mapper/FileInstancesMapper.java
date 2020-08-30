package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.FileInstances;
import com.atguigu.atcrowdfunding.bean.FileInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileInstancesMapper {
    long countByExample(FileInstancesExample example);

    int deleteByExample(FileInstancesExample example);

    int deleteByPrimaryKey(String fileName);

    int insert(FileInstances record);

    int insertSelective(FileInstances record);

    List<FileInstances> selectByExample(FileInstancesExample example);

    FileInstances selectByPrimaryKey(String fileName);

    int updateByExampleSelective(@Param("record") FileInstances record, @Param("example") FileInstancesExample example);

    int updateByExample(@Param("record") FileInstances record, @Param("example") FileInstancesExample example);

    int updateByPrimaryKeySelective(FileInstances record);

    int updateByPrimaryKey(FileInstances record);
}