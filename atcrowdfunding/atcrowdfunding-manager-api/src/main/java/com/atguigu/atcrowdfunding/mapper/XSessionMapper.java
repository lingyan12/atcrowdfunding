package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XSession;
import com.atguigu.atcrowdfunding.bean.XSessionExample;
import com.atguigu.atcrowdfunding.bean.XSessionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSessionMapper {
    long countByExample(XSessionExample example);

    int deleteByExample(XSessionExample example);

    int insert(XSessionWithBLOBs record);

    int insertSelective(XSessionWithBLOBs record);

    List<XSessionWithBLOBs> selectByExampleWithBLOBs(XSessionExample example);

    List<XSession> selectByExample(XSessionExample example);

    int updateByExampleSelective(@Param("record") XSessionWithBLOBs record, @Param("example") XSessionExample example);

    int updateByExampleWithBLOBs(@Param("record") XSessionWithBLOBs record, @Param("example") XSessionExample example);

    int updateByExample(@Param("record") XSession record, @Param("example") XSessionExample example);
}