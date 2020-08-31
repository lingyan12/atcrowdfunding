package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XStatementsWithErrorsOrWarnings;
import com.atguigu.atcrowdfunding.bean.XStatementsWithErrorsOrWarningsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XStatementsWithErrorsOrWarningsMapper {
    long countByExample(XStatementsWithErrorsOrWarningsExample example);

    int deleteByExample(XStatementsWithErrorsOrWarningsExample example);

    int insert(XStatementsWithErrorsOrWarnings record);

    int insertSelective(XStatementsWithErrorsOrWarnings record);

    List<XStatementsWithErrorsOrWarnings> selectByExampleWithBLOBs(XStatementsWithErrorsOrWarningsExample example);

    List<XStatementsWithErrorsOrWarnings> selectByExample(XStatementsWithErrorsOrWarningsExample example);

    int updateByExampleSelective(@Param("record") XStatementsWithErrorsOrWarnings record, @Param("example") XStatementsWithErrorsOrWarningsExample example);

    int updateByExampleWithBLOBs(@Param("record") XStatementsWithErrorsOrWarnings record, @Param("example") XStatementsWithErrorsOrWarningsExample example);

    int updateByExample(@Param("record") XStatementsWithErrorsOrWarnings record, @Param("example") XStatementsWithErrorsOrWarningsExample example);
}