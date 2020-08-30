package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.DataLockWaits;
import com.atguigu.atcrowdfunding.bean.DataLockWaitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataLockWaitsMapper {
    long countByExample(DataLockWaitsExample example);

    int deleteByExample(DataLockWaitsExample example);

    int insert(DataLockWaits record);

    int insertSelective(DataLockWaits record);

    List<DataLockWaits> selectByExample(DataLockWaitsExample example);

    int updateByExampleSelective(@Param("record") DataLockWaits record, @Param("example") DataLockWaitsExample example);

    int updateByExample(@Param("record") DataLockWaits record, @Param("example") DataLockWaitsExample example);
}