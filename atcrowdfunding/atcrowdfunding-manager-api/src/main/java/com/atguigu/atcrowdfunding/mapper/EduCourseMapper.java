package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EduCourse;
import com.atguigu.atcrowdfunding.bean.EduCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduCourseMapper {
    long countByExample(EduCourseExample example);

    int deleteByExample(EduCourseExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduCourse record);

    int insertSelective(EduCourse record);

    List<EduCourse> selectByExample(EduCourseExample example);

    EduCourse selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduCourse record, @Param("example") EduCourseExample example);

    int updateByExample(@Param("record") EduCourse record, @Param("example") EduCourseExample example);

    int updateByPrimaryKeySelective(EduCourse record);

    int updateByPrimaryKey(EduCourse record);
}