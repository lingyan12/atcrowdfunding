package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.CollationCharacterSetApplicability;
import com.atguigu.atcrowdfunding.bean.CollationCharacterSetApplicabilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollationCharacterSetApplicabilityMapper {
    long countByExample(CollationCharacterSetApplicabilityExample example);

    int deleteByExample(CollationCharacterSetApplicabilityExample example);

    int insert(CollationCharacterSetApplicability record);

    int insertSelective(CollationCharacterSetApplicability record);

    List<CollationCharacterSetApplicability> selectByExample(CollationCharacterSetApplicabilityExample example);

    int updateByExampleSelective(@Param("record") CollationCharacterSetApplicability record, @Param("example") CollationCharacterSetApplicabilityExample example);

    int updateByExample(@Param("record") CollationCharacterSetApplicability record, @Param("example") CollationCharacterSetApplicabilityExample example);
}