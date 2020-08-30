package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.MutexInstances;
import com.atguigu.atcrowdfunding.bean.MutexInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MutexInstancesMapper {
    long countByExample(MutexInstancesExample example);

    int deleteByExample(MutexInstancesExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(MutexInstances record);

    int insertSelective(MutexInstances record);

    List<MutexInstances> selectByExample(MutexInstancesExample example);

    MutexInstances selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") MutexInstances record, @Param("example") MutexInstancesExample example);

    int updateByExample(@Param("record") MutexInstances record, @Param("example") MutexInstancesExample example);

    int updateByPrimaryKeySelective(MutexInstances record);

    int updateByPrimaryKey(MutexInstances record);
}