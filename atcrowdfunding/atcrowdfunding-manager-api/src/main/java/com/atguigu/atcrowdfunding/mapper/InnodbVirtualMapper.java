package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbVirtual;
import com.atguigu.atcrowdfunding.bean.InnodbVirtualExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbVirtualMapper {
    long countByExample(InnodbVirtualExample example);

    int deleteByExample(InnodbVirtualExample example);

    int insert(InnodbVirtual record);

    int insertSelective(InnodbVirtual record);

    List<InnodbVirtual> selectByExample(InnodbVirtualExample example);

    int updateByExampleSelective(@Param("record") InnodbVirtual record, @Param("example") InnodbVirtualExample example);

    int updateByExample(@Param("record") InnodbVirtual record, @Param("example") InnodbVirtualExample example);
}