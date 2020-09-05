package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.IoGlobalByWaitByBytes;
import com.atguigu.atcrowdfunding.bean.IoGlobalByWaitByBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByWaitByBytesMapper {
    long countByExample(IoGlobalByWaitByBytesExample example);

    int deleteByExample(IoGlobalByWaitByBytesExample example);

    int insert(IoGlobalByWaitByBytes record);

    int insertSelective(IoGlobalByWaitByBytes record);

    List<IoGlobalByWaitByBytes> selectByExample(IoGlobalByWaitByBytesExample example);

    int updateByExampleSelective(@Param("record") IoGlobalByWaitByBytes record, @Param("example") IoGlobalByWaitByBytesExample example);

    int updateByExample(@Param("record") IoGlobalByWaitByBytes record, @Param("example") IoGlobalByWaitByBytesExample example);
}