package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EduSubject;
import com.atguigu.atcrowdfunding.bean.EduSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduSubjectMapper {
    long countByExample(EduSubjectExample example);

    int deleteByExample(EduSubjectExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduSubject record);

    int insertSelective(EduSubject record);

    List<EduSubject> selectByExample(EduSubjectExample example);

    EduSubject selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduSubject record, @Param("example") EduSubjectExample example);

    int updateByExample(@Param("record") EduSubject record, @Param("example") EduSubjectExample example);

    int updateByPrimaryKeySelective(EduSubject record);

    int updateByPrimaryKey(EduSubject record);
}