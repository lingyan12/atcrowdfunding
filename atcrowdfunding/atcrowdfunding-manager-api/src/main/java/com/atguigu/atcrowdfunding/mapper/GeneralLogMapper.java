package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.GeneralLog;
import com.atguigu.atcrowdfunding.bean.GeneralLogExample;
import com.atguigu.atcrowdfunding.bean.GeneralLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeneralLogMapper {
    long countByExample(GeneralLogExample example);

    int deleteByExample(GeneralLogExample example);

    int insert(GeneralLogWithBLOBs record);

    int insertSelective(GeneralLogWithBLOBs record);

    List<GeneralLogWithBLOBs> selectByExampleWithBLOBs(GeneralLogExample example);

    List<GeneralLog> selectByExample(GeneralLogExample example);

    int updateByExampleSelective(@Param("record") GeneralLogWithBLOBs record, @Param("example") GeneralLogExample example);

    int updateByExampleWithBLOBs(@Param("record") GeneralLogWithBLOBs record, @Param("example") GeneralLogExample example);

    int updateByExample(@Param("record") GeneralLog record, @Param("example") GeneralLogExample example);
}