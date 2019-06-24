package com.project.basic.mapper;

import com.project.basic.entity.PRIVS_USER_ROLE;
import com.project.basic.entity.PRIVS_USER_ROLEExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PRIVS_USER_ROLEMapper {
    long countByExample(PRIVS_USER_ROLEExample example);

    int deleteByExample(PRIVS_USER_ROLEExample example);

    int insert(PRIVS_USER_ROLE record);

    int insertSelective(PRIVS_USER_ROLE record);

    List<PRIVS_USER_ROLE> selectByExample(PRIVS_USER_ROLEExample example);

    int updateByExampleSelective(@Param("record") PRIVS_USER_ROLE record, @Param("example") PRIVS_USER_ROLEExample example);

    int updateByExample(@Param("record") PRIVS_USER_ROLE record, @Param("example") PRIVS_USER_ROLEExample example);
}