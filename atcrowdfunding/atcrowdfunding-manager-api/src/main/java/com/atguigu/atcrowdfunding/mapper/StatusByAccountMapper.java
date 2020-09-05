package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.StatusByAccount;
import com.atguigu.atcrowdfunding.bean.StatusByAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusByAccountMapper {
    long countByExample(StatusByAccountExample example);

    int deleteByExample(StatusByAccountExample example);

    int insert(StatusByAccount record);

    int insertSelective(StatusByAccount record);

    List<StatusByAccount> selectByExample(StatusByAccountExample example);

    int updateByExampleSelective(@Param("record") StatusByAccount record, @Param("example") StatusByAccountExample example);

    int updateByExample(@Param("record") StatusByAccount record, @Param("example") StatusByAccountExample example);
}