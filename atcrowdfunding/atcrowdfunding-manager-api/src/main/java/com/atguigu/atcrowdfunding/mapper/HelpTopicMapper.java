package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.HelpTopic;
import com.atguigu.atcrowdfunding.bean.HelpTopicExample;
import com.atguigu.atcrowdfunding.bean.HelpTopicWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpTopicMapper {
    long countByExample(HelpTopicExample example);

    int deleteByExample(HelpTopicExample example);

    int deleteByPrimaryKey(Integer helpTopicId);

    int insert(HelpTopicWithBLOBs record);

    int insertSelective(HelpTopicWithBLOBs record);

    List<HelpTopicWithBLOBs> selectByExampleWithBLOBs(HelpTopicExample example);

    List<HelpTopic> selectByExample(HelpTopicExample example);

    HelpTopicWithBLOBs selectByPrimaryKey(Integer helpTopicId);

    int updateByExampleSelective(@Param("record") HelpTopicWithBLOBs record, @Param("example") HelpTopicExample example);

    int updateByExampleWithBLOBs(@Param("record") HelpTopicWithBLOBs record, @Param("example") HelpTopicExample example);

    int updateByExample(@Param("record") HelpTopic record, @Param("example") HelpTopicExample example);

    int updateByPrimaryKeySelective(HelpTopicWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HelpTopicWithBLOBs record);

    int updateByPrimaryKey(HelpTopic record);
}