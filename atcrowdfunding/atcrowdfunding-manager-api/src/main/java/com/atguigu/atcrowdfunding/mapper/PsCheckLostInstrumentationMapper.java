package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.PsCheckLostInstrumentation;
import com.atguigu.atcrowdfunding.bean.PsCheckLostInstrumentationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsCheckLostInstrumentationMapper {
    long countByExample(PsCheckLostInstrumentationExample example);

    int deleteByExample(PsCheckLostInstrumentationExample example);

    int insert(PsCheckLostInstrumentation record);

    int insertSelective(PsCheckLostInstrumentation record);

    List<PsCheckLostInstrumentation> selectByExample(PsCheckLostInstrumentationExample example);

    int updateByExampleSelective(@Param("record") PsCheckLostInstrumentation record, @Param("example") PsCheckLostInstrumentationExample example);

    int updateByExample(@Param("record") PsCheckLostInstrumentation record, @Param("example") PsCheckLostInstrumentationExample example);
}