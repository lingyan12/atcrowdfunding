package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.TablePrivileges;
import com.atguigu.atcrowdfunding.bean.TablePrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablePrivilegesMapper {
    long countByExample(TablePrivilegesExample example);

    int deleteByExample(TablePrivilegesExample example);

    int insert(TablePrivileges record);

    int insertSelective(TablePrivileges record);

    List<TablePrivileges> selectByExample(TablePrivilegesExample example);

    int updateByExampleSelective(@Param("record") TablePrivileges record, @Param("example") TablePrivilegesExample example);

    int updateByExample(@Param("record") TablePrivileges record, @Param("example") TablePrivilegesExample example);
}