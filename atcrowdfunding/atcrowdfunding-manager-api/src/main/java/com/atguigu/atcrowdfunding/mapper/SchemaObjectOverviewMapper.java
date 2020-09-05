package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.SchemaObjectOverview;
import com.atguigu.atcrowdfunding.bean.SchemaObjectOverviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaObjectOverviewMapper {
    long countByExample(SchemaObjectOverviewExample example);

    int deleteByExample(SchemaObjectOverviewExample example);

    int insert(SchemaObjectOverview record);

    int insertSelective(SchemaObjectOverview record);

    List<SchemaObjectOverview> selectByExample(SchemaObjectOverviewExample example);

    int updateByExampleSelective(@Param("record") SchemaObjectOverview record, @Param("example") SchemaObjectOverviewExample example);

    int updateByExample(@Param("record") SchemaObjectOverview record, @Param("example") SchemaObjectOverviewExample example);
}