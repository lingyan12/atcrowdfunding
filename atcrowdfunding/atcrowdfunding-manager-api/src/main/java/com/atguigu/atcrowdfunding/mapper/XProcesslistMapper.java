package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XProcesslist;
import com.atguigu.atcrowdfunding.bean.XProcesslistExample;
import com.atguigu.atcrowdfunding.bean.XProcesslistWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XProcesslistMapper {
    long countByExample(XProcesslistExample example);

    int deleteByExample(XProcesslistExample example);

    int insert(XProcesslistWithBLOBs record);

    int insertSelective(XProcesslistWithBLOBs record);

    List<XProcesslistWithBLOBs> selectByExampleWithBLOBs(XProcesslistExample example);

    List<XProcesslist> selectByExample(XProcesslistExample example);

    int updateByExampleSelective(@Param("record") XProcesslistWithBLOBs record, @Param("example") XProcesslistExample example);

    int updateByExampleWithBLOBs(@Param("record") XProcesslistWithBLOBs record, @Param("example") XProcesslistExample example);

    int updateByExample(@Param("record") XProcesslist record, @Param("example") XProcesslistExample example);
}