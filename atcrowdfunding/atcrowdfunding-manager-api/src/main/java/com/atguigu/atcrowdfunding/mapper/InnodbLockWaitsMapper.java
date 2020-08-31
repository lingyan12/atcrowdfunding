package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbLockWaits;
import com.atguigu.atcrowdfunding.bean.InnodbLockWaitsExample;
import com.atguigu.atcrowdfunding.bean.InnodbLockWaitsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbLockWaitsMapper {
    long countByExample(InnodbLockWaitsExample example);

    int deleteByExample(InnodbLockWaitsExample example);

    int insert(InnodbLockWaitsWithBLOBs record);

    int insertSelective(InnodbLockWaitsWithBLOBs record);

    List<InnodbLockWaitsWithBLOBs> selectByExampleWithBLOBs(InnodbLockWaitsExample example);

    List<InnodbLockWaits> selectByExample(InnodbLockWaitsExample example);

    int updateByExampleSelective(@Param("record") InnodbLockWaitsWithBLOBs record, @Param("example") InnodbLockWaitsExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbLockWaitsWithBLOBs record, @Param("example") InnodbLockWaitsExample example);

    int updateByExample(@Param("record") InnodbLockWaits record, @Param("example") InnodbLockWaitsExample example);
}