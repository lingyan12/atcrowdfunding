package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.MetadataLocks;
import com.atguigu.atcrowdfunding.bean.MetadataLocksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetadataLocksMapper {
    long countByExample(MetadataLocksExample example);

    int deleteByExample(MetadataLocksExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(MetadataLocks record);

    int insertSelective(MetadataLocks record);

    List<MetadataLocks> selectByExample(MetadataLocksExample example);

    MetadataLocks selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") MetadataLocks record, @Param("example") MetadataLocksExample example);

    int updateByExample(@Param("record") MetadataLocks record, @Param("example") MetadataLocksExample example);

    int updateByPrimaryKeySelective(MetadataLocks record);

    int updateByPrimaryKey(MetadataLocks record);
}