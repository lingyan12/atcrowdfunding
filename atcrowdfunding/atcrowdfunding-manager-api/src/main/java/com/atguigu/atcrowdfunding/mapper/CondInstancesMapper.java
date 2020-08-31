package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.CondInstances;
import com.atguigu.atcrowdfunding.bean.CondInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CondInstancesMapper {
    long countByExample(CondInstancesExample example);

    int deleteByExample(CondInstancesExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(CondInstances record);

    int insertSelective(CondInstances record);

    List<CondInstances> selectByExample(CondInstancesExample example);

    CondInstances selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") CondInstances record, @Param("example") CondInstancesExample example);

    int updateByExample(@Param("record") CondInstances record, @Param("example") CondInstancesExample example);

    int updateByPrimaryKeySelective(CondInstances record);

    int updateByPrimaryKey(CondInstances record);
}