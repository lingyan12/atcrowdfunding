package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SessionStatus;
import com.atguigu.atcrowdfunding.bean.SessionStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionStatusMapper {
    long countByExample(SessionStatusExample example);

    int deleteByExample(SessionStatusExample example);

    int deleteByPrimaryKey(String variableName);

    int insert(SessionStatus record);

    int insertSelective(SessionStatus record);

    List<SessionStatus> selectByExample(SessionStatusExample example);

    SessionStatus selectByPrimaryKey(String variableName);

    int updateByExampleSelective(@Param("record") SessionStatus record, @Param("example") SessionStatusExample example);

    int updateByExample(@Param("record") SessionStatus record, @Param("example") SessionStatusExample example);

    int updateByPrimaryKeySelective(SessionStatus record);

    int updateByPrimaryKey(SessionStatus record);
}