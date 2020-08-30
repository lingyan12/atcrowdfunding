package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ReplicationApplierFilters;
import com.atguigu.atcrowdfunding.bean.ReplicationApplierFiltersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationApplierFiltersMapper {
    long countByExample(ReplicationApplierFiltersExample example);

    int deleteByExample(ReplicationApplierFiltersExample example);

    int insert(ReplicationApplierFilters record);

    int insertSelective(ReplicationApplierFilters record);

    List<ReplicationApplierFilters> selectByExampleWithBLOBs(ReplicationApplierFiltersExample example);

    List<ReplicationApplierFilters> selectByExample(ReplicationApplierFiltersExample example);

    int updateByExampleSelective(@Param("record") ReplicationApplierFilters record, @Param("example") ReplicationApplierFiltersExample example);

    int updateByExampleWithBLOBs(@Param("record") ReplicationApplierFilters record, @Param("example") ReplicationApplierFiltersExample example);

    int updateByExample(@Param("record") ReplicationApplierFilters record, @Param("example") ReplicationApplierFiltersExample example);
}