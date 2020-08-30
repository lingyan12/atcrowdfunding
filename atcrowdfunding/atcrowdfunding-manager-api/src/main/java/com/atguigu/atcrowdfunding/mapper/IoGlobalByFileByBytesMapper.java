package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.IoGlobalByFileByBytes;
import com.atguigu.atcrowdfunding.bean.IoGlobalByFileByBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByFileByBytesMapper {
    long countByExample(IoGlobalByFileByBytesExample example);

    int deleteByExample(IoGlobalByFileByBytesExample example);

    int insert(IoGlobalByFileByBytes record);

    int insertSelective(IoGlobalByFileByBytes record);

    List<IoGlobalByFileByBytes> selectByExample(IoGlobalByFileByBytesExample example);

    int updateByExampleSelective(@Param("record") IoGlobalByFileByBytes record, @Param("example") IoGlobalByFileByBytesExample example);

    int updateByExample(@Param("record") IoGlobalByFileByBytes record, @Param("example") IoGlobalByFileByBytesExample example);
}