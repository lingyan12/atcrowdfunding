package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.DataLocks;
import com.atguigu.atcrowdfunding.bean.DataLocksExample;
import com.atguigu.atcrowdfunding.bean.DataLocksKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataLocksMapper {
    long countByExample(DataLocksExample example);

    int deleteByExample(DataLocksExample example);

    int deleteByPrimaryKey(DataLocksKey key);

    int insert(DataLocks record);

    int insertSelective(DataLocks record);

    List<DataLocks> selectByExample(DataLocksExample example);

    DataLocks selectByPrimaryKey(DataLocksKey key);

    int updateByExampleSelective(@Param("record") DataLocks record, @Param("example") DataLocksExample example);

    int updateByExample(@Param("record") DataLocks record, @Param("example") DataLocksExample example);

    int updateByPrimaryKeySelective(DataLocks record);

    int updateByPrimaryKey(DataLocks record);
}