package com.project.basic.mapper;

import com.project.basic.entity.System_log_operation;
import com.project.basic.entity.System_log_operationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface System_log_operationMapper {
    long countByExample(System_log_operationExample example);

    int deleteByExample(System_log_operationExample example);

    int deleteByPrimaryKey(String id);

    int insert(System_log_operation record);

    int insertSelective(System_log_operation record);

    List<System_log_operation> selectByExample(System_log_operationExample example);

    System_log_operation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") System_log_operation record, @Param("example") System_log_operationExample example);

    int updateByExample(@Param("record") System_log_operation record, @Param("example") System_log_operationExample example);

    int updateByPrimaryKeySelective(System_log_operation record);

    int updateByPrimaryKey(System_log_operation record);
}