package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SessionSslStatus;
import com.atguigu.atcrowdfunding.bean.SessionSslStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionSslStatusMapper {
    long countByExample(SessionSslStatusExample example);

    int deleteByExample(SessionSslStatusExample example);

    int insert(SessionSslStatus record);

    int insertSelective(SessionSslStatus record);

    List<SessionSslStatus> selectByExample(SessionSslStatusExample example);

    int updateByExampleSelective(@Param("record") SessionSslStatus record, @Param("example") SessionSslStatusExample example);

    int updateByExample(@Param("record") SessionSslStatus record, @Param("example") SessionSslStatusExample example);
}