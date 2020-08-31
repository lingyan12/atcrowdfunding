package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Schemata;
import com.atguigu.atcrowdfunding.bean.SchemataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemataMapper {
    long countByExample(SchemataExample example);

    int deleteByExample(SchemataExample example);

    int insert(Schemata record);

    int insertSelective(Schemata record);

    List<Schemata> selectByExampleWithBLOBs(SchemataExample example);

    List<Schemata> selectByExample(SchemataExample example);

    int updateByExampleSelective(@Param("record") Schemata record, @Param("example") SchemataExample example);

    int updateByExampleWithBLOBs(@Param("record") Schemata record, @Param("example") SchemataExample example);

    int updateByExample(@Param("record") Schemata record, @Param("example") SchemataExample example);
}