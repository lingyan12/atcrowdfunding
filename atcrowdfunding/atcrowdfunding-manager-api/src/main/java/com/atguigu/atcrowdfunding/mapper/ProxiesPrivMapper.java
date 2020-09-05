package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ProxiesPriv;
import com.atguigu.atcrowdfunding.bean.ProxiesPrivExample;
import com.atguigu.atcrowdfunding.bean.ProxiesPrivKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProxiesPrivMapper {
    long countByExample(ProxiesPrivExample example);

    int deleteByExample(ProxiesPrivExample example);

    int deleteByPrimaryKey(ProxiesPrivKey key);

    int insert(ProxiesPriv record);

    int insertSelective(ProxiesPriv record);

    List<ProxiesPriv> selectByExample(ProxiesPrivExample example);

    ProxiesPriv selectByPrimaryKey(ProxiesPrivKey key);

    int updateByExampleSelective(@Param("record") ProxiesPriv record, @Param("example") ProxiesPrivExample example);

    int updateByExample(@Param("record") ProxiesPriv record, @Param("example") ProxiesPrivExample example);

    int updateByPrimaryKeySelective(ProxiesPriv record);

    int updateByPrimaryKey(ProxiesPriv record);
}