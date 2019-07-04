package com.test.freemaker.exportword;

import com.core.utils.FreemarkerUtil;
import freemarker.template.Template;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: SunBC
 * @Date: 2019/4/16 10:09
 * @Description:
 */
public class TestExport {
    @Test
    public  void exportWord()throws Exception{
        ArrayList<Map<String, Object>> mapList = new ArrayList<>();
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("a","协作项目-通用字段1");
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("a","协作项目-通用字段2");
        mapList.add(map1);
        mapList.add(map2);

        HashMap<String, Object> maps = new HashMap<>();
        maps.put("test3","wendangbianhao");
        maps.put("test4",mapList);


        HashMap<String, Object> map = new HashMap<>();
        map.put("test6","test6");
        map.put("test5",maps);
        map.put("test0",maps);
        map.put("test1",maps);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("C:\\Users\\admin\\Desktop\\export.xml"), "utf-8");
        Template template = FreemarkerUtil.configuration.getTemplate("test.ftl");
        template.process(map,outputStreamWriter);


    }
}
