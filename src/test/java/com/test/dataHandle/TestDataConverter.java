package com.test.dataHandle;

import com.core.datahandle.Config;
import com.core.datahandle.DataConverter;
import com.core.datahandle.DataHandler;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: SunBC
 * @Date: 2019/7/11 15:05
 * @Description:
 */
public class TestDataConverter {

    @Test
    public void TestConvert(){
        HashMap<String, Object> data = getData();
        System.out.println("转换前数据--"+data);

        Config config = new Config();
        config.setKeyHandler("test5", new DataHandler() {
            @Override
            public Object ObjHandle(Object DataValue) {
                return "word Export-a-处理过后";
            }
        });
        Object convert = DataConverter.convert(data, config);
        System.out.println("转换后数据--"+convert);
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
