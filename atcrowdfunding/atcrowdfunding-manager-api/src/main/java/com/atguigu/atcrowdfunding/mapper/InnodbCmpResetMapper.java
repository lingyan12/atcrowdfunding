package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbCmpReset;
import com.atguigu.atcrowdfunding.bean.InnodbCmpResetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpResetMapper {
    long countByExample(InnodbCmpResetExample example);

    int deleteByExample(InnodbCmpResetExample example);

    int insert(InnodbCmpReset record);

    int insertSelective(InnodbCmpReset record);

    List<InnodbCmpReset> selectByExample(InnodbCmpResetExample example);

    int updateByExampleSelective(@Param("record") InnodbCmpReset record, @Param("example") InnodbCmpResetExample example);

    int updateByExample(@Param("record") InnodbCmpReset record, @Param("example") InnodbCmpResetExample example);
}