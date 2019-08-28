package com.test.word;

import com.kmood.utils.FileUtils;
import com.kmood.utils.FreemarkerUtil;
import com.kmood.word.WordModelHandlerImpl;
import com.kmood.word.WordModelParser;
import freemarker.template.Template;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: SunBC
 * @Date: 2019/7/1 13:05
 * @Description:
 */
public class TestWordExcelModelHandlerImpl {
    URL Url = this.getClass().getClassLoader().getResource("./model/testWordTableList.xml");
//URL Url = this.getClass().getClassLoader().getResource("./model/包装说明表（范例A）.xml");
    private  static WordModelHandlerImpl w ;
    static {
        w = new WordModelHandlerImpl();
    }
    @Test
    public void TestVerifyModel(){
        try {
            String path = Url.toURI().getPath();
            w.VerifyModel(path,path+".ftl");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void TestConverToFreemaker(){
        try {
            String path = Url.toURI().getPath();
            w.ConverToFreemaker(path+".ftl");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void TestXmlPlaceHolderHandler(){
        try {
            String path = Url.toURI().getPath();
            String s = w.ConverToFreemaker(path+".ftl");
            w.XmlPlaceHolderHandler(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void TestVerifyModelTotal(){
        try {
            String path = Url.toURI().getPath();
            String compile = WordModelParser.Compile(path,null);
            System.out.println(compile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * description:
     * 测试[# 表格循环嵌套
     * 测试转义字符
     * @auther: SunBC
     * @date: 2019/7/4 21:16
     */
    @Test
    public  void exportWord()throws Exception{
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
        String path = Url.toURI().getPath();
        String exportPath = path +".doc";
        String compile = WordModelParser.Compile(path,null);


        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(exportPath), "utf-8");
        Template template = FreemarkerUtil.configuration.getTemplate("testWordTableList.xml.ftl");
        template.process(map,outputStreamWriter);
        System.out.println("-----导出文件路径-----"+exportPath);
    }

}
