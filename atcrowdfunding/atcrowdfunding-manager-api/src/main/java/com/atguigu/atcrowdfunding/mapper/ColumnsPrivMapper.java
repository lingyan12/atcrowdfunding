package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ColumnsPriv;
import com.atguigu.atcrowdfunding.bean.ColumnsPrivExample;
import com.atguigu.atcrowdfunding.bean.ColumnsPrivKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnsPrivMapper {
    long countByExample(ColumnsPrivExample example);

    int deleteByExample(ColumnsPrivExample example);

    int deleteByPrimaryKey(ColumnsPrivKey key);

    int insert(ColumnsPriv record);

    int insertSelective(ColumnsPriv record);

    List<ColumnsPriv> selectByExample(ColumnsPrivExample example);

    ColumnsPriv selectByPrimaryKey(ColumnsPrivKey key);

    int updateByExampleSelective(@Param("record") ColumnsPriv record, @Param("example") ColumnsPrivExample example);

    int updateByExample(@Param("record") ColumnsPriv record, @Param("example") ColumnsPrivExample example);

    int updateByPrimaryKeySelective(ColumnsPriv record);

    int updateByPrimaryKey(ColumnsPriv record);
}