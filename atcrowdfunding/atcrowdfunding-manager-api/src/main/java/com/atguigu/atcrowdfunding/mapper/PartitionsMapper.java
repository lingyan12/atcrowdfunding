package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Partitions;
import com.atguigu.atcrowdfunding.bean.PartitionsExample;
import com.atguigu.atcrowdfunding.bean.PartitionsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartitionsMapper {
    long countByExample(PartitionsExample example);

    int deleteByExample(PartitionsExample example);

    int insert(PartitionsWithBLOBs record);

    int insertSelective(PartitionsWithBLOBs record);

    List<PartitionsWithBLOBs> selectByExampleWithBLOBs(PartitionsExample example);

    List<Partitions> selectByExample(PartitionsExample example);

    int updateByExampleSelective(@Param("record") PartitionsWithBLOBs record, @Param("example") PartitionsExample example);

    int updateByExampleWithBLOBs(@Param("record") PartitionsWithBLOBs record, @Param("example") PartitionsExample example);

    int updateByExample(@Param("record") Partitions record, @Param("example") PartitionsExample example);
}