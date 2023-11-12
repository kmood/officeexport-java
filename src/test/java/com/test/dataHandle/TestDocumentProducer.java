package com.test.dataHandle;

import com.kmood.datahandle.DocumentProducer;
import com.kmood.utils.FreemarkerUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: SunBC
 * @Date: 2019/7/11 13:08
 * @Description: 测试2003版xml导出
 */
public class TestDocumentProducer {
    String path = this.getClass().getClassLoader().getResource("./model/").getPath();
    String xmlPath = this.getClass().getClassLoader().getResource("./model").getPath();
    String ExportFilePath = this.getClass().getClassLoader().getResource("./model/testWordTableList.xml").getPath()+".doc";
    /**
     * description: 基本导出测试
     * @auther: SunBC
     * @date: 2019/7/12 16:54
     */
    @Test
    public void TestDocumentProducer(){
        try {
            HashMap<String, Object> data = getData();
            DocumentProducer dp = new DocumentProducer(path);
            dp.Complie(xmlPath,"testWordTableList.xml",true);
            dp.produce(data,ExportFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * description: 自定义FM配置测试
     * @auther: SunBC
     * @date: 2019/7/12 16:54
     */
    @Test
    public void TestDocumentProducerCustomer(){
        try {
            HashMap<String, Object> data = getData();
            DocumentProducer dp = new DocumentProducer(FreemarkerUtil.configuration,path);
            dp.Complie(xmlPath,"testWordTableList.xml",true);
            dp.produce(data,ExportFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private HashMap<String, Object> getData() {
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
        return map;
    }

}
