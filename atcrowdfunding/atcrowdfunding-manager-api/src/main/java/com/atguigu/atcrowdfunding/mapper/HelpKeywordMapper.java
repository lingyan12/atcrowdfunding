package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.HelpKeyword;
import com.atguigu.atcrowdfunding.bean.HelpKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpKeywordMapper {
    long countByExample(HelpKeywordExample example);

    int deleteByExample(HelpKeywordExample example);

    int deleteByPrimaryKey(Integer helpKeywordId);

    int insert(HelpKeyword record);

    int insertSelective(HelpKeyword record);

    List<HelpKeyword> selectByExample(HelpKeywordExample example);

    HelpKeyword selectByPrimaryKey(Integer helpKeywordId);

    int updateByExampleSelective(@Param("record") HelpKeyword record, @Param("example") HelpKeywordExample example);

    int updateByExample(@Param("record") HelpKeyword record, @Param("example") HelpKeywordExample example);

    int updateByPrimaryKeySelective(HelpKeyword record);

    int updateByPrimaryKey(HelpKeyword record);
}