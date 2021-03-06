package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XUserSummaryByStatementType;
import com.atguigu.atcrowdfunding.bean.XUserSummaryByStatementTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryByStatementTypeMapper {
    long countByExample(XUserSummaryByStatementTypeExample example);

    int deleteByExample(XUserSummaryByStatementTypeExample example);

    int insert(XUserSummaryByStatementType record);

    int insertSelective(XUserSummaryByStatementType record);

    List<XUserSummaryByStatementType> selectByExample(XUserSummaryByStatementTypeExample example);

    int updateByExampleSelective(@Param("record") XUserSummaryByStatementType record, @Param("example") XUserSummaryByStatementTypeExample example);

    int updateByExample(@Param("record") XUserSummaryByStatementType record, @Param("example") XUserSummaryByStatementTypeExample example);
}