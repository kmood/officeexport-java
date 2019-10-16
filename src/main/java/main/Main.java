package main;

import com.kmood.datahandle.DocumentProducer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Auther: SunBC
 * @Date: 2019/10/11 13:06
 * @Description:
 */
public class Main {
    public static void main(String[] args)throws Exception {
        String ActualModelPath = Main.class.getClass().getClassLoader().getResource("./model/").toURI().getPath();
        String xmlPath = Main.class.getClass().getClassLoader().getResource("./model").toURI().getPath();
        String ExportFilePath = Main.class.getClass().getClassLoader().getResource("./export").toURI().getPath() + "/包装说明表（范例A）.doc";
        HashMap<String, Object> map = new HashMap<>();
        map.put("zzdhm", "kmood-制造单号码");
        map.put("ydwcrq", "kmood-预定完成日期");
        map.put("cpmc", "kmood-产品名称");
        map.put("jyrq", "kmood-交运日期");
        map.put("sl", "kmood-数量");
        map.put("xs", "kmood-箱数");

        ArrayList<Object> zxsmList = new ArrayList<>();
        HashMap<String, Object> zxsmmap = new HashMap<>();
        zxsmmap.put("xh", "kmood-箱号");
        zxsmmap.put("xs", "kmood-箱数");
        zxsmmap.put("zrl", "kmood-梅香");
        zxsmmap.put("zsl", "kmood-交运日期");
        zxsmmap.put("sm", "kmood-交运日期");
        zxsmList.add(zxsmmap);
        HashMap<String, Object> zxsmmap1 = new HashMap<>();
        zxsmmap1.put("xh", "kmood-制造单号码");
        zxsmmap1.put("xs", "kmood-预定完成日期");
        zxsmmap1.put("zrl","kmood-产品名称");
        zxsmmap1.put("zsl","kmood-交运日期");
        zxsmmap1.put("sm", "kmood-交运日期");
        zxsmList.add(zxsmmap);
        map.put("zxsm", zxsmList);
        map.put("sbsm", "kmood-商标说明");
        map.put("bt", "kmood OfficeExport 导出word");
        DocumentProducer dp = new DocumentProducer(ActualModelPath);
        String complie = dp.Complie(xmlPath, "包装说明表（范例A）.xml", true);
        System.out.println(complie);
        dp.produce(map, ExportFilePath);
    }
}
