package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ReplicationApplierStatusByCoordinator;
import com.atguigu.atcrowdfunding.bean.ReplicationApplierStatusByCoordinatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationApplierStatusByCoordinatorMapper {
    long countByExample(ReplicationApplierStatusByCoordinatorExample example);

    int deleteByExample(ReplicationApplierStatusByCoordinatorExample example);

    int deleteByPrimaryKey(String channelName);

    int insert(ReplicationApplierStatusByCoordinator record);

    int insertSelective(ReplicationApplierStatusByCoordinator record);

    List<ReplicationApplierStatusByCoordinator> selectByExample(ReplicationApplierStatusByCoordinatorExample example);

    ReplicationApplierStatusByCoordinator selectByPrimaryKey(String channelName);

    int updateByExampleSelective(@Param("record") ReplicationApplierStatusByCoordinator record, @Param("example") ReplicationApplierStatusByCoordinatorExample example);

    int updateByExample(@Param("record") ReplicationApplierStatusByCoordinator record, @Param("example") ReplicationApplierStatusByCoordinatorExample example);

    int updateByPrimaryKeySelective(ReplicationApplierStatusByCoordinator record);

    int updateByPrimaryKey(ReplicationApplierStatusByCoordinator record);
}