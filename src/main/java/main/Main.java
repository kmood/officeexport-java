package main;

import com.kmood.datahandle.DocumentProducer;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args)throws Exception {

//        testModel1();
                testModel2();
        return;
    }

    public static void testModel2() throws Exception {
        Class<? extends Class> aClass = Main.class.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        if (classLoader == null){
            classLoader = ClassLoader.getSystemClassLoader();
        }
//        URL resource = classLoader.getResource(".");
        String ActualModelPath = classLoader.getResource("./model/").toURI().getPath();
        String xmlPath = classLoader.getResource("./model").toURI().getPath();
        String ExportFilePath = classLoader.getResource(".").toURI().getPath() + "/test.doc";


        HashMap<String, Object> map = new HashMap<>();
        ArrayList<Object> columns = new ArrayList<>();
        HashMap<String, Object> zxsmmap = new HashMap<>();
        zxsmmap.put("column_name", "kmood-1");
        zxsmmap.put("column_type", "kmood-column_type");
        zxsmmap.put("column_comment","kmood-column_comment");
        columns.add(zxsmmap);
        HashMap<String, Object> zxsmmap1 = new HashMap<>();
        zxsmmap1.put("column_name", "kmood-1");
        zxsmmap1.put("column_type", "kmood-column_type");
        zxsmmap1.put("column_comment","kmood-column_comment");
        columns.add(zxsmmap);
        map.put("columns", columns);
        map.put("TABLE_NAME", "kmood-表名");
        map.put("index", "kmood index");


        HashMap<String, Object> map1 = new HashMap<>();

        ArrayList<Object> columns1 = new ArrayList<>();
        HashMap<String, Object> zxsmmap2 = new HashMap<>();
        zxsmmap2.put("column_name", "kmood-1");
        zxsmmap2.put("column_type", "kmood-column_type");
        zxsmmap2.put("column_comment","kmood-column_comment");
        columns.add(zxsmmap);
        HashMap<String, Object> zxsmmap3 = new HashMap<>();
        zxsmmap3.put("column_name", "kmood-1");
        zxsmmap3.put("column_type", "kmood-column_type");
        zxsmmap3.put("column_comment","kmood-column_comment");
        columns.add(zxsmmap);
        map1.put("columns", columns1);
        map1.put("TABLE_NAME", "kmood-表名1");
        map1.put("index", "kmood index1");

        HashMap<String, Object> data = new HashMap<>();
        ArrayList<Object> tables = new ArrayList<>();
        tables.add(map);
        tables.add(map1);
        data.put("tables",tables);


        DocumentProducer dp = new DocumentProducer(ActualModelPath);
        String complie = dp.Complie(xmlPath, "DbExportModel.xml", true);
        System.out.println(complie);
        dp.produce(data, ExportFilePath);
    }
    public static void testModel1() throws Exception {
        Class<? extends Class> aClass = Main.class.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        if (classLoader == null){
            classLoader = ClassLoader.getSystemClassLoader();
        }
//        URL resource = classLoader.getResource(".");
        String ActualModelPath = classLoader.getResource("./model/").toURI().getPath();
        String xmlPath = classLoader.getResource("./model").toURI().getPath();
        String ExportFilePath = classLoader.getResource(".").toURI().getPath() + "/包装说明表（范例A）.doc";
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
        String complie = dp.Complie(xmlPath, "test.xml", true);
        System.out.println(complie);
        dp.produce(map, ExportFilePath);
    }
}
