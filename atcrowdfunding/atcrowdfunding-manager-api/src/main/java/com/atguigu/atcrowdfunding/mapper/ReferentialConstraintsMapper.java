package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ReferentialConstraints;
import com.atguigu.atcrowdfunding.bean.ReferentialConstraintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReferentialConstraintsMapper {
    long countByExample(ReferentialConstraintsExample example);

    int deleteByExample(ReferentialConstraintsExample example);

    int insert(ReferentialConstraints record);

    int insertSelective(ReferentialConstraints record);

    List<ReferentialConstraints> selectByExample(ReferentialConstraintsExample example);

    int updateByExampleSelective(@Param("record") ReferentialConstraints record, @Param("example") ReferentialConstraintsExample example);

    int updateByExample(@Param("record") ReferentialConstraints record, @Param("example") ReferentialConstraintsExample example);
}