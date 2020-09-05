package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.XIoGlobalByWaitByBytes;
import com.atguigu.atcrowdfunding.bean.XIoGlobalByWaitByBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoGlobalByWaitByBytesMapper {
    long countByExample(XIoGlobalByWaitByBytesExample example);

    int deleteByExample(XIoGlobalByWaitByBytesExample example);

    int insert(XIoGlobalByWaitByBytes record);

    int insertSelective(XIoGlobalByWaitByBytes record);

    List<XIoGlobalByWaitByBytes> selectByExample(XIoGlobalByWaitByBytesExample example);

    int updateByExampleSelective(@Param("record") XIoGlobalByWaitByBytes record, @Param("example") XIoGlobalByWaitByBytesExample example);

    int updateByExample(@Param("record") XIoGlobalByWaitByBytes record, @Param("example") XIoGlobalByWaitByBytesExample example);
}