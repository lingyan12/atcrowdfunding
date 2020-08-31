package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Parameters;
import com.atguigu.atcrowdfunding.bean.ParametersExample;
import com.atguigu.atcrowdfunding.bean.ParametersWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParametersMapper {
    long countByExample(ParametersExample example);

    int deleteByExample(ParametersExample example);

    int insert(ParametersWithBLOBs record);

    int insertSelective(ParametersWithBLOBs record);

    List<ParametersWithBLOBs> selectByExampleWithBLOBs(ParametersExample example);

    List<Parameters> selectByExample(ParametersExample example);

    int updateByExampleSelective(@Param("record") ParametersWithBLOBs record, @Param("example") ParametersExample example);

    int updateByExampleWithBLOBs(@Param("record") ParametersWithBLOBs record, @Param("example") ParametersExample example);

    int updateByExample(@Param("record") Parameters record, @Param("example") ParametersExample example);
}