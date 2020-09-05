package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.UserSummary;
import com.atguigu.atcrowdfunding.bean.UserSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryMapper {
    long countByExample(UserSummaryExample example);

    int deleteByExample(UserSummaryExample example);

    int insert(UserSummary record);

    int insertSelective(UserSummary record);

    List<UserSummary> selectByExample(UserSummaryExample example);

    int updateByExampleSelective(@Param("record") UserSummary record, @Param("example") UserSummaryExample example);

    int updateByExample(@Param("record") UserSummary record, @Param("example") UserSummaryExample example);
}