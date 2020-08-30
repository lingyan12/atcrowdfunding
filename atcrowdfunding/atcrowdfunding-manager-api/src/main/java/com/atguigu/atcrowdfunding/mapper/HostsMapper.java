package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Hosts;
import com.atguigu.atcrowdfunding.bean.HostsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostsMapper {
    long countByExample(HostsExample example);

    int deleteByExample(HostsExample example);

    int insert(Hosts record);

    int insertSelective(Hosts record);

    List<Hosts> selectByExample(HostsExample example);

    int updateByExampleSelective(@Param("record") Hosts record, @Param("example") HostsExample example);

    int updateByExample(@Param("record") Hosts record, @Param("example") HostsExample example);
}