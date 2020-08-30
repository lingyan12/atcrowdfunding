package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.GtidExecuted;
import com.atguigu.atcrowdfunding.bean.GtidExecutedExample;
import com.atguigu.atcrowdfunding.bean.GtidExecutedKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GtidExecutedMapper {
    long countByExample(GtidExecutedExample example);

    int deleteByExample(GtidExecutedExample example);

    int deleteByPrimaryKey(GtidExecutedKey key);

    int insert(GtidExecuted record);

    int insertSelective(GtidExecuted record);

    List<GtidExecuted> selectByExample(GtidExecutedExample example);

    GtidExecuted selectByPrimaryKey(GtidExecutedKey key);

    int updateByExampleSelective(@Param("record") GtidExecuted record, @Param("example") GtidExecutedExample example);

    int updateByExample(@Param("record") GtidExecuted record, @Param("example") GtidExecutedExample example);

    int updateByPrimaryKeySelective(GtidExecuted record);

    int updateByPrimaryKey(GtidExecuted record);
}