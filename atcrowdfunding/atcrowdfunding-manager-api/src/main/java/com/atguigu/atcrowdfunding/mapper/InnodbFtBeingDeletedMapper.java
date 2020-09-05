package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbFtBeingDeleted;
import com.atguigu.atcrowdfunding.bean.InnodbFtBeingDeletedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtBeingDeletedMapper {
    long countByExample(InnodbFtBeingDeletedExample example);

    int deleteByExample(InnodbFtBeingDeletedExample example);

    int insert(InnodbFtBeingDeleted record);

    int insertSelective(InnodbFtBeingDeleted record);

    List<InnodbFtBeingDeleted> selectByExample(InnodbFtBeingDeletedExample example);

    int updateByExampleSelective(@Param("record") InnodbFtBeingDeleted record, @Param("example") InnodbFtBeingDeletedExample example);

    int updateByExample(@Param("record") InnodbFtBeingDeleted record, @Param("example") InnodbFtBeingDeletedExample example);
}