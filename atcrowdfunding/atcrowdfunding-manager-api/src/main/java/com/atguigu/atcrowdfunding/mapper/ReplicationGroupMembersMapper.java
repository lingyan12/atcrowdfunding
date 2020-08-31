package com.atguigu.atcrowdfunding.mapper;

import com.atguigu.atcrowdfunding.bean.ReplicationGroupMembers;
import com.atguigu.atcrowdfunding.bean.ReplicationGroupMembersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationGroupMembersMapper {
    long countByExample(ReplicationGroupMembersExample example);

    int deleteByExample(ReplicationGroupMembersExample example);

    int insert(ReplicationGroupMembers record);

    int insertSelective(ReplicationGroupMembers record);

    List<ReplicationGroupMembers> selectByExample(ReplicationGroupMembersExample example);

    int updateByExampleSelective(@Param("record") ReplicationGroupMembers record, @Param("example") ReplicationGroupMembersExample example);

    int updateByExample(@Param("record") ReplicationGroupMembers record, @Param("example") ReplicationGroupMembersExample example);
}