package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SchemaPrivileges;
import com.atguigu.atcrowdfunding.bean.SchemaPrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaPrivilegesMapper {
    long countByExample(SchemaPrivilegesExample example);

    int deleteByExample(SchemaPrivilegesExample example);

    int insert(SchemaPrivileges record);

    int insertSelective(SchemaPrivileges record);

    List<SchemaPrivileges> selectByExample(SchemaPrivilegesExample example);

    int updateByExampleSelective(@Param("record") SchemaPrivileges record, @Param("example") SchemaPrivilegesExample example);

    int updateByExample(@Param("record") SchemaPrivileges record, @Param("example") SchemaPrivilegesExample example);
}