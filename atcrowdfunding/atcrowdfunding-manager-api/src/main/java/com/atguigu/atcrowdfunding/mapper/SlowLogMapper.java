package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SlowLog;
import com.atguigu.atcrowdfunding.bean.SlowLogExample;
import com.atguigu.atcrowdfunding.bean.SlowLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlowLogMapper {
    long countByExample(SlowLogExample example);

    int deleteByExample(SlowLogExample example);

    int insert(SlowLogWithBLOBs record);

    int insertSelective(SlowLogWithBLOBs record);

    List<SlowLogWithBLOBs> selectByExampleWithBLOBs(SlowLogExample example);

    List<SlowLog> selectByExample(SlowLogExample example);

    int updateByExampleSelective(@Param("record") SlowLogWithBLOBs record, @Param("example") SlowLogExample example);

    int updateByExampleWithBLOBs(@Param("record") SlowLogWithBLOBs record, @Param("example") SlowLogExample example);

    int updateByExample(@Param("record") SlowLog record, @Param("example") SlowLogExample example);
}