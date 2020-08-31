package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ApplicableRoles;
import com.atguigu.atcrowdfunding.bean.ApplicableRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicableRolesMapper {
    long countByExample(ApplicableRolesExample example);

    int deleteByExample(ApplicableRolesExample example);

    int insert(ApplicableRoles record);

    int insertSelective(ApplicableRoles record);

    List<ApplicableRoles> selectByExample(ApplicableRolesExample example);

    int updateByExampleSelective(@Param("record") ApplicableRoles record, @Param("example") ApplicableRolesExample example);

    int updateByExample(@Param("record") ApplicableRoles record, @Param("example") ApplicableRolesExample example);
}