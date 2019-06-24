package com.test;


import com.core.service.MapperPackageTool;
import com.core.utils.DateUtils;
import com.core.utils.StringUtil;
import com.project.basic.entity.PRIVS_USER;
import com.project.word.XmlModelHandler;
import com.project.word.XmlModelParser;
import com.project.word.XmlParserUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Auther: SunBC
 * @Date: 2019/1/15 12:29
 * @Description:
 */
public class test {

    @Test
    public void testLettureRedis(){
        try {
            String compile = XmlModelParser.Compile("C:\\\\Users\\\\admin\\\\Desktop\\\\ngccoa export\\\\附件8-固定资产处置申请表.xml");
            System.out.println(compile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRowToCol(){
        try {
            List<Map<String, Object>> maps = new ArrayList<>();
            Map<String , Object> map1 = new HashMap<>();
            map1.put("test1","test1");
            map1.put("test",2);
            maps.add(map1);
            Map<String , Object> map2 = new HashMap<>();
            map2.put("test1","2");
            map2.put("test","test");
            maps.add(map2);
            LinkedHashMap<String, String> stringStringLinkedHashMap = MapperPackageTool.RowToCol(maps, "test1", "test");
            System.out.println(stringStringLinkedHashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
