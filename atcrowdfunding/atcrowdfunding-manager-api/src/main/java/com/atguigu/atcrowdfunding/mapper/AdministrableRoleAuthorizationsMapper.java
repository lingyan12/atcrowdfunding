package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.AdministrableRoleAuthorizations;
import com.atguigu.atcrowdfunding.bean.AdministrableRoleAuthorizationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdministrableRoleAuthorizationsMapper {
    long countByExample(AdministrableRoleAuthorizationsExample example);

    int deleteByExample(AdministrableRoleAuthorizationsExample example);

    int insert(AdministrableRoleAuthorizations record);

    int insertSelective(AdministrableRoleAuthorizations record);

    List<AdministrableRoleAuthorizations> selectByExample(AdministrableRoleAuthorizationsExample example);

    int updateByExampleSelective(@Param("record") AdministrableRoleAuthorizations record, @Param("example") AdministrableRoleAuthorizationsExample example);

    int updateByExample(@Param("record") AdministrableRoleAuthorizations record, @Param("example") AdministrableRoleAuthorizationsExample example);
}