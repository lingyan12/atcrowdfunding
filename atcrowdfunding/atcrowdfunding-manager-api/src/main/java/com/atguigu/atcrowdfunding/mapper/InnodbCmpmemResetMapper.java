package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbCmpmemReset;
import com.atguigu.atcrowdfunding.bean.InnodbCmpmemResetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpmemResetMapper {
    long countByExample(InnodbCmpmemResetExample example);

    int deleteByExample(InnodbCmpmemResetExample example);

    int insert(InnodbCmpmemReset record);

    int insertSelective(InnodbCmpmemReset record);

    List<InnodbCmpmemReset> selectByExample(InnodbCmpmemResetExample example);

    int updateByExampleSelective(@Param("record") InnodbCmpmemReset record, @Param("example") InnodbCmpmemResetExample example);

    int updateByExample(@Param("record") InnodbCmpmemReset record, @Param("example") InnodbCmpmemResetExample example);
}