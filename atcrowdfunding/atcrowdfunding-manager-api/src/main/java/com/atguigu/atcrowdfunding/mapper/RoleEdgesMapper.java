package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.RoleEdges;
import com.atguigu.atcrowdfunding.bean.RoleEdgesExample;
import com.atguigu.atcrowdfunding.bean.RoleEdgesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleEdgesMapper {
    long countByExample(RoleEdgesExample example);

    int deleteByExample(RoleEdgesExample example);

    int deleteByPrimaryKey(RoleEdgesKey key);

    int insert(RoleEdges record);

    int insertSelective(RoleEdges record);

    List<RoleEdges> selectByExample(RoleEdgesExample example);

    RoleEdges selectByPrimaryKey(RoleEdgesKey key);

    int updateByExampleSelective(@Param("record") RoleEdges record, @Param("example") RoleEdgesExample example);

    int updateByExample(@Param("record") RoleEdges record, @Param("example") RoleEdgesExample example);

    int updateByPrimaryKeySelective(RoleEdges record);

    int updateByPrimaryKey(RoleEdges record);
}