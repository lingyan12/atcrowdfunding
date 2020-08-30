package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbBufferPage;
import com.atguigu.atcrowdfunding.bean.InnodbBufferPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbBufferPageMapper {
    long countByExample(InnodbBufferPageExample example);

    int deleteByExample(InnodbBufferPageExample example);

    int insert(InnodbBufferPage record);

    int insertSelective(InnodbBufferPage record);

    List<InnodbBufferPage> selectByExample(InnodbBufferPageExample example);

    int updateByExampleSelective(@Param("record") InnodbBufferPage record, @Param("example") InnodbBufferPageExample example);

    int updateByExample(@Param("record") InnodbBufferPage record, @Param("example") InnodbBufferPageExample example);
}