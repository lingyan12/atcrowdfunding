package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.InnodbTablespacesBrief;
import com.atguigu.atcrowdfunding.bean.InnodbTablespacesBriefExample;
import com.atguigu.atcrowdfunding.bean.InnodbTablespacesBriefWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTablespacesBriefMapper {
    long countByExample(InnodbTablespacesBriefExample example);

    int deleteByExample(InnodbTablespacesBriefExample example);

    int insert(InnodbTablespacesBriefWithBLOBs record);

    int insertSelective(InnodbTablespacesBriefWithBLOBs record);

    List<InnodbTablespacesBriefWithBLOBs> selectByExampleWithBLOBs(InnodbTablespacesBriefExample example);

    List<InnodbTablespacesBrief> selectByExample(InnodbTablespacesBriefExample example);

    int updateByExampleSelective(@Param("record") InnodbTablespacesBriefWithBLOBs record, @Param("example") InnodbTablespacesBriefExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbTablespacesBriefWithBLOBs record, @Param("example") InnodbTablespacesBriefExample example);

    int updateByExample(@Param("record") InnodbTablespacesBrief record, @Param("example") InnodbTablespacesBriefExample example);
}