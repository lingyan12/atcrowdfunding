package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.FileSummaryByInstance;
import com.atguigu.atcrowdfunding.bean.FileSummaryByInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileSummaryByInstanceMapper {
    long countByExample(FileSummaryByInstanceExample example);

    int deleteByExample(FileSummaryByInstanceExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(FileSummaryByInstance record);

    int insertSelective(FileSummaryByInstance record);

    List<FileSummaryByInstance> selectByExample(FileSummaryByInstanceExample example);

    FileSummaryByInstance selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") FileSummaryByInstance record, @Param("example") FileSummaryByInstanceExample example);

    int updateByExample(@Param("record") FileSummaryByInstance record, @Param("example") FileSummaryByInstanceExample example);

    int updateByPrimaryKeySelective(FileSummaryByInstance record);

    int updateByPrimaryKey(FileSummaryByInstance record);
}