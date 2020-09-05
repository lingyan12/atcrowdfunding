package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.UserSummaryByStages;
import com.atguigu.atcrowdfunding.bean.UserSummaryByStagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByStagesMapper {
    long countByExample(UserSummaryByStagesExample example);

    int deleteByExample(UserSummaryByStagesExample example);

    int insert(UserSummaryByStages record);

    int insertSelective(UserSummaryByStages record);

    List<UserSummaryByStages> selectByExample(UserSummaryByStagesExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByStages record, @Param("example") UserSummaryByStagesExample example);

    int updateByExample(@Param("record") UserSummaryByStages record, @Param("example") UserSummaryByStagesExample example);
}