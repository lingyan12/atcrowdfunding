package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Component;
import com.atguigu.atcrowdfunding.bean.ComponentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComponentMapper {
    long countByExample(ComponentExample example);

    int deleteByExample(ComponentExample example);

    int deleteByPrimaryKey(Integer componentId);

    int insert(Component record);

    int insertSelective(Component record);

    List<Component> selectByExampleWithBLOBs(ComponentExample example);

    List<Component> selectByExample(ComponentExample example);

    Component selectByPrimaryKey(Integer componentId);

    int updateByExampleSelective(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByExampleWithBLOBs(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByExample(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByPrimaryKeySelective(Component record);

    int updateByPrimaryKeyWithBLOBs(Component record);

    int updateByPrimaryKey(Component record);
}