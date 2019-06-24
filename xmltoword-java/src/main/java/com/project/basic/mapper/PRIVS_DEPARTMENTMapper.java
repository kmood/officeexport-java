package com.project.basic.mapper;

import com.project.basic.entity.PRIVS_DEPARTMENT;
import com.project.basic.entity.PRIVS_DEPARTMENTExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PRIVS_DEPARTMENTMapper {
    long countByExample(PRIVS_DEPARTMENTExample example);

    int deleteByExample(PRIVS_DEPARTMENTExample example);

    int deleteByPrimaryKey(String ID);

    int insert(PRIVS_DEPARTMENT record);

    int insertSelective(PRIVS_DEPARTMENT record);

    List<PRIVS_DEPARTMENT> selectByExample(PRIVS_DEPARTMENTExample example);

    PRIVS_DEPARTMENT selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") PRIVS_DEPARTMENT record, @Param("example") PRIVS_DEPARTMENTExample example);

    int updateByExample(@Param("record") PRIVS_DEPARTMENT record, @Param("example") PRIVS_DEPARTMENTExample example);

    int updateByPrimaryKeySelective(PRIVS_DEPARTMENT record);

    int updateByPrimaryKey(PRIVS_DEPARTMENT record);
}