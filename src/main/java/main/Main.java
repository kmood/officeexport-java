package main;

import com.kmood.datahandle.DocumentProducer;
import com.kmood.utils.FileUtils;
import com.kmood.utils.FreemarkerUtil;
import com.kmood.word.WordModelParser;
import freemarker.template.Template;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;


public class Main {
    public static void main(String[] args)throws Exception {
        //文本输出
        testTextOutModel();
        //文本循环输出
        testTextFOutModel();
        //文本、表格循环输出
        testTextFTableOutModel();
        //测试图片导出
        testPictureOutModel();
        return;
    }

    public static void testModel3() throws Exception {
        Class<? extends Class> aClass = Main.class.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        if (classLoader == null){
            classLoader = ClassLoader.getSystemClassLoader();
        }
//        URL resource = classLoader.getResource(".");
        String ActualModelPath = classLoader.getResource("./model/").toURI().getPath();
        String xmlPath = classLoader.getResource("./model").toURI().getPath();
        String ExportFilePath = classLoader.getResource(".").toURI().getPath() + "/test-fy.doc";

        HashMap<String, Object> map = new HashMap<>();
        ArrayList<Object> columns = new ArrayList<>();
        HashMap<String, Object> map2 = new HashMap<>();

        map2.put("tbrq", "kmood-表名");
        columns.add(map2);
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("tbrq", "kmood index");
        columns.add(map1);
        map.put("tables",columns);



        DocumentProducer dp = new DocumentProducer(ActualModelPath);
        String complie = dp.Complie(xmlPath, "test-fy.xml", true);
        System.out.println(ExportFilePath);
        dp.produce(map, ExportFilePath);
    }

  //测试表输出
    public static void testTableOutModel() throws Exception {
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
        String complie = dp.Complie(xmlPath, "text.xml", true);
        System.out.println(complie);
        dp.produce(map, ExportFilePath);
    }
    //文本输出
    public static void testTextOutModel() throws Exception {
        Class<? extends Class> aClass = Main.class.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        if (classLoader == null){
            classLoader = ClassLoader.getSystemClassLoader();
        }
//        URL resource = classLoader.getResource(".");
        String ActualModelPath = classLoader.getResource("./model/").toURI().getPath();
        String xmlPath = classLoader.getResource("./model").toURI().getPath();
        String ExportFilePath = classLoader.getResource(".").toURI().getPath() + "/testf.doc";

        HashMap<String, Object> map = new HashMap<>();
        map.put("text", "kmood-文本占位输出");
        map.put("text1", "kmood-文本占位输出2");
        DocumentProducer dp = new DocumentProducer(ActualModelPath);
        String complie = dp.Complie(xmlPath, "text.xml", true);
        System.out.println(complie);
        dp.produce(map, ExportFilePath);
    }
    //文本循环输出
    public static void testTextFOutModel() throws Exception {
        Class<? extends Class> aClass = Main.class.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        if (classLoader == null){
            classLoader = ClassLoader.getSystemClassLoader();
        }
        String ActualModelPath = classLoader.getResource("./model/").toURI().getPath();
        String xmlPath = classLoader.getResource("./model").toURI().getPath();
        String ExportFilePath = classLoader.getResource(".").toURI().getPath() + "/textf.doc";
        //准备数据
        HashMap<String, Object> map = new HashMap<>();
        ArrayList<Object> tables = new ArrayList<>();
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("text", "kmood-文本占位输出-循环1");
        map1.put("text1", "kmood-文本占位输出2-循环1");
        tables.add(map1);
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("text", "kmood-文本占位输出-循环2");
        map2.put("text1", "kmood-文本占位输出2-循环2");
        tables.add(map2);
        map.put("tables",tables);
        //编译输出
        DocumentProducer dp = new DocumentProducer(ActualModelPath);
        String complie = dp.Complie(xmlPath, "textf.xml", true);
        dp.produce(map, ExportFilePath);
    }

    //文本表格循环输出
    public static void testTextFTableOutModel() throws Exception {
        Class<? extends Class> aClass = Main.class.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        if (classLoader == null){
            classLoader = ClassLoader.getSystemClassLoader();
        }
        String ActualModelPath = classLoader.getResource("./model/").toURI().getPath();
        String xmlPath = classLoader.getResource("./model").toURI().getPath();
        String ExportFilePath = classLoader.getResource(".").toURI().getPath() + "/table.doc";
        //准备数据
        HashMap<String, Object> map = new HashMap<>();
        ArrayList<Object> tables = new ArrayList<>();
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("text", "kmood-文本占位输出-循环1");
        map1.put("text1", "kmood-文本占位输出2-循环1");
        //表格数据
        ArrayList<Object> columns1= new ArrayList<>();
        HashMap<String, Object> row = new HashMap<>();
        row.put("column1", "kmood-table1-column1-row1");
        row.put("column2", "kmood-table1-column2-row1");
        columns1.add(row);
        HashMap<String, Object> row2 = new HashMap<>();
        row2.put("column1", "kmood-table1-column1-row2");
        row2.put("column2", "kmood-table1-column2-row2");
        columns1.add(row2);
        map1.put("columns", columns1);
        tables.add(map1);

        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("text", "kmood-文本占位输出-循环2");
        map2.put("text1", "kmood-文本占位输出2-循环2");
        //表格数据
        ArrayList<Object> columns2= new ArrayList<>();
        HashMap<String, Object> row3 = new HashMap<>();
        row3.put("column1", "kmood-table2-column1-row1");
        row3.put("column2", "kmood-table2-column2-row1");
        columns2.add(row3);
        HashMap<String, Object> row4 = new HashMap<>();
        row4.put("column1", "kmood-table2-column1-row2");
        row4.put("column2", "kmood-table2-column2-row2");
        columns2.add(row4);
        map2.put("columns", columns2);

        tables.add(map2);
        map.put("tables",tables);
        //编译输出
        DocumentProducer dp = new DocumentProducer(ActualModelPath);
        String complie = dp.Complie(xmlPath, "table.xml", true);
        dp.produce(map, ExportFilePath);
    }
    public static void testPictureOutModel () {
        try {
            Class<? extends Class> aClass = Main.class.getClass();
            ClassLoader classLoader = aClass.getClassLoader();
            if (classLoader == null){
                classLoader = ClassLoader.getSystemClassLoader();
            }
            String ActualModelPath = classLoader.getResource("./model/").toURI().getPath();
            String xmlPath = classLoader.getResource("./model").toURI().getPath();
            String ExportFilePath = classLoader.getResource(".").toURI().getPath() + "/picture.doc";

            HashMap<String, Object> map = new HashMap<>();
            //读取输出图片
            URL introUrl = classLoader.getResource("./picture/exportTestPicture-intro.png");
            URL codeUrl = classLoader.getResource("./picture/exportTestPicture-code.png");
            URL titleUrl = classLoader.getResource("./picture/exportTestPicture-title.png");

            String intro = Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(introUrl.toURI().getPath()));
            map.put("intro", intro);
            String code = Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(codeUrl.toURI().getPath()));
            map.put("code", code);
            map.put("title", Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(titleUrl.toURI().getPath())));
            //编译输出
            DocumentProducer dp = new DocumentProducer(ActualModelPath);
            String complie = dp.Complie(xmlPath, "picture.xml", true);
            dp.produce(map, ExportFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
