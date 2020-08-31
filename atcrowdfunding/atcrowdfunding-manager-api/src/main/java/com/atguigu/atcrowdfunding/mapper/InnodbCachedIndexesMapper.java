package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbCachedIndexes;
import com.atguigu.atcrowdfunding.bean.InnodbCachedIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCachedIndexesMapper {
    long countByExample(InnodbCachedIndexesExample example);

    int deleteByExample(InnodbCachedIndexesExample example);

    int insert(InnodbCachedIndexes record);

    int insertSelective(InnodbCachedIndexes record);

    List<InnodbCachedIndexes> selectByExample(InnodbCachedIndexesExample example);

    int updateByExampleSelective(@Param("record") InnodbCachedIndexes record, @Param("example") InnodbCachedIndexesExample example);

    int updateByExample(@Param("record") InnodbCachedIndexes record, @Param("example") InnodbCachedIndexesExample example);
}