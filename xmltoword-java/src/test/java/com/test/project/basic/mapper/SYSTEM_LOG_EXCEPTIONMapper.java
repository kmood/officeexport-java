package com.test.project.basic.mapper;

import com.test.project.basic.entity.SYSTEM_LOG_EXCEPTION;

public interface SYSTEM_LOG_EXCEPTIONMapper {
    int deleteByPrimaryKey(String ID);

    int insert(SYSTEM_LOG_EXCEPTION record);

    int insertSelective(SYSTEM_LOG_EXCEPTION record);

    SYSTEM_LOG_EXCEPTION selectByPrimaryKey(String ID);

    int updateByPrimaryKeySelective(SYSTEM_LOG_EXCEPTION record);

    int updateByPrimaryKeyWithBLOBs(SYSTEM_LOG_EXCEPTION record);

    int updateByPrimaryKey(SYSTEM_LOG_EXCEPTION record);
}