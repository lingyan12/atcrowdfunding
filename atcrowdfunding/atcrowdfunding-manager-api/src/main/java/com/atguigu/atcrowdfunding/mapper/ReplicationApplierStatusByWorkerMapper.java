package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ReplicationApplierStatusByWorker;
import com.atguigu.atcrowdfunding.bean.ReplicationApplierStatusByWorkerExample;
import com.atguigu.atcrowdfunding.bean.ReplicationApplierStatusByWorkerKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationApplierStatusByWorkerMapper {
    long countByExample(ReplicationApplierStatusByWorkerExample example);

    int deleteByExample(ReplicationApplierStatusByWorkerExample example);

    int deleteByPrimaryKey(ReplicationApplierStatusByWorkerKey key);

    int insert(ReplicationApplierStatusByWorker record);

    int insertSelective(ReplicationApplierStatusByWorker record);

    List<ReplicationApplierStatusByWorker> selectByExample(ReplicationApplierStatusByWorkerExample example);

    ReplicationApplierStatusByWorker selectByPrimaryKey(ReplicationApplierStatusByWorkerKey key);

    int updateByExampleSelective(@Param("record") ReplicationApplierStatusByWorker record, @Param("example") ReplicationApplierStatusByWorkerExample example);

    int updateByExample(@Param("record") ReplicationApplierStatusByWorker record, @Param("example") ReplicationApplierStatusByWorkerExample example);

    int updateByPrimaryKeySelective(ReplicationApplierStatusByWorker record);

    int updateByPrimaryKey(ReplicationApplierStatusByWorker record);
}