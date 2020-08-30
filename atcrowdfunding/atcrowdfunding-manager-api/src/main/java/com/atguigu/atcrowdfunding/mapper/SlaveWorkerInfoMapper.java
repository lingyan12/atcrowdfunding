package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SlaveWorkerInfo;
import com.atguigu.atcrowdfunding.bean.SlaveWorkerInfoExample;
import com.atguigu.atcrowdfunding.bean.SlaveWorkerInfoKey;
import com.atguigu.atcrowdfunding.bean.SlaveWorkerInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlaveWorkerInfoMapper {
    long countByExample(SlaveWorkerInfoExample example);

    int deleteByExample(SlaveWorkerInfoExample example);

    int deleteByPrimaryKey(SlaveWorkerInfoKey key);

    int insert(SlaveWorkerInfoWithBLOBs record);

    int insertSelective(SlaveWorkerInfoWithBLOBs record);

    List<SlaveWorkerInfoWithBLOBs> selectByExampleWithBLOBs(SlaveWorkerInfoExample example);

    List<SlaveWorkerInfo> selectByExample(SlaveWorkerInfoExample example);

    SlaveWorkerInfoWithBLOBs selectByPrimaryKey(SlaveWorkerInfoKey key);

    int updateByExampleSelective(@Param("record") SlaveWorkerInfoWithBLOBs record, @Param("example") SlaveWorkerInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SlaveWorkerInfoWithBLOBs record, @Param("example") SlaveWorkerInfoExample example);

    int updateByExample(@Param("record") SlaveWorkerInfo record, @Param("example") SlaveWorkerInfoExample example);

    int updateByPrimaryKeySelective(SlaveWorkerInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SlaveWorkerInfoWithBLOBs record);

    int updateByPrimaryKey(SlaveWorkerInfo record);
}