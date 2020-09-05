package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.UserSummaryByFileIo;
import com.atguigu.atcrowdfunding.bean.UserSummaryByFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByFileIoMapper {
    long countByExample(UserSummaryByFileIoExample example);

    int deleteByExample(UserSummaryByFileIoExample example);

    int insert(UserSummaryByFileIo record);

    int insertSelective(UserSummaryByFileIo record);

    List<UserSummaryByFileIo> selectByExample(UserSummaryByFileIoExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByFileIo record, @Param("example") UserSummaryByFileIoExample example);

    int updateByExample(@Param("record") UserSummaryByFileIo record, @Param("example") UserSummaryByFileIoExample example);
}