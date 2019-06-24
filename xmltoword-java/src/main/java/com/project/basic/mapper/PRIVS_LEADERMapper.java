package com.project.basic.mapper;

import com.project.basic.entity.PRIVS_LEADER;
import com.project.basic.entity.PRIVS_LEADERExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PRIVS_LEADERMapper {
    long countByExample(PRIVS_LEADERExample example);

    int deleteByExample(PRIVS_LEADERExample example);

    int deleteByPrimaryKey(String ID);

    int insert(PRIVS_LEADER record);

    int insertSelective(PRIVS_LEADER record);

    List<PRIVS_LEADER> selectByExample(PRIVS_LEADERExample example);

    PRIVS_LEADER selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") PRIVS_LEADER record, @Param("example") PRIVS_LEADERExample example);

    int updateByExample(@Param("record") PRIVS_LEADER record, @Param("example") PRIVS_LEADERExample example);

    int updateByPrimaryKeySelective(PRIVS_LEADER record);

    int updateByPrimaryKey(PRIVS_LEADER record);
}