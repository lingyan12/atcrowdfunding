package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EduChapter;
import com.atguigu.atcrowdfunding.bean.EduChapterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduChapterMapper {
    long countByExample(EduChapterExample example);

    int deleteByExample(EduChapterExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduChapter record);

    int insertSelective(EduChapter record);

    List<EduChapter> selectByExample(EduChapterExample example);

    EduChapter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduChapter record, @Param("example") EduChapterExample example);

    int updateByExample(@Param("record") EduChapter record, @Param("example") EduChapterExample example);

    int updateByPrimaryKeySelective(EduChapter record);

    int updateByPrimaryKey(EduChapter record);
}