package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XInnodbLockWaits;
import com.atguigu.atcrowdfunding.bean.XInnodbLockWaitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XInnodbLockWaitsMapper {
    long countByExample(XInnodbLockWaitsExample example);

    int deleteByExample(XInnodbLockWaitsExample example);

    int insert(XInnodbLockWaits record);

    int insertSelective(XInnodbLockWaits record);

    List<XInnodbLockWaits> selectByExampleWithBLOBs(XInnodbLockWaitsExample example);

    List<XInnodbLockWaits> selectByExample(XInnodbLockWaitsExample example);

    int updateByExampleSelective(@Param("record") XInnodbLockWaits record, @Param("example") XInnodbLockWaitsExample example);

    int updateByExampleWithBLOBs(@Param("record") XInnodbLockWaits record, @Param("example") XInnodbLockWaitsExample example);

    int updateByExample(@Param("record") XInnodbLockWaits record, @Param("example") XInnodbLockWaitsExample example);
}