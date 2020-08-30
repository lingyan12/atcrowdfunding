package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbTempTableInfo;
import com.atguigu.atcrowdfunding.bean.InnodbTempTableInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTempTableInfoMapper {
    long countByExample(InnodbTempTableInfoExample example);

    int deleteByExample(InnodbTempTableInfoExample example);

    int insert(InnodbTempTableInfo record);

    int insertSelective(InnodbTempTableInfo record);

    List<InnodbTempTableInfo> selectByExample(InnodbTempTableInfoExample example);

    int updateByExampleSelective(@Param("record") InnodbTempTableInfo record, @Param("example") InnodbTempTableInfoExample example);

    int updateByExample(@Param("record") InnodbTempTableInfo record, @Param("example") InnodbTempTableInfoExample example);
}