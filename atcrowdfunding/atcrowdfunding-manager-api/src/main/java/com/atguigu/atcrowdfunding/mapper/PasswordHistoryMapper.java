package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.PasswordHistory;
import com.atguigu.atcrowdfunding.bean.PasswordHistoryExample;
import com.atguigu.atcrowdfunding.bean.PasswordHistoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PasswordHistoryMapper {
    long countByExample(PasswordHistoryExample example);

    int deleteByExample(PasswordHistoryExample example);

    int deleteByPrimaryKey(PasswordHistoryKey key);

    int insert(PasswordHistory record);

    int insertSelective(PasswordHistory record);

    List<PasswordHistory> selectByExampleWithBLOBs(PasswordHistoryExample example);

    List<PasswordHistory> selectByExample(PasswordHistoryExample example);

    PasswordHistory selectByPrimaryKey(PasswordHistoryKey key);

    int updateByExampleSelective(@Param("record") PasswordHistory record, @Param("example") PasswordHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") PasswordHistory record, @Param("example") PasswordHistoryExample example);

    int updateByExample(@Param("record") PasswordHistory record, @Param("example") PasswordHistoryExample example);

    int updateByPrimaryKeySelective(PasswordHistory record);

    int updateByPrimaryKeyWithBLOBs(PasswordHistory record);
}