package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SessionConnectAttrs;
import com.atguigu.atcrowdfunding.bean.SessionConnectAttrsExample;
import com.atguigu.atcrowdfunding.bean.SessionConnectAttrsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionConnectAttrsMapper {
    long countByExample(SessionConnectAttrsExample example);

    int deleteByExample(SessionConnectAttrsExample example);

    int deleteByPrimaryKey(SessionConnectAttrsKey key);

    int insert(SessionConnectAttrs record);

    int insertSelective(SessionConnectAttrs record);

    List<SessionConnectAttrs> selectByExample(SessionConnectAttrsExample example);

    SessionConnectAttrs selectByPrimaryKey(SessionConnectAttrsKey key);

    int updateByExampleSelective(@Param("record") SessionConnectAttrs record, @Param("example") SessionConnectAttrsExample example);

    int updateByExample(@Param("record") SessionConnectAttrs record, @Param("example") SessionConnectAttrsExample example);

    int updateByPrimaryKeySelective(SessionConnectAttrs record);

    int updateByPrimaryKey(SessionConnectAttrs record);
}