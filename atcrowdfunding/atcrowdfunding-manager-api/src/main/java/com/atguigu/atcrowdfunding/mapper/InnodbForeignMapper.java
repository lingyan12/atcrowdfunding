package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbForeign;
import com.atguigu.atcrowdfunding.bean.InnodbForeignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbForeignMapper {
    long countByExample(InnodbForeignExample example);

    int deleteByExample(InnodbForeignExample example);

    int insert(InnodbForeign record);

    int insertSelective(InnodbForeign record);

    List<InnodbForeign> selectByExample(InnodbForeignExample example);

    int updateByExampleSelective(@Param("record") InnodbForeign record, @Param("example") InnodbForeignExample example);

    int updateByExample(@Param("record") InnodbForeign record, @Param("example") InnodbForeignExample example);
}