package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SlaveMasterInfo;
import com.atguigu.atcrowdfunding.bean.SlaveMasterInfoExample;
import com.atguigu.atcrowdfunding.bean.SlaveMasterInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlaveMasterInfoMapper {
    long countByExample(SlaveMasterInfoExample example);

    int deleteByExample(SlaveMasterInfoExample example);

    int deleteByPrimaryKey(String channelName);

    int insert(SlaveMasterInfoWithBLOBs record);

    int insertSelective(SlaveMasterInfoWithBLOBs record);

    List<SlaveMasterInfoWithBLOBs> selectByExampleWithBLOBs(SlaveMasterInfoExample example);

    List<SlaveMasterInfo> selectByExample(SlaveMasterInfoExample example);

    SlaveMasterInfoWithBLOBs selectByPrimaryKey(String channelName);

    int updateByExampleSelective(@Param("record") SlaveMasterInfoWithBLOBs record, @Param("example") SlaveMasterInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SlaveMasterInfoWithBLOBs record, @Param("example") SlaveMasterInfoExample example);

    int updateByExample(@Param("record") SlaveMasterInfo record, @Param("example") SlaveMasterInfoExample example);

    int updateByPrimaryKeySelective(SlaveMasterInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SlaveMasterInfoWithBLOBs record);

    int updateByPrimaryKey(SlaveMasterInfo record);
}