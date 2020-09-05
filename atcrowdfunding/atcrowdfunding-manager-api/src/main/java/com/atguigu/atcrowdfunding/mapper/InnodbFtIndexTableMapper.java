package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbFtIndexTable;
import com.atguigu.atcrowdfunding.bean.InnodbFtIndexTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtIndexTableMapper {
    long countByExample(InnodbFtIndexTableExample example);

    int deleteByExample(InnodbFtIndexTableExample example);

    int insert(InnodbFtIndexTable record);

    int insertSelective(InnodbFtIndexTable record);

    List<InnodbFtIndexTable> selectByExample(InnodbFtIndexTableExample example);

    int updateByExampleSelective(@Param("record") InnodbFtIndexTable record, @Param("example") InnodbFtIndexTableExample example);

    int updateByExample(@Param("record") InnodbFtIndexTable record, @Param("example") InnodbFtIndexTableExample example);
}