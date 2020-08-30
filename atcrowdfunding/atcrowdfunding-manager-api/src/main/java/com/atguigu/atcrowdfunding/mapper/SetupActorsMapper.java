package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SetupActors;
import com.atguigu.atcrowdfunding.bean.SetupActorsExample;
import com.atguigu.atcrowdfunding.bean.SetupActorsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupActorsMapper {
    long countByExample(SetupActorsExample example);

    int deleteByExample(SetupActorsExample example);

    int deleteByPrimaryKey(SetupActorsKey key);

    int insert(SetupActors record);

    int insertSelective(SetupActors record);

    List<SetupActors> selectByExample(SetupActorsExample example);

    SetupActors selectByPrimaryKey(SetupActorsKey key);

    int updateByExampleSelective(@Param("record") SetupActors record, @Param("example") SetupActorsExample example);

    int updateByExample(@Param("record") SetupActors record, @Param("example") SetupActorsExample example);

    int updateByPrimaryKeySelective(SetupActors record);

    int updateByPrimaryKey(SetupActors record);
}