package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.TJob;
import com.atguigu.atcrowdfunding.bean.TJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TJobMapper {
    long countByExample(TJobExample example);

    int deleteByExample(TJobExample example);

    int deleteByPrimaryKey(Integer jobId);

    int insert(TJob record);

    int insertSelective(TJob record);

    List<TJob> selectByExample(TJobExample example);

    TJob selectByPrimaryKey(Integer jobId);

    int updateByExampleSelective(@Param("record") TJob record, @Param("example") TJobExample example);

    int updateByExample(@Param("record") TJob record, @Param("example") TJobExample example);

    int updateByPrimaryKeySelective(TJob record);

    int updateByPrimaryKey(TJob record);
}