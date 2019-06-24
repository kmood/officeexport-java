package com.project.test.mapper;

import com.project.test.tablemodel.Test_two;
import com.project.test.tablemodel.Test_twoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Test_twoMapper {
    long countByExample(Test_twoExample example);

    int deleteByExample(Test_twoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Test_two record);

    int insertSelective(Test_two record);

    List<Test_two> selectByExample(Test_twoExample example);

    Test_two selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Test_two record, @Param("example") Test_twoExample example);

    int updateByExample(@Param("record") Test_two record, @Param("example") Test_twoExample example);

    int updateByPrimaryKeySelective(Test_two record);

    int updateByPrimaryKey(Test_two record);
}