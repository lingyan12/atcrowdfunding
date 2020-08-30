package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ReplicationApplierStatus;
import com.atguigu.atcrowdfunding.bean.ReplicationApplierStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationApplierStatusMapper {
    long countByExample(ReplicationApplierStatusExample example);

    int deleteByExample(ReplicationApplierStatusExample example);

    int deleteByPrimaryKey(String channelName);

    int insert(ReplicationApplierStatus record);

    int insertSelective(ReplicationApplierStatus record);

    List<ReplicationApplierStatus> selectByExample(ReplicationApplierStatusExample example);

    ReplicationApplierStatus selectByPrimaryKey(String channelName);

    int updateByExampleSelective(@Param("record") ReplicationApplierStatus record, @Param("example") ReplicationApplierStatusExample example);

    int updateByExample(@Param("record") ReplicationApplierStatus record, @Param("example") ReplicationApplierStatusExample example);

    int updateByPrimaryKeySelective(ReplicationApplierStatus record);

    int updateByPrimaryKey(ReplicationApplierStatus record);
}