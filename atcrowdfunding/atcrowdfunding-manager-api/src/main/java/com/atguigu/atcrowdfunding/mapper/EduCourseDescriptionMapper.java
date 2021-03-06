package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EduCourseDescription;
import com.atguigu.atcrowdfunding.bean.EduCourseDescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduCourseDescriptionMapper {
    long countByExample(EduCourseDescriptionExample example);

    int deleteByExample(EduCourseDescriptionExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduCourseDescription record);

    int insertSelective(EduCourseDescription record);

    List<EduCourseDescription> selectByExampleWithBLOBs(EduCourseDescriptionExample example);

    List<EduCourseDescription> selectByExample(EduCourseDescriptionExample example);

    EduCourseDescription selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduCourseDescription record, @Param("example") EduCourseDescriptionExample example);

    int updateByExampleWithBLOBs(@Param("record") EduCourseDescription record, @Param("example") EduCourseDescriptionExample example);

    int updateByExample(@Param("record") EduCourseDescription record, @Param("example") EduCourseDescriptionExample example);

    int updateByPrimaryKeySelective(EduCourseDescription record);

    int updateByPrimaryKeyWithBLOBs(EduCourseDescription record);

    int updateByPrimaryKey(EduCourseDescription record);
}