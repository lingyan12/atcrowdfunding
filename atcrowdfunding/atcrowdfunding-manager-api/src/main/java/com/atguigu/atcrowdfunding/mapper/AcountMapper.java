package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Acount;
import com.atguigu.atcrowdfunding.bean.AcountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcountMapper {
    long countByExample(AcountExample example);

    int deleteByExample(AcountExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Acount record);

    int insertSelective(Acount record);

    List<Acount> selectByExample(AcountExample example);

    Acount selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Acount record, @Param("example") AcountExample example);

    int updateByExample(@Param("record") Acount record, @Param("example") AcountExample example);

    int updateByPrimaryKeySelective(Acount record);

    int updateByPrimaryKey(Acount record);
}