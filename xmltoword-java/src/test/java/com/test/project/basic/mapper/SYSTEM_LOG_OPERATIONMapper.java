package com.test.project.basic.mapper;

import com.test.project.basic.entity.SYSTEM_LOG_OPERATION;

public interface SYSTEM_LOG_OPERATIONMapper {
    int deleteByPrimaryKey(String ID);

    int insert(SYSTEM_LOG_OPERATION record);

    int insertSelective(SYSTEM_LOG_OPERATION record);

    SYSTEM_LOG_OPERATION selectByPrimaryKey(String ID);

    int updateByPrimaryKeySelective(SYSTEM_LOG_OPERATION record);

    int updateByPrimaryKeyWithBLOBs(SYSTEM_LOG_OPERATION record);

    int updateByPrimaryKey(SYSTEM_LOG_OPERATION record);
}