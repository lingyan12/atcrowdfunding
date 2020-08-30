package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbTrx;
import com.atguigu.atcrowdfunding.bean.InnodbTrxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTrxMapper {
    long countByExample(InnodbTrxExample example);

    int deleteByExample(InnodbTrxExample example);

    int insert(InnodbTrx record);

    int insertSelective(InnodbTrx record);

    List<InnodbTrx> selectByExample(InnodbTrxExample example);

    int updateByExampleSelective(@Param("record") InnodbTrx record, @Param("example") InnodbTrxExample example);

    int updateByExample(@Param("record") InnodbTrx record, @Param("example") InnodbTrxExample example);
}