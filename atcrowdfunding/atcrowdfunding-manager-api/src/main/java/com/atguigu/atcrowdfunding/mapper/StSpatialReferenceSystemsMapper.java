package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.StSpatialReferenceSystems;
import com.atguigu.atcrowdfunding.bean.StSpatialReferenceSystemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StSpatialReferenceSystemsMapper {
    long countByExample(StSpatialReferenceSystemsExample example);

    int deleteByExample(StSpatialReferenceSystemsExample example);

    int insert(StSpatialReferenceSystems record);

    int insertSelective(StSpatialReferenceSystems record);

    List<StSpatialReferenceSystems> selectByExample(StSpatialReferenceSystemsExample example);

    int updateByExampleSelective(@Param("record") StSpatialReferenceSystems record, @Param("example") StSpatialReferenceSystemsExample example);

    int updateByExample(@Param("record") StSpatialReferenceSystems record, @Param("example") StSpatialReferenceSystemsExample example);
}