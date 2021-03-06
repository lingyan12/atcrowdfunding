package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.Views;
import com.atguigu.atcrowdfunding.bean.ViewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewsMapper {
    long countByExample(ViewsExample example);

    int deleteByExample(ViewsExample example);

    int insert(Views record);

    int insertSelective(Views record);

    List<Views> selectByExampleWithBLOBs(ViewsExample example);

    List<Views> selectByExample(ViewsExample example);

    int updateByExampleSelective(@Param("record") Views record, @Param("example") ViewsExample example);

    int updateByExampleWithBLOBs(@Param("record") Views record, @Param("example") ViewsExample example);

    int updateByExample(@Param("record") Views record, @Param("example") ViewsExample example);
}