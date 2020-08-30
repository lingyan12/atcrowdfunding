package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.DaoWoker;
import com.atguigu.atcrowdfunding.bean.DaoWokerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DaoWokerMapper {
    long countByExample(DaoWokerExample example);

    int deleteByExample(DaoWokerExample example);

    int deleteByPrimaryKey(Integer workerId);

    int insert(DaoWoker record);

    int insertSelective(DaoWoker record);

    List<DaoWoker> selectByExample(DaoWokerExample example);

    DaoWoker selectByPrimaryKey(Integer workerId);

    int updateByExampleSelective(@Param("record") DaoWoker record, @Param("example") DaoWokerExample example);

    int updateByExample(@Param("record") DaoWoker record, @Param("example") DaoWokerExample example);

    int updateByPrimaryKeySelective(DaoWoker record);

    int updateByPrimaryKey(DaoWoker record);
}