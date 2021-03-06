package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.EventsStatementsHistogramByDigest;
import com.atguigu.atcrowdfunding.bean.EventsStatementsHistogramByDigestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsHistogramByDigestMapper {
    long countByExample(EventsStatementsHistogramByDigestExample example);

    int deleteByExample(EventsStatementsHistogramByDigestExample example);

    int insert(EventsStatementsHistogramByDigest record);

    int insertSelective(EventsStatementsHistogramByDigest record);

    List<EventsStatementsHistogramByDigest> selectByExample(EventsStatementsHistogramByDigestExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsHistogramByDigest record, @Param("example") EventsStatementsHistogramByDigestExample example);

    int updateByExample(@Param("record") EventsStatementsHistogramByDigest record, @Param("example") EventsStatementsHistogramByDigestExample example);
}