package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.DefaultRolesExample;
import com.atguigu.atcrowdfunding.bean.DefaultRolesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DefaultRolesMapper {
    long countByExample(DefaultRolesExample example);

    int deleteByExample(DefaultRolesExample example);

    int deleteByPrimaryKey(DefaultRolesKey key);

    int insert(DefaultRolesKey record);

    int insertSelective(DefaultRolesKey record);

    List<DefaultRolesKey> selectByExample(DefaultRolesExample example);

    int updateByExampleSelective(@Param("record") DefaultRolesKey record, @Param("example") DefaultRolesExample example);

    int updateByExample(@Param("record") DefaultRolesKey record, @Param("example") DefaultRolesExample example);
}