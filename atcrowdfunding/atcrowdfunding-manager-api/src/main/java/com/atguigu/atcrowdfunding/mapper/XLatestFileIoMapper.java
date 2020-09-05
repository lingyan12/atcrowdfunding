package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XLatestFileIo;
import com.atguigu.atcrowdfunding.bean.XLatestFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XLatestFileIoMapper {
    long countByExample(XLatestFileIoExample example);

    int deleteByExample(XLatestFileIoExample example);

    int insert(XLatestFileIo record);

    int insertSelective(XLatestFileIo record);

    List<XLatestFileIo> selectByExample(XLatestFileIoExample example);

    int updateByExampleSelective(@Param("record") XLatestFileIo record, @Param("example") XLatestFileIoExample example);

    int updateByExample(@Param("record") XLatestFileIo record, @Param("example") XLatestFileIoExample example);
}