package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.HostCache;
import com.atguigu.atcrowdfunding.bean.HostCacheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostCacheMapper {
    long countByExample(HostCacheExample example);

    int deleteByExample(HostCacheExample example);

    int deleteByPrimaryKey(String ip);

    int insert(HostCache record);

    int insertSelective(HostCache record);

    List<HostCache> selectByExample(HostCacheExample example);

    HostCache selectByPrimaryKey(String ip);

    int updateByExampleSelective(@Param("record") HostCache record, @Param("example") HostCacheExample example);

    int updateByExample(@Param("record") HostCache record, @Param("example") HostCacheExample example);

    int updateByPrimaryKeySelective(HostCache record);

    int updateByPrimaryKey(HostCache record);
}