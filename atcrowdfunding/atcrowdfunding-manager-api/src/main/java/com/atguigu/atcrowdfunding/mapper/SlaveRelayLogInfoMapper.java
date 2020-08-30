package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SlaveRelayLogInfo;
import com.atguigu.atcrowdfunding.bean.SlaveRelayLogInfoExample;
import com.atguigu.atcrowdfunding.bean.SlaveRelayLogInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlaveRelayLogInfoMapper {
    long countByExample(SlaveRelayLogInfoExample example);

    int deleteByExample(SlaveRelayLogInfoExample example);

    int deleteByPrimaryKey(String channelName);

    int insert(SlaveRelayLogInfoWithBLOBs record);

    int insertSelective(SlaveRelayLogInfoWithBLOBs record);

    List<SlaveRelayLogInfoWithBLOBs> selectByExampleWithBLOBs(SlaveRelayLogInfoExample example);

    List<SlaveRelayLogInfo> selectByExample(SlaveRelayLogInfoExample example);

    SlaveRelayLogInfoWithBLOBs selectByPrimaryKey(String channelName);

    int updateByExampleSelective(@Param("record") SlaveRelayLogInfoWithBLOBs record, @Param("example") SlaveRelayLogInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SlaveRelayLogInfoWithBLOBs record, @Param("example") SlaveRelayLogInfoExample example);

    int updateByExample(@Param("record") SlaveRelayLogInfo record, @Param("example") SlaveRelayLogInfoExample example);

    int updateByPrimaryKeySelective(SlaveRelayLogInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SlaveRelayLogInfoWithBLOBs record);

    int updateByPrimaryKey(SlaveRelayLogInfo record);
}