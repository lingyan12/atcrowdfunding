package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.UserSummaryByFileIoType;
import com.atguigu.atcrowdfunding.bean.UserSummaryByFileIoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByFileIoTypeMapper {
    long countByExample(UserSummaryByFileIoTypeExample example);

    int deleteByExample(UserSummaryByFileIoTypeExample example);

    int insert(UserSummaryByFileIoType record);

    int insertSelective(UserSummaryByFileIoType record);

    List<UserSummaryByFileIoType> selectByExample(UserSummaryByFileIoTypeExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByFileIoType record, @Param("example") UserSummaryByFileIoTypeExample example);

    int updateByExample(@Param("record") UserSummaryByFileIoType record, @Param("example") UserSummaryByFileIoTypeExample example);
}