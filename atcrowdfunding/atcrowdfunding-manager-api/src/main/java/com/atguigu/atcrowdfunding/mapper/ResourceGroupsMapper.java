package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ResourceGroups;
import com.atguigu.atcrowdfunding.bean.ResourceGroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceGroupsMapper {
    long countByExample(ResourceGroupsExample example);

    int deleteByExample(ResourceGroupsExample example);

    int insert(ResourceGroups record);

    int insertSelective(ResourceGroups record);

    List<ResourceGroups> selectByExampleWithBLOBs(ResourceGroupsExample example);

    List<ResourceGroups> selectByExample(ResourceGroupsExample example);

    int updateByExampleSelective(@Param("record") ResourceGroups record, @Param("example") ResourceGroupsExample example);

    int updateByExampleWithBLOBs(@Param("record") ResourceGroups record, @Param("example") ResourceGroupsExample example);

    int updateByExample(@Param("record") ResourceGroups record, @Param("example") ResourceGroupsExample example);
}