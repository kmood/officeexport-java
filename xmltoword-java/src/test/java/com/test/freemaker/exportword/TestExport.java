package com.test.freemaker.exportword;

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
        map1.put("landName","协作项目-通用字段1");
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("landName","协作项目-通用字段2");
        mapList.add(map1);
        mapList.add(map2);

        HashMap<String, Object> maps = new HashMap<>();
        maps.put("landName","通用字段");
        maps.put("WDBH","wendangbianhao");
        maps.put("XZBMLIST",mapList);
        maps.put("XMMC","wendangbianhao");
        maps.put("WDBH","wendangbianhao");
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("C:\\Users\\admin\\Desktop\\OldDesktop\\snoa\\export.doc"), "utf-8");
//        Template template = FreemarkerUtil.configuration.getTemplate("lxqrs-test.ftl");
//        template.process(maps,outputStreamWriter);


    }
}
