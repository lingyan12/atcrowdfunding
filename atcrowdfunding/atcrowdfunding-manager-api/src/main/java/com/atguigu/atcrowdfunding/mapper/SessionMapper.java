package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Session;
import com.atguigu.atcrowdfunding.bean.SessionExample;
import com.atguigu.atcrowdfunding.bean.SessionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionMapper {
    long countByExample(SessionExample example);

    int deleteByExample(SessionExample example);

    int insert(SessionWithBLOBs record);

    int insertSelective(SessionWithBLOBs record);

    List<SessionWithBLOBs> selectByExampleWithBLOBs(SessionExample example);

    List<Session> selectByExample(SessionExample example);

    int updateByExampleSelective(@Param("record") SessionWithBLOBs record, @Param("example") SessionExample example);

    int updateByExampleWithBLOBs(@Param("record") SessionWithBLOBs record, @Param("example") SessionExample example);

    int updateByExample(@Param("record") Session record, @Param("example") SessionExample example);
}