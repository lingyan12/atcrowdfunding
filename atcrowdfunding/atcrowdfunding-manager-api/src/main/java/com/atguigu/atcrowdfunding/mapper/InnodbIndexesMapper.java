package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbIndexes;
import com.atguigu.atcrowdfunding.bean.InnodbIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbIndexesMapper {
    long countByExample(InnodbIndexesExample example);

    int deleteByExample(InnodbIndexesExample example);

    int insert(InnodbIndexes record);

    int insertSelective(InnodbIndexes record);

    List<InnodbIndexes> selectByExample(InnodbIndexesExample example);

    int updateByExampleSelective(@Param("record") InnodbIndexes record, @Param("example") InnodbIndexesExample example);

    int updateByExample(@Param("record") InnodbIndexes record, @Param("example") InnodbIndexesExample example);
}