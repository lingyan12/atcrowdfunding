package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.PreparedStatementsInstances;
import com.atguigu.atcrowdfunding.bean.PreparedStatementsInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreparedStatementsInstancesMapper {
    long countByExample(PreparedStatementsInstancesExample example);

    int deleteByExample(PreparedStatementsInstancesExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(PreparedStatementsInstances record);

    int insertSelective(PreparedStatementsInstances record);

    List<PreparedStatementsInstances> selectByExampleWithBLOBs(PreparedStatementsInstancesExample example);

    List<PreparedStatementsInstances> selectByExample(PreparedStatementsInstancesExample example);

    PreparedStatementsInstances selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") PreparedStatementsInstances record, @Param("example") PreparedStatementsInstancesExample example);

    int updateByExampleWithBLOBs(@Param("record") PreparedStatementsInstances record, @Param("example") PreparedStatementsInstancesExample example);

    int updateByExample(@Param("record") PreparedStatementsInstances record, @Param("example") PreparedStatementsInstancesExample example);

    int updateByPrimaryKeySelective(PreparedStatementsInstances record);

    int updateByPrimaryKeyWithBLOBs(PreparedStatementsInstances record);

    int updateByPrimaryKey(PreparedStatementsInstances record);
}