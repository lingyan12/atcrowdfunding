package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EduTeacher;
import com.atguigu.atcrowdfunding.bean.EduTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduTeacherMapper {
    long countByExample(EduTeacherExample example);

    int deleteByExample(EduTeacherExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduTeacher record);

    int insertSelective(EduTeacher record);

    List<EduTeacher> selectByExampleWithBLOBs(EduTeacherExample example);

    List<EduTeacher> selectByExample(EduTeacherExample example);

    EduTeacher selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduTeacher record, @Param("example") EduTeacherExample example);

    int updateByExampleWithBLOBs(@Param("record") EduTeacher record, @Param("example") EduTeacherExample example);

    int updateByExample(@Param("record") EduTeacher record, @Param("example") EduTeacherExample example);

    int updateByPrimaryKeySelective(EduTeacher record);

    int updateByPrimaryKeyWithBLOBs(EduTeacher record);

    int updateByPrimaryKey(EduTeacher record);
}