package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.UserSummaryByStatementType;
import com.atguigu.atcrowdfunding.bean.UserSummaryByStatementTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByStatementTypeMapper {
    long countByExample(UserSummaryByStatementTypeExample example);

    int deleteByExample(UserSummaryByStatementTypeExample example);

    int insert(UserSummaryByStatementType record);

    int insertSelective(UserSummaryByStatementType record);

    List<UserSummaryByStatementType> selectByExample(UserSummaryByStatementTypeExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByStatementType record, @Param("example") UserSummaryByStatementTypeExample example);

    int updateByExample(@Param("record") UserSummaryByStatementType record, @Param("example") UserSummaryByStatementTypeExample example);
}