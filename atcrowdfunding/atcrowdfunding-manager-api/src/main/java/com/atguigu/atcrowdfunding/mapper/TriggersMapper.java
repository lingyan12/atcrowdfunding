package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Triggers;
import com.atguigu.atcrowdfunding.bean.TriggersExample;
import com.atguigu.atcrowdfunding.bean.TriggersWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriggersMapper {
    long countByExample(TriggersExample example);

    int deleteByExample(TriggersExample example);

    int insert(TriggersWithBLOBs record);

    int insertSelective(TriggersWithBLOBs record);

    List<TriggersWithBLOBs> selectByExampleWithBLOBs(TriggersExample example);

    List<Triggers> selectByExample(TriggersExample example);

    int updateByExampleSelective(@Param("record") TriggersWithBLOBs record, @Param("example") TriggersExample example);

    int updateByExampleWithBLOBs(@Param("record") TriggersWithBLOBs record, @Param("example") TriggersExample example);

    int updateByExample(@Param("record") Triggers record, @Param("example") TriggersExample example);
}