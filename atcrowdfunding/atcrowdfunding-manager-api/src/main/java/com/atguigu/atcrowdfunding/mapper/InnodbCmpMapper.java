package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbCmp;
import com.atguigu.atcrowdfunding.bean.InnodbCmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpMapper {
    long countByExample(InnodbCmpExample example);

    int deleteByExample(InnodbCmpExample example);

    int insert(InnodbCmp record);

    int insertSelective(InnodbCmp record);

    List<InnodbCmp> selectByExample(InnodbCmpExample example);

    int updateByExampleSelective(@Param("record") InnodbCmp record, @Param("example") InnodbCmpExample example);

    int updateByExample(@Param("record") InnodbCmp record, @Param("example") InnodbCmpExample example);
}