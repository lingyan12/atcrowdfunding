package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.TableIoWaitsSummaryByTable;
import com.atguigu.atcrowdfunding.bean.TableIoWaitsSummaryByTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableIoWaitsSummaryByTableMapper {
    long countByExample(TableIoWaitsSummaryByTableExample example);

    int deleteByExample(TableIoWaitsSummaryByTableExample example);

    int insert(TableIoWaitsSummaryByTable record);

    int insertSelective(TableIoWaitsSummaryByTable record);

    List<TableIoWaitsSummaryByTable> selectByExample(TableIoWaitsSummaryByTableExample example);

    int updateByExampleSelective(@Param("record") TableIoWaitsSummaryByTable record, @Param("example") TableIoWaitsSummaryByTableExample example);

    int updateByExample(@Param("record") TableIoWaitsSummaryByTable record, @Param("example") TableIoWaitsSummaryByTableExample example);
}