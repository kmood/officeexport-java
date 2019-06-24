package com.test.project.basic.mapper;

import com.test.project.basic.entity.XMGL_XMXX;
import com.test.project.basic.entity.XMGL_XMXXExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMGL_XMXXMapper {
    long countByExample(XMGL_XMXXExample example);

    int deleteByExample(XMGL_XMXXExample example);

    int deleteByPrimaryKey(String ID);

    int insert(XMGL_XMXX record);

    int insertSelective(XMGL_XMXX record);

    List<XMGL_XMXX> selectByExampleWithBLOBs(XMGL_XMXXExample example);

    List<XMGL_XMXX> selectByExample(XMGL_XMXXExample example);

    XMGL_XMXX selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") XMGL_XMXX record, @Param("example") XMGL_XMXXExample example);

    int updateByExampleWithBLOBs(@Param("record") XMGL_XMXX record, @Param("example") XMGL_XMXXExample example);

    int updateByExample(@Param("record") XMGL_XMXX record, @Param("example") XMGL_XMXXExample example);

    int updateByPrimaryKeySelective(XMGL_XMXX record);

    int updateByPrimaryKeyWithBLOBs(XMGL_XMXX record);

    int updateByPrimaryKey(XMGL_XMXX record);
}