package com.project.basic.mapper;

import com.project.basic.entity.PRIVS_ROLE;
import com.project.basic.entity.PRIVS_ROLEExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PRIVS_ROLEMapper {
    long countByExample(PRIVS_ROLEExample example);

    int deleteByExample(PRIVS_ROLEExample example);

    int deleteByPrimaryKey(String ID);

    int insert(PRIVS_ROLE record);

    int insertSelective(PRIVS_ROLE record);

    List<PRIVS_ROLE> selectByExampleWithBLOBs(PRIVS_ROLEExample example);

    List<PRIVS_ROLE> selectByExample(PRIVS_ROLEExample example);

    PRIVS_ROLE selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") PRIVS_ROLE record, @Param("example") PRIVS_ROLEExample example);

    int updateByExampleWithBLOBs(@Param("record") PRIVS_ROLE record, @Param("example") PRIVS_ROLEExample example);

    int updateByExample(@Param("record") PRIVS_ROLE record, @Param("example") PRIVS_ROLEExample example);

    int updateByPrimaryKeySelective(PRIVS_ROLE record);

    int updateByPrimaryKeyWithBLOBs(PRIVS_ROLE record);

    int updateByPrimaryKey(PRIVS_ROLE record);
}