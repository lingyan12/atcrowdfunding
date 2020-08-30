package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XIoGlobalByFileByBytes;
import com.atguigu.atcrowdfunding.bean.XIoGlobalByFileByBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoGlobalByFileByBytesMapper {
    long countByExample(XIoGlobalByFileByBytesExample example);

    int deleteByExample(XIoGlobalByFileByBytesExample example);

    int insert(XIoGlobalByFileByBytes record);

    int insertSelective(XIoGlobalByFileByBytes record);

    List<XIoGlobalByFileByBytes> selectByExample(XIoGlobalByFileByBytesExample example);

    int updateByExampleSelective(@Param("record") XIoGlobalByFileByBytes record, @Param("example") XIoGlobalByFileByBytesExample example);

    int updateByExample(@Param("record") XIoGlobalByFileByBytes record, @Param("example") XIoGlobalByFileByBytesExample example);
}