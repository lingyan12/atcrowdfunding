package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Collations;
import com.atguigu.atcrowdfunding.bean.CollationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollationsMapper {
    long countByExample(CollationsExample example);

    int deleteByExample(CollationsExample example);

    int insert(Collations record);

    int insertSelective(Collations record);

    List<Collations> selectByExample(CollationsExample example);

    int updateByExampleSelective(@Param("record") Collations record, @Param("example") CollationsExample example);

    int updateByExample(@Param("record") Collations record, @Param("example") CollationsExample example);
}