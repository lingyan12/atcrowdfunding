package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ReplicationConnectionStatus;
import com.atguigu.atcrowdfunding.bean.ReplicationConnectionStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationConnectionStatusMapper {
    long countByExample(ReplicationConnectionStatusExample example);

    int deleteByExample(ReplicationConnectionStatusExample example);

    int deleteByPrimaryKey(String channelName);

    int insert(ReplicationConnectionStatus record);

    int insertSelective(ReplicationConnectionStatus record);

    List<ReplicationConnectionStatus> selectByExampleWithBLOBs(ReplicationConnectionStatusExample example);

    List<ReplicationConnectionStatus> selectByExample(ReplicationConnectionStatusExample example);

    ReplicationConnectionStatus selectByPrimaryKey(String channelName);

    int updateByExampleSelective(@Param("record") ReplicationConnectionStatus record, @Param("example") ReplicationConnectionStatusExample example);

    int updateByExampleWithBLOBs(@Param("record") ReplicationConnectionStatus record, @Param("example") ReplicationConnectionStatusExample example);

    int updateByExample(@Param("record") ReplicationConnectionStatus record, @Param("example") ReplicationConnectionStatusExample example);

    int updateByPrimaryKeySelective(ReplicationConnectionStatus record);

    int updateByPrimaryKeyWithBLOBs(ReplicationConnectionStatus record);

    int updateByPrimaryKey(ReplicationConnectionStatus record);
}