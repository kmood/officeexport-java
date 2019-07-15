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
     * description:包装说明表（范例A）.xml  模板导出测试,验证格式，功能
     * @auther: SunBC
     * @date: 2019/7/12 16:58
     */
    @Test
    public  void test1(){
        try {
            String path = this.getClass().getClassLoader().getResource("./model/").toURI().getPath();
            String xmlPath = this.getClass().getClassLoader().getResource("./model/包装说明表（范例A）.xml").toURI().getPath();
            String ExportFilePath = this.getClass().getClassLoader().getResource("./model/包装说明表（范例A）.xml").toURI().getPath()+".doc";
            HashMap<String, Object> map = new HashMap<>();
            map.put("zzdhm","kmood-制造单号码");
            map.put("ydwcrq","kmood-预定完成日期");
            map.put("cpmc","kmood-产品名称");
            map.put("jyrq","kmood-交运日期");
            map.put("sl","kmood-数量");
            map.put("xs","kmood-箱数");

            ArrayList<Object> zxsmList = new ArrayList<>();
            HashMap<String, Object> zxsmmap = new HashMap<>();
            zxsmmap.put("xh","kmood-箱号");
            zxsmmap.put("xs","kmood-箱数");
            zxsmmap.put("zrl","kmood-梅香");
            zxsmmap.put("zsl","kmood-交运日期");
            zxsmmap.put("sm","kmood-交运日期");
            zxsmList.add(zxsmmap);
            HashMap<String, Object> zxsmmap1 = new HashMap<>();
            zxsmmap1.put("xh","kmood-制造单号码");
            zxsmmap1.put("xs","kmood-预定完成日期");
            zxsmmap1.put("zrl","kmood-产品名称");
            zxsmmap1.put("zsl","kmood-交运日期");
            zxsmmap1.put("sm","kmood-交运日期");
            zxsmList.add(zxsmmap);
            map.put("zxsm",zxsmList);
            map.put("sbsm","kmood-商标说明");
            map.put("bt","kmood OfficeExport 导出word");
            DocumentProducer dp = new DocumentProducer(path);
            dp.Complie(xmlPath,true);
            dp.produce(map,ExportFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
