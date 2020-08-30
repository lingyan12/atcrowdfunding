package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbTableStats;
import com.atguigu.atcrowdfunding.bean.InnodbTableStatsExample;
import com.atguigu.atcrowdfunding.bean.InnodbTableStatsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTableStatsMapper {
    long countByExample(InnodbTableStatsExample example);

    int deleteByExample(InnodbTableStatsExample example);

    int deleteByPrimaryKey(InnodbTableStatsKey key);

    int insert(InnodbTableStats record);

    int insertSelective(InnodbTableStats record);

    List<InnodbTableStats> selectByExample(InnodbTableStatsExample example);

    InnodbTableStats selectByPrimaryKey(InnodbTableStatsKey key);

    int updateByExampleSelective(@Param("record") InnodbTableStats record, @Param("example") InnodbTableStatsExample example);

    int updateByExample(@Param("record") InnodbTableStats record, @Param("example") InnodbTableStatsExample example);

    int updateByPrimaryKeySelective(InnodbTableStats record);

    int updateByPrimaryKey(InnodbTableStats record);
}