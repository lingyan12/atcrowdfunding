package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.A;
import com.atguigu.atcrowdfunding.bean.AExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AMapper {
    long countByExample(AExample example);

    int deleteByExample(AExample example);

    int insert(A record);

    int insertSelective(A record);

    List<A> selectByExample(AExample example);

    int updateByExampleSelective(@Param("record") A record, @Param("example") AExample example);

    int updateByExample(@Param("record") A record, @Param("example") AExample example);
}