package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbTablespaces;
import com.atguigu.atcrowdfunding.bean.InnodbTablespacesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTablespacesMapper {
    long countByExample(InnodbTablespacesExample example);

    int deleteByExample(InnodbTablespacesExample example);

    int insert(InnodbTablespaces record);

    int insertSelective(InnodbTablespaces record);

    List<InnodbTablespaces> selectByExample(InnodbTablespacesExample example);

    int updateByExampleSelective(@Param("record") InnodbTablespaces record, @Param("example") InnodbTablespacesExample example);

    int updateByExample(@Param("record") InnodbTablespaces record, @Param("example") InnodbTablespacesExample example);
}