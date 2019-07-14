package com.test;


import com.core.datahandle.DocumentProducer;
import com.core.utils.ConvertionUtil;
import com.core.utils.JsonBinder;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: SunBC
 * @Date: 2019/1/15 12:29
 * @Description:
 */
public class test {
    /**
     * description:包装说明表（范例A）.xml  模板导出测试
     * @auther: SunBC
     * @date: 2019/7/12 16:58
     */
    @Test
    public  void test1(){
        String path = this.getClass().getClassLoader().getResource("./model/").getPath();
        String xmlPath = this.getClass().getClassLoader().getResource("./model/包装说明表（范例A）.xml").getPath();
        String ExportFilePath = this.getClass().getClassLoader().getResource("./model/包装说明表（范例A）.xml").getPath()+".doc";
        try {
            HashMap<String, Object> map = new HashMap<>();
            map.put("zzdhm","kmood-导出-制造单号码");
            map.put("ydwcrq","kmood-导出-预定完成日期");
            map.put("cpmc","kmood-导出-产品名称");
            map.put("jyrq","kmood-导出-交运日期");
            map.put("sl","kmood-导出-数量");
            map.put("xs","kmood-导出-箱数");

            ArrayList<Object> zxsmList = new ArrayList<>();
            HashMap<String, Object> zxsmmap = new HashMap<>();
            zxsmmap.put("xh","kmood-导出-箱号");
            zxsmmap.put("xs","kmood-导出-箱数");
            zxsmmap.put("zrl","kmood-导出-梅香");
            zxsmmap.put("zsl","kmood-导出-交运日期");
            zxsmmap.put("sm","kmood-导出-交运日期");
            zxsmList.add(zxsmmap);
            HashMap<String, Object> zxsmmap1 = new HashMap<>();
            zxsmmap1.put("xh","kmood-导出-制造单号码");
            zxsmmap1.put("xs","kmood-导出-预定完成日期");
            zxsmmap1.put("zrl","kmood-导出-产品名称");
            zxsmmap1.put("zsl","kmood-导出-交运日期");
            zxsmmap1.put("sm","kmood-导出-交运日期");
            zxsmList.add(zxsmmap);
            map.put("zxsm",zxsmList);
            map.put("sbsm","kmood-导出-商标说明");
            DocumentProducer dp = new DocumentProducer(path);
            dp.Complie(xmlPath);
            dp.produce(map,ExportFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
