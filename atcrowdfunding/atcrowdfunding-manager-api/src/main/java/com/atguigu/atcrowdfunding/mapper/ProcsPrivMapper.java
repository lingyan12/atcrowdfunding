package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ProcsPriv;
import com.atguigu.atcrowdfunding.bean.ProcsPrivExample;
import com.atguigu.atcrowdfunding.bean.ProcsPrivKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcsPrivMapper {
    long countByExample(ProcsPrivExample example);

    int deleteByExample(ProcsPrivExample example);

    int deleteByPrimaryKey(ProcsPrivKey key);

    int insert(ProcsPriv record);

    int insertSelective(ProcsPriv record);

    List<ProcsPriv> selectByExample(ProcsPrivExample example);

    ProcsPriv selectByPrimaryKey(ProcsPrivKey key);

    int updateByExampleSelective(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);

    int updateByExample(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);

    int updateByPrimaryKeySelective(ProcsPriv record);

    int updateByPrimaryKey(ProcsPriv record);
}