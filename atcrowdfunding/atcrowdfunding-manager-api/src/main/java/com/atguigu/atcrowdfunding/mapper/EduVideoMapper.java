package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EduVideo;
import com.atguigu.atcrowdfunding.bean.EduVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduVideoMapper {
    long countByExample(EduVideoExample example);

    int deleteByExample(EduVideoExample example);

    int deleteByPrimaryKey(String id);

    int insert(EduVideo record);

    int insertSelective(EduVideo record);

    List<EduVideo> selectByExample(EduVideoExample example);

    EduVideo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EduVideo record, @Param("example") EduVideoExample example);

    int updateByExample(@Param("record") EduVideo record, @Param("example") EduVideoExample example);

    int updateByPrimaryKeySelective(EduVideo record);

    int updateByPrimaryKey(EduVideo record);
}