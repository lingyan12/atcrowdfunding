package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStatementsSummaryByDigest;
import com.atguigu.atcrowdfunding.bean.EventsStatementsSummaryByDigestExample;
import com.atguigu.atcrowdfunding.bean.EventsStatementsSummaryByDigestWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByDigestMapper {
    long countByExample(EventsStatementsSummaryByDigestExample example);

    int deleteByExample(EventsStatementsSummaryByDigestExample example);

    int insert(EventsStatementsSummaryByDigestWithBLOBs record);

    int insertSelective(EventsStatementsSummaryByDigestWithBLOBs record);

    List<EventsStatementsSummaryByDigestWithBLOBs> selectByExampleWithBLOBs(EventsStatementsSummaryByDigestExample example);

    List<EventsStatementsSummaryByDigest> selectByExample(EventsStatementsSummaryByDigestExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByDigestWithBLOBs record, @Param("example") EventsStatementsSummaryByDigestExample example);

    int updateByExampleWithBLOBs(@Param("record") EventsStatementsSummaryByDigestWithBLOBs record, @Param("example") EventsStatementsSummaryByDigestExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryByDigest record, @Param("example") EventsStatementsSummaryByDigestExample example);
}