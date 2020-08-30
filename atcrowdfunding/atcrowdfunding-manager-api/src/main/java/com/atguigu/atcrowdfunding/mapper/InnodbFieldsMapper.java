package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbFields;
import com.atguigu.atcrowdfunding.bean.InnodbFieldsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFieldsMapper {
    long countByExample(InnodbFieldsExample example);

    int deleteByExample(InnodbFieldsExample example);

    int insert(InnodbFields record);

    int insertSelective(InnodbFields record);

    List<InnodbFields> selectByExampleWithBLOBs(InnodbFieldsExample example);

    List<InnodbFields> selectByExample(InnodbFieldsExample example);

    int updateByExampleSelective(@Param("record") InnodbFields record, @Param("example") InnodbFieldsExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbFields record, @Param("example") InnodbFieldsExample example);

    int updateByExample(@Param("record") InnodbFields record, @Param("example") InnodbFieldsExample example);
}