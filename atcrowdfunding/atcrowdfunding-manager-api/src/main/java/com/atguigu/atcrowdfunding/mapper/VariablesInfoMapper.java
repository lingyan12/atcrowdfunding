package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.VariablesInfo;
import com.atguigu.atcrowdfunding.bean.VariablesInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VariablesInfoMapper {
    long countByExample(VariablesInfoExample example);

    int deleteByExample(VariablesInfoExample example);

    int insert(VariablesInfo record);

    int insertSelective(VariablesInfo record);

    List<VariablesInfo> selectByExample(VariablesInfoExample example);

    int updateByExampleSelective(@Param("record") VariablesInfo record, @Param("example") VariablesInfoExample example);

    int updateByExample(@Param("record") VariablesInfo record, @Param("example") VariablesInfoExample example);
}