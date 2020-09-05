package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ReplicationConnectionConfiguration;
import com.atguigu.atcrowdfunding.bean.ReplicationConnectionConfigurationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationConnectionConfigurationMapper {
    long countByExample(ReplicationConnectionConfigurationExample example);

    int deleteByExample(ReplicationConnectionConfigurationExample example);

    int deleteByPrimaryKey(String channelName);

    int insert(ReplicationConnectionConfiguration record);

    int insertSelective(ReplicationConnectionConfiguration record);

    List<ReplicationConnectionConfiguration> selectByExampleWithBLOBs(ReplicationConnectionConfigurationExample example);

    List<ReplicationConnectionConfiguration> selectByExample(ReplicationConnectionConfigurationExample example);

    ReplicationConnectionConfiguration selectByPrimaryKey(String channelName);

    int updateByExampleSelective(@Param("record") ReplicationConnectionConfiguration record, @Param("example") ReplicationConnectionConfigurationExample example);

    int updateByExampleWithBLOBs(@Param("record") ReplicationConnectionConfiguration record, @Param("example") ReplicationConnectionConfigurationExample example);

    int updateByExample(@Param("record") ReplicationConnectionConfiguration record, @Param("example") ReplicationConnectionConfigurationExample example);

    int updateByPrimaryKeySelective(ReplicationConnectionConfiguration record);

    int updateByPrimaryKeyWithBLOBs(ReplicationConnectionConfiguration record);

    int updateByPrimaryKey(ReplicationConnectionConfiguration record);
}