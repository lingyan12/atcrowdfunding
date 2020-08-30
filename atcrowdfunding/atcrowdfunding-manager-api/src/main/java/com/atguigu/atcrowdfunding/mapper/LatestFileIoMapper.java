package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.LatestFileIo;
import com.atguigu.atcrowdfunding.bean.LatestFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LatestFileIoMapper {
    long countByExample(LatestFileIoExample example);

    int deleteByExample(LatestFileIoExample example);

    int insert(LatestFileIo record);

    int insertSelective(LatestFileIo record);

    List<LatestFileIo> selectByExample(LatestFileIoExample example);

    int updateByExampleSelective(@Param("record") LatestFileIo record, @Param("example") LatestFileIoExample example);

    int updateByExample(@Param("record") LatestFileIo record, @Param("example") LatestFileIoExample example);
}