package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbSessionTempTablespaces;
import com.atguigu.atcrowdfunding.bean.InnodbSessionTempTablespacesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSessionTempTablespacesMapper {
    long countByExample(InnodbSessionTempTablespacesExample example);

    int deleteByExample(InnodbSessionTempTablespacesExample example);

    int insert(InnodbSessionTempTablespaces record);

    int insertSelective(InnodbSessionTempTablespaces record);

    List<InnodbSessionTempTablespaces> selectByExample(InnodbSessionTempTablespacesExample example);

    int updateByExampleSelective(@Param("record") InnodbSessionTempTablespaces record, @Param("example") InnodbSessionTempTablespacesExample example);

    int updateByExample(@Param("record") InnodbSessionTempTablespaces record, @Param("example") InnodbSessionTempTablespacesExample example);
}