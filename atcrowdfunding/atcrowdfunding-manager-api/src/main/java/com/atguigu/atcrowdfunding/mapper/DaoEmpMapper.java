package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.DaoEmp;
import com.atguigu.atcrowdfunding.bean.DaoEmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DaoEmpMapper {
    long countByExample(DaoEmpExample example);

    int deleteByExample(DaoEmpExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(DaoEmp record);

    int insertSelective(DaoEmp record);

    List<DaoEmp> selectByExample(DaoEmpExample example);

    DaoEmp selectByPrimaryKey(Integer empId);

    int updateByExampleSelective(@Param("record") DaoEmp record, @Param("example") DaoEmpExample example);

    int updateByExample(@Param("record") DaoEmp record, @Param("example") DaoEmpExample example);

    int updateByPrimaryKeySelective(DaoEmp record);

    int updateByPrimaryKey(DaoEmp record);
}