package com.test;


import com.kmood.datahandle.DocumentProducer;
import com.kmood.utils.ConvertionUtil;
import com.kmood.utils.FileUtils;
import com.kmood.utils.FreemarkerUtil;
import com.kmood.utils.JsonBinder;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kmood.word.WordModelParser;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: SunBC
 * @Date: 2019/1/15 12:29
 * @Description:
 */
public class test {


    /**
     * description:包装说明表（范例A）.xml  模板导出测试,验证格式，测试转义字符。
     * @auther: SunBC
     * @date: 2019/7/12 16:58
     */
    @Test
    public  void test1() throws IOException, TemplateException {
        try {
            String ActualModelPath = this.getClass().getClassLoader().getResource("./model/").toURI().getPath();
            String xmlPath = this.getClass().getClassLoader().getResource("./model").toURI().getPath();
            String ExportFilePath = this.getClass().getClassLoader().getResource("./export").toURI().getPath() + "/包装说明表（范例A）.doc";
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * description:测试导出图片
     * @auther: SunBC
     * @date: 2019/7/16 17:29
     */
    @Test
    public void testexportPicture () {
        try {
            URL Url = this.getClass().getClassLoader().getResource("./model/picture.xml");
            HashMap<String, Object> map = new HashMap<>();
            URL introUrl = this.getClass().getClassLoader().getResource("./picture/exportTestPicture-intro.png");
            URL codeUrl = this.getClass().getClassLoader().getResource("./picture/exportTestPicture-code.png");
            URL titleUrl = this.getClass().getClassLoader().getResource("./picture/exportTestPicture-title.png");
            String intro = Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(introUrl.toURI().getPath()));
            map.put("intro", intro);
            String code = Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(codeUrl.toURI().getPath()));
            map.put("code", code);
            map.put("title", Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(titleUrl.toURI().getPath())));
            String path = Url.toURI().getPath();
            String exportPath = path + ".doc";
            String compile = WordModelParser.Compile(path, null);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(exportPath), "utf-8");
            Template template = FreemarkerUtil.configuration.getTemplate("picture.xml.ftl");
            template.process(map, outputStreamWriter);
            System.out.println("-----导出文件路径-----" + exportPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public  void exportDb()throws Exception{


        HashMap<String, Object> map_export = new HashMap<>();

        ArrayList<Map<String, Object>> mapList = new ArrayList<>();
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("index",1);
        map1.put("TABLE_NAME","test");
        ArrayList<Map<String, Object>> mapList_c = new ArrayList<>();
        HashMap<String, Object> map = new HashMap<>();
        map.put("column_name","通用字段1");
        map.put("column_type","varchar1");
        map.put("column_comment","测试1");
        mapList_c.add(map);

        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("column_name","通用字段2");
        map2.put("column_type","varchar2");
        map2.put("column_comment","测试2");
        mapList_c.add(map2);
        map1.put("columns",mapList_c);


        mapList.add(map1);

        HashMap<String, Object> map5 = new HashMap<>();
        map5.put("index",1);
        map5.put("TABLE_NAME","test");
        ArrayList<Map<String, Object>> mapList_c2 = new ArrayList<>();
        HashMap<String, Object> map3 = new HashMap<>();
        map3.put("column_name","通用<字段1");
        map3.put("column_type",">varchar1");
        map3.put("column_comment","&测试1");
        mapList_c2.add(map3);

        HashMap<String, Object> map4 = new HashMap<>();
        map4.put("column_name","通用字段2");
        map4.put("column_type","varchar2");
        map4.put("column_comment","测试2");
        mapList_c2.add(map4);
        map5.put("columns",mapList_c2);


        mapList.add(map5);




        map_export.put("tables",mapList);




        DocumentProducer dp = new DocumentProducer("C:\\Users\\admin\\Desktop\\");
        String complie = dp.Complie("C:\\Users\\admin\\Desktop\\", "DbExportModel.xml", true);
        System.out.println(complie);
        dp.produce(map_export, "C:\\Users\\admin\\Desktop\\gpm3-2018-08-01-export.doc");


    }


}
