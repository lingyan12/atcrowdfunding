package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbFtIndexCache;
import com.atguigu.atcrowdfunding.bean.InnodbFtIndexCacheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtIndexCacheMapper {
    long countByExample(InnodbFtIndexCacheExample example);

    int deleteByExample(InnodbFtIndexCacheExample example);

    int insert(InnodbFtIndexCache record);

    int insertSelective(InnodbFtIndexCache record);

    List<InnodbFtIndexCache> selectByExample(InnodbFtIndexCacheExample example);

    int updateByExampleSelective(@Param("record") InnodbFtIndexCache record, @Param("example") InnodbFtIndexCacheExample example);

    int updateByExample(@Param("record") InnodbFtIndexCache record, @Param("example") InnodbFtIndexCacheExample example);
}