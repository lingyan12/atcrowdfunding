package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SocketInstances;
import com.atguigu.atcrowdfunding.bean.SocketInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocketInstancesMapper {
    long countByExample(SocketInstancesExample example);

    int deleteByExample(SocketInstancesExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(SocketInstances record);

    int insertSelective(SocketInstances record);

    List<SocketInstances> selectByExample(SocketInstancesExample example);

    SocketInstances selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") SocketInstances record, @Param("example") SocketInstancesExample example);

    int updateByExample(@Param("record") SocketInstances record, @Param("example") SocketInstancesExample example);

    int updateByPrimaryKeySelective(SocketInstances record);

    int updateByPrimaryKey(SocketInstances record);
}