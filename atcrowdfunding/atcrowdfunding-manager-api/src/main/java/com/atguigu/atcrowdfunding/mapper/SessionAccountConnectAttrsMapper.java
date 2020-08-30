package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SessionAccountConnectAttrs;
import com.atguigu.atcrowdfunding.bean.SessionAccountConnectAttrsExample;
import com.atguigu.atcrowdfunding.bean.SessionAccountConnectAttrsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionAccountConnectAttrsMapper {
    long countByExample(SessionAccountConnectAttrsExample example);

    int deleteByExample(SessionAccountConnectAttrsExample example);

    int deleteByPrimaryKey(SessionAccountConnectAttrsKey key);

    int insert(SessionAccountConnectAttrs record);

    int insertSelective(SessionAccountConnectAttrs record);

    List<SessionAccountConnectAttrs> selectByExample(SessionAccountConnectAttrsExample example);

    SessionAccountConnectAttrs selectByPrimaryKey(SessionAccountConnectAttrsKey key);

    int updateByExampleSelective(@Param("record") SessionAccountConnectAttrs record, @Param("example") SessionAccountConnectAttrsExample example);

    int updateByExample(@Param("record") SessionAccountConnectAttrs record, @Param("example") SessionAccountConnectAttrsExample example);

    int updateByPrimaryKeySelective(SessionAccountConnectAttrs record);

    int updateByPrimaryKey(SessionAccountConnectAttrs record);
}