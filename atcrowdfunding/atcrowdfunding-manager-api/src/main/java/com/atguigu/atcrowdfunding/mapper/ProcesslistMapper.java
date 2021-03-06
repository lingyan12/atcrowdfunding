package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Processlist;
import com.atguigu.atcrowdfunding.bean.ProcesslistExample;
import com.atguigu.atcrowdfunding.bean.ProcesslistWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcesslistMapper {
    long countByExample(ProcesslistExample example);

    int deleteByExample(ProcesslistExample example);

    int insert(ProcesslistWithBLOBs record);

    int insertSelective(ProcesslistWithBLOBs record);

    List<ProcesslistWithBLOBs> selectByExampleWithBLOBs(ProcesslistExample example);

    List<Processlist> selectByExample(ProcesslistExample example);

    int updateByExampleSelective(@Param("record") ProcesslistWithBLOBs record, @Param("example") ProcesslistExample example);

    int updateByExampleWithBLOBs(@Param("record") ProcesslistWithBLOBs record, @Param("example") ProcesslistExample example);

    int updateByExample(@Param("record") Processlist record, @Param("example") ProcesslistExample example);
}