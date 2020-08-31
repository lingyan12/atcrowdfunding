package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.HelpRelationExample;
import com.atguigu.atcrowdfunding.bean.HelpRelationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpRelationMapper {
    long countByExample(HelpRelationExample example);

    int deleteByExample(HelpRelationExample example);

    int deleteByPrimaryKey(HelpRelationKey key);

    int insert(HelpRelationKey record);

    int insertSelective(HelpRelationKey record);

    List<HelpRelationKey> selectByExample(HelpRelationExample example);

    int updateByExampleSelective(@Param("record") HelpRelationKey record, @Param("example") HelpRelationExample example);

    int updateByExample(@Param("record") HelpRelationKey record, @Param("example") HelpRelationExample example);
}