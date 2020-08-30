package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbIndexStats;
import com.atguigu.atcrowdfunding.bean.InnodbIndexStatsExample;
import com.atguigu.atcrowdfunding.bean.InnodbIndexStatsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbIndexStatsMapper {
    long countByExample(InnodbIndexStatsExample example);

    int deleteByExample(InnodbIndexStatsExample example);

    int deleteByPrimaryKey(InnodbIndexStatsKey key);

    int insert(InnodbIndexStats record);

    int insertSelective(InnodbIndexStats record);

    List<InnodbIndexStats> selectByExample(InnodbIndexStatsExample example);

    InnodbIndexStats selectByPrimaryKey(InnodbIndexStatsKey key);

    int updateByExampleSelective(@Param("record") InnodbIndexStats record, @Param("example") InnodbIndexStatsExample example);

    int updateByExample(@Param("record") InnodbIndexStats record, @Param("example") InnodbIndexStatsExample example);

    int updateByPrimaryKeySelective(InnodbIndexStats record);

    int updateByPrimaryKey(InnodbIndexStats record);
}