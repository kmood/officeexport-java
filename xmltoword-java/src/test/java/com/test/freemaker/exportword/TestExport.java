package com.test.freemaker.exportword;

import com.core.utils.FreemarkerUtil;
import com.core.word.XmlModelParser;
import freemarker.template.Template;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: SunBC
 * @Date: 2019/4/16 10:09
 * @Description:
 */
public class TestExport {
    /**
     * description: 测试[# 表格循环嵌套
     * @auther: SunBC
     * @date: 2019/7/4 21:16
     */
    @Test
    public  void exportWord()throws Exception{
        String path = this.getClass().getClassLoader().getResource("./model/testWordTableList.xml").getPath();
        XmlModelParser.Compile(path);
        ArrayList<Map<String, Object>> mapList = new ArrayList<>();
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("a","word Export-a");
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("a","word Export-a");
        mapList.add(map1);
        mapList.add(map2);


        HashMap<String, Object> maps = new HashMap<>();
        maps.put("test3","word Export-test3");
        maps.put("test2","word Export-test2");
        maps.put("test4",mapList);

        HashMap<String, Object> maps1 = new HashMap<>();
        maps1.put("test3","word Export-test3");
        maps1.put("test2","word Export-test2");
        maps1.put("test4",mapList);

        ArrayList<Map<String, Object>> mapList2 = new ArrayList<>();
        mapList2.add(maps);
        mapList2.add(maps1);

        HashMap<String, Object> map = new HashMap<>();
        map.put("test6","word Export-test6");
        map.put("test5",mapList2);
        map.put("test0","word Export-test0");
        map.put("test1","word Export-test1");
        String exportPath = path.substring(0, path.indexOf(".")) + ".doc";
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(exportPath), "utf-8");
        Template template = FreemarkerUtil.configuration.getTemplate("testWordTableList.ftl");
        template.process(map,outputStreamWriter);
    }
}
