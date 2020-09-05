package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.UserVariablesByThread;
import com.atguigu.atcrowdfunding.bean.UserVariablesByThreadExample;
import com.atguigu.atcrowdfunding.bean.UserVariablesByThreadKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserVariablesByThreadMapper {
    long countByExample(UserVariablesByThreadExample example);

    int deleteByExample(UserVariablesByThreadExample example);

    int deleteByPrimaryKey(UserVariablesByThreadKey key);

    int insert(UserVariablesByThread record);

    int insertSelective(UserVariablesByThread record);

    List<UserVariablesByThread> selectByExampleWithBLOBs(UserVariablesByThreadExample example);

    List<UserVariablesByThread> selectByExample(UserVariablesByThreadExample example);

    UserVariablesByThread selectByPrimaryKey(UserVariablesByThreadKey key);

    int updateByExampleSelective(@Param("record") UserVariablesByThread record, @Param("example") UserVariablesByThreadExample example);

    int updateByExampleWithBLOBs(@Param("record") UserVariablesByThread record, @Param("example") UserVariablesByThreadExample example);

    int updateByExample(@Param("record") UserVariablesByThread record, @Param("example") UserVariablesByThreadExample example);

    int updateByPrimaryKeySelective(UserVariablesByThread record);

    int updateByPrimaryKeyWithBLOBs(UserVariablesByThread record);
}