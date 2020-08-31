package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbTablestats;
import com.atguigu.atcrowdfunding.bean.InnodbTableStatsExample;
import com.atguigu.atcrowdfunding.bean.InnodbTableStatsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTablestatsMapper {
    long countByExample(InnodbTableStatsExample example);

    int deleteByExample(InnodbTableStatsExample example);

    int deleteByPrimaryKey(InnodbTableStatsKey key);

    int insert(InnodbTablestats record);

    int insertSelective(InnodbTablestats record);

    List<InnodbTablestats> selectByExample(InnodbTableStatsExample example);

    InnodbTablestats selectByPrimaryKey(InnodbTableStatsKey key);

    int updateByExampleSelective(@Param("record") InnodbTablestats record, @Param("example") InnodbTableStatsExample example);

    int updateByExample(@Param("record") InnodbTablestats record, @Param("example") InnodbTableStatsExample example);

    int updateByPrimaryKeySelective(InnodbTablestats record);

    int updateByPrimaryKey(InnodbTablestats record);
}