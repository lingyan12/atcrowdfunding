package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbCmpPerIndexReset;
import com.atguigu.atcrowdfunding.bean.InnodbCmpPerIndexResetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpPerIndexResetMapper {
    long countByExample(InnodbCmpPerIndexResetExample example);

    int deleteByExample(InnodbCmpPerIndexResetExample example);

    int insert(InnodbCmpPerIndexReset record);

    int insertSelective(InnodbCmpPerIndexReset record);

    List<InnodbCmpPerIndexReset> selectByExample(InnodbCmpPerIndexResetExample example);

    int updateByExampleSelective(@Param("record") InnodbCmpPerIndexReset record, @Param("example") InnodbCmpPerIndexResetExample example);

    int updateByExample(@Param("record") InnodbCmpPerIndexReset record, @Param("example") InnodbCmpPerIndexResetExample example);
}