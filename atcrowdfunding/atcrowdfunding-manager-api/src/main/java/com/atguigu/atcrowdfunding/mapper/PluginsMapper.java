package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Plugins;
import com.atguigu.atcrowdfunding.bean.PluginsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginsMapper {
    long countByExample(PluginsExample example);

    int deleteByExample(PluginsExample example);

    int insert(Plugins record);

    int insertSelective(Plugins record);

    List<Plugins> selectByExample(PluginsExample example);

    int updateByExampleSelective(@Param("record") Plugins record, @Param("example") PluginsExample example);

    int updateByExample(@Param("record") Plugins record, @Param("example") PluginsExample example);
}