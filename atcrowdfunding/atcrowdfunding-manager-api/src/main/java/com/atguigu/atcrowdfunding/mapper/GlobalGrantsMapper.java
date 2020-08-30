package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.GlobalGrants;
import com.atguigu.atcrowdfunding.bean.GlobalGrantsExample;
import com.atguigu.atcrowdfunding.bean.GlobalGrantsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GlobalGrantsMapper {
    long countByExample(GlobalGrantsExample example);

    int deleteByExample(GlobalGrantsExample example);

    int deleteByPrimaryKey(GlobalGrantsKey key);

    int insert(GlobalGrants record);

    int insertSelective(GlobalGrants record);

    List<GlobalGrants> selectByExample(GlobalGrantsExample example);

    GlobalGrants selectByPrimaryKey(GlobalGrantsKey key);

    int updateByExampleSelective(@Param("record") GlobalGrants record, @Param("example") GlobalGrantsExample example);

    int updateByExample(@Param("record") GlobalGrants record, @Param("example") GlobalGrantsExample example);

    int updateByPrimaryKeySelective(GlobalGrants record);

    int updateByPrimaryKey(GlobalGrants record);
}