package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.TableConstraints;
import com.atguigu.atcrowdfunding.bean.TableConstraintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableConstraintsMapper {
    long countByExample(TableConstraintsExample example);

    int deleteByExample(TableConstraintsExample example);

    int insert(TableConstraints record);

    int insertSelective(TableConstraints record);

    List<TableConstraints> selectByExample(TableConstraintsExample example);

    int updateByExampleSelective(@Param("record") TableConstraints record, @Param("example") TableConstraintsExample example);

    int updateByExample(@Param("record") TableConstraints record, @Param("example") TableConstraintsExample example);
}