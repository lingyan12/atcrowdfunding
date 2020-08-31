package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SocketSummaryByInstance;
import com.atguigu.atcrowdfunding.bean.SocketSummaryByInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocketSummaryByInstanceMapper {
    long countByExample(SocketSummaryByInstanceExample example);

    int deleteByExample(SocketSummaryByInstanceExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(SocketSummaryByInstance record);

    int insertSelective(SocketSummaryByInstance record);

    List<SocketSummaryByInstance> selectByExample(SocketSummaryByInstanceExample example);

    SocketSummaryByInstance selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") SocketSummaryByInstance record, @Param("example") SocketSummaryByInstanceExample example);

    int updateByExample(@Param("record") SocketSummaryByInstance record, @Param("example") SocketSummaryByInstanceExample example);

    int updateByPrimaryKeySelective(SocketSummaryByInstance record);

    int updateByPrimaryKey(SocketSummaryByInstance record);
}