package com.project.basic.mapper;

import com.project.basic.entity.PRIVS_USER;
import com.project.basic.entity.PRIVS_USERExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PRIVS_USERMapper {
    long countByExample(PRIVS_USERExample example);

    int deleteByExample(PRIVS_USERExample example);

    int deleteByPrimaryKey(String ID);

    int insert(PRIVS_USER record);

    int insertSelective(PRIVS_USER record);

    List<PRIVS_USER> selectByExampleWithBLOBs(PRIVS_USERExample example);

    List<PRIVS_USER> selectByExample(PRIVS_USERExample example);

    PRIVS_USER selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") PRIVS_USER record, @Param("example") PRIVS_USERExample example);

    int updateByExampleWithBLOBs(@Param("record") PRIVS_USER record, @Param("example") PRIVS_USERExample example);

    int updateByExample(@Param("record") PRIVS_USER record, @Param("example") PRIVS_USERExample example);

    int updateByPrimaryKeySelective(PRIVS_USER record);

    int updateByPrimaryKeyWithBLOBs(PRIVS_USER record);

    int updateByPrimaryKey(PRIVS_USER record);
}