package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.StatusByHost;
import com.atguigu.atcrowdfunding.bean.StatusByHostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusByHostMapper {
    long countByExample(StatusByHostExample example);

    int deleteByExample(StatusByHostExample example);

    int insert(StatusByHost record);

    int insertSelective(StatusByHost record);

    List<StatusByHost> selectByExample(StatusByHostExample example);

    int updateByExampleSelective(@Param("record") StatusByHost record, @Param("example") StatusByHostExample example);

    int updateByExample(@Param("record") StatusByHost record, @Param("example") StatusByHostExample example);
}