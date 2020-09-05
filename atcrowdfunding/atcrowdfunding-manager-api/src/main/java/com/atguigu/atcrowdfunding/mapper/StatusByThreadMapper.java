package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.StatusByThread;
import com.atguigu.atcrowdfunding.bean.StatusByThreadExample;
import com.atguigu.atcrowdfunding.bean.StatusByThreadKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusByThreadMapper {
    long countByExample(StatusByThreadExample example);

    int deleteByExample(StatusByThreadExample example);

    int deleteByPrimaryKey(StatusByThreadKey key);

    int insert(StatusByThread record);

    int insertSelective(StatusByThread record);

    List<StatusByThread> selectByExample(StatusByThreadExample example);

    StatusByThread selectByPrimaryKey(StatusByThreadKey key);

    int updateByExampleSelective(@Param("record") StatusByThread record, @Param("example") StatusByThreadExample example);

    int updateByExample(@Param("record") StatusByThread record, @Param("example") StatusByThreadExample example);

    int updateByPrimaryKeySelective(StatusByThread record);

    int updateByPrimaryKey(StatusByThread record);
}