package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbFtConfig;
import com.atguigu.atcrowdfunding.bean.InnodbFtConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtConfigMapper {
    long countByExample(InnodbFtConfigExample example);

    int deleteByExample(InnodbFtConfigExample example);

    int insert(InnodbFtConfig record);

    int insertSelective(InnodbFtConfig record);

    List<InnodbFtConfig> selectByExample(InnodbFtConfigExample example);

    int updateByExampleSelective(@Param("record") InnodbFtConfig record, @Param("example") InnodbFtConfigExample example);

    int updateByExample(@Param("record") InnodbFtConfig record, @Param("example") InnodbFtConfigExample example);
}