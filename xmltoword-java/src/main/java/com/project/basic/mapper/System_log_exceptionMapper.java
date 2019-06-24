package com.project.basic.mapper;

import com.project.basic.entity.System_log_exception;
import com.project.basic.entity.System_log_exceptionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface System_log_exceptionMapper {
    long countByExample(System_log_exceptionExample example);

    int deleteByExample(System_log_exceptionExample example);

    int deleteByPrimaryKey(String id);

    int insert(System_log_exception record);

    int insertSelective(System_log_exception record);

    List<System_log_exception> selectByExample(System_log_exceptionExample example);

    System_log_exception selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") System_log_exception record, @Param("example") System_log_exceptionExample example);

    int updateByExample(@Param("record") System_log_exception record, @Param("example") System_log_exceptionExample example);

    int updateByPrimaryKeySelective(System_log_exception record);

    int updateByPrimaryKey(System_log_exception record);
}