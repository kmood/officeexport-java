package com.test;


import com.kmood.datahandle.DocumentProducer;
import com.kmood.utils.FileUtils;
import com.kmood.utils.FreemarkerUtil;
import com.kmood.word.WordModelParser;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;

/**
 * @Auther: SunBC
 * @Date: 2019/1/15 12:29
 * @Description:
 */
public class testnew {

//
//    /**
//     * description:包装说明表（范例A）.xml  模板导出测试,验证格式，测试转义字符。
//     * @auther: SunBC
//     * @date: 2019/7/12 16:58
//     */
//    @Test
//    public  void testbgbz() throws IOException, TemplateException {
//        try {
//            String ExportFilePath = "F://grspb_out.docx";
//            HashMap<String, Object> map = new HashMap<>();
////            map.put("zzdhm", "kmood-制造单号码");
////            map.put("ydwcrq", "kmood-预定完成日期");
////            map.put("cpmc", "kmood-产品名称");
////            map.put("jyrq", "kmood-交运日期");
////            map.put("sl", "kmood-数量");
////            map.put("xs", "kmood-箱数");
////
////            ArrayList<Object> zxsmList = new ArrayList<>();
////            HashMap<String, Object> zxsmmap = new HashMap<>();
////            zxsmmap.put("xh", "kmood-箱号");
////            zxsmmap.put("xs", "kmood-箱数");
////            zxsmmap.put("zrl", "kmood-梅香");
////            zxsmmap.put("zsl", "kmood-交运日期");
////            zxsmmap.put("sm", "kmood-交运日期");
////            zxsmList.add(zxsmmap);
////            HashMap<String, Object> zxsmmap1 = new HashMap<>();
////            zxsmmap1.put("xh", "kmood-制造单号码");
////            zxsmmap1.put("xs", "kmood-预定完成日期");
////            zxsmmap1.put("zrl","kmood-产品名称");
////            zxsmmap1.put("zsl","kmood-交运日期");
////            zxsmmap1.put("sm", "kmood-交运日期");
////            zxsmList.add(zxsmmap);
//
//            HashMap<String, Object> zrzhczt = new HashMap<>();
//            HashMap<String, Object> zrzhczt_dxbmMjkeyDetail = new HashMap<>();
//            HashMap<String, Object> zrzhczt_ggfwss_lyjq_levDownCount = new HashMap<>();
//            ArrayList zrzhczt_ggfwss_lyjq_jqdqdj_list = new ArrayList();
//
//            HashMap<String, Object> zrzhczt_ggfwss_lyjq_jqdqdj = new HashMap<>();
//            zrzhczt_ggfwss_lyjq_jqdqdj.put("中医专科医院", "5测试");
//            zrzhczt_ggfwss_lyjq_jqdqdj.put("传染病医院", "传染病医测试");
//            zrzhczt_ggfwss_lyjq_jqdqdj_list.add(zrzhczt_ggfwss_lyjq_jqdqdj);
//
//            HashMap<String, Object> zrzhczt_ggfwss_lyjq_jqdqdj2 = new HashMap<>();
//            zrzhczt_ggfwss_lyjq_jqdqdj2.put("传染病医院", "5-2测试");
//            zrzhczt_ggfwss_lyjq_jqdqdj2.put("中医专科医院", "中医专科医院测试");
//            zrzhczt_ggfwss_lyjq_jqdqdj_list.add(zrzhczt_ggfwss_lyjq_jqdqdj2);
//            zrzhczt_ggfwss_lyjq_levDownCount.put("zrzhczt_ggfwss_ylwsjg_yljglxzkyyfl",zrzhczt_ggfwss_lyjq_jqdqdj_list);
//
//            zrzhczt_dxbmMjkeyDetail.put("zrzhczt_ggfwss_ylwsjg_levDownCount",zrzhczt_ggfwss_lyjq_levDownCount);
//            zrzhczt.put("zrzhczt_dxbmMjkeyDetail",zrzhczt_dxbmMjkeyDetail);
//            map.put("zrzhczt",zrzhczt);
//            URL titleUrl = this.getClass().getClassLoader().getResource("./picture/exportTestPicture-title.png");
//            String intro = Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(titleUrl.toURI().getPath()));
//
//            map.put("headurl",intro);
//
////            zrzhczt.zrzhczt_dxbmMjkeyDetail.zrzhczt_ggfwss_ylwsjg_levDownCount.zrzhczt_ggfwss_ylwsjg_yljglxzkyyfl
//
//            map.put("code_name","yangzhtestaaaaaaaaaaaaaaaaaaaaa-------------");
//
//            DocumentProducer dp = new DocumentProducer("F://");
//            String complie = dp.Complie("F://", "grspb.docx", true);
//            System.out.println(complie);
//            dp.produce(map, ExportFilePath);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    /**
//     * 生成成果报告word
//     * @throws IOException
//     * @throws TemplateException
//     */
//    @Test
//    public  void testztdt() throws IOException, TemplateException {
//        try {
//            // 513326 道孚县
//            // 511133  马边彝族自治县
//            // 511129  沐川县
//            String baseChartUrl="G:\\data\\chart\\511129\\";
//            String ExportFilePath = "F://第一次全国自然灾害风险普查专题图-沐川县(511129).docx";
//            HashMap<String, Object> map = new HashMap<>();
//            System.out.println(new String(Files.readAllBytes(Paths.get(baseChartUrl+"all-map.txt"))));
//            System.out.println(Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"all-circlemap.png")));
//
//
//            map.put("all-circlemap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"all-circlemap.png")));
//            map.put("all-heatmap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"all-heatmap.png")));
//            map.put("all-clustermap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"all-clustermap.png")));
//            map.put("all-map",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"all-map.png")));
//            map.put("all-pie",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"all-pie.png")));
//
//            map.put("allmaptxt",new String(Files.readAllBytes(Paths.get(baseChartUrl+"all-map.txt"))));
//
//            map.put("zrzhczt_ggfwss-circlemap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_ggfwss-circlemap.png")));
//            map.put("zrzhczt_ggfwss-heatmap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_ggfwss-heatmap.png")));
//            map.put("zrzhczt_ggfwss-clustermap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_ggfwss-clustermap.png")));
//            map.put("zrzhczt_ggfwss-map",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_ggfwss-map.png")));
//            map.put("zrzhczt_ggfwss-pie",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_ggfwss-pie.png")));
//
//            map.put("zrzhczt_ggfwssmaptxt",new String(Files.readAllBytes(Paths.get(baseChartUrl+"zrzhczt_ggfwss-map.txt"))));
//
//
//            map.put("zrzhczt_zrzhcsaqscsgyhss-circlemap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_zrzhcsaqscsgyhss-circlemap.png")));
//            map.put("zrzhczt_zrzhcsaqscsgyhss-heatmap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_zrzhcsaqscsgyhss-heatmap.png")));
//            map.put("zrzhczt_zrzhcsaqscsgyhss-clustermap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_zrzhcsaqscsgyhss-clustermap.png")));
//            map.put("zrzhczt_zrzhcsaqscsgyhss-map",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_zrzhcsaqscsgyhss-map.png")));
//            map.put("zrzhczt_zrzhcsaqscsgyhss-pie",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_zrzhcsaqscsgyhss-pie.png")));
//
//            map.put("zrzhczt_zrzhcsaqscsgyhssmaptxt",new String(Files.readAllBytes(Paths.get(baseChartUrl+"zrzhczt_zrzhcsaqscsgyhss-map.txt"))));
//
//
//            map.put("zrzhczt_zrzhcsfmkssgwxy-circlemap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_zrzhcsfmkssgwxy-circlemap.png")));
//            map.put("zrzhczt_zrzhcsfmkssgwxy-heatmap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_zrzhcsfmkssgwxy-heatmap.png")));
//            map.put("zrzhczt_zrzhcsfmkssgwxy-clustermap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_zrzhcsfmkssgwxy-clustermap.png")));
//            map.put("zrzhczt_zrzhcsfmkssgwxy-map",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_zrzhcsfmkssgwxy-map.png")));
//            map.put("zrzhczt_zrzhcsfmkssgwxy-pie",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zrzhczt_zrzhcsfmkssgwxy-pie.png")));
//
//            map.put("zrzhczt_zrzhcsfmkssgwxymaptxt",new String(Files.readAllBytes(Paths.get(baseChartUrl+"zrzhczt_zrzhcsfmkssgwxy-map.txt"))));
//
//
//            map.put("zhjzzy_zfzhjzzy-circlemap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_zfzhjzzy-circlemap.png")));
//            map.put("zhjzzy_zfzhjzzy-heatmap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_zfzhjzzy-heatmap.png")));
//            map.put("zhjzzy_zfzhjzzy-clustermap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_zfzhjzzy-clustermap.png")));
//            map.put("zhjzzy_zfzhjzzy-map",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_zfzhjzzy-map.png")));
//            map.put("zhjzzy_zfzhjzzy-pie",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_zfzhjzzy-pie.png")));
//
//            map.put("zhjzzy_zfzhjzzymaptxt",new String(Files.readAllBytes(Paths.get(baseChartUrl+"zhjzzy_zfzhjzzy-map.txt"))));
//
//
//            map.put("zhjzzy_jczhjzzy-circlemap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_jczhjzzy-circlemap.png")));
//            map.put("zhjzzy_jczhjzzy-heatmap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_jczhjzzy-heatmap.png")));
//            map.put("zhjzzy_jczhjzzy-clustermap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_jczhjzzy-clustermap.png")));
//            map.put("zhjzzy_jczhjzzy-map",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_jczhjzzy-map.png")));
//            map.put("zhjzzy_jczhjzzy-pie",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_jczhjzzy-pie.png")));
//
//            map.put("zhjzzy_jczhjzzymaptxt",new String(Files.readAllBytes(Paths.get(baseChartUrl+"zhjzzy_jczhjzzy-map.txt"))));
//
//
//            map.put("zhjzzy_jtjzzy-clustermap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_jtjzzy-clustermap.png")));
//            map.put("zhjzzy_jtjzzy-map",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_jtjzzy-map.png")));
//            map.put("zhjzzy_jtjzzy-pie",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_jtjzzy-pie.png")));
//
//            map.put("zhjzzy_jtjzzymap",new String(Files.readAllBytes(Paths.get(baseChartUrl+"zhjzzy_jtjzzy-map.txt"))));
//
//
//
//            map.put("zhjzzy_qyyshlljzzy-circlemap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_qyyshlljzzy-circlemap.png")));
//            map.put("zhjzzy_qyyshlljzzy-heatmap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_qyyshlljzzy-heatmap.png")));
//            map.put("zhjzzy_qyyshlljzzy-clustermap",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_qyyshlljzzy-clustermap.png")));
//            map.put("zhjzzy_qyyshlljzzy-map",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_qyyshlljzzy-map.png")));
//            map.put("zhjzzy_qyyshlljzzy-pie",Base64.getEncoder().encodeToString(FileUtils.readToBytesByFilepath(baseChartUrl+"zhjzzy_qyyshlljzzy-pie.png")));
//
//            map.put("zhjzzy_qyyshlljzzymaptxt",new String(Files.readAllBytes(Paths.get(baseChartUrl+"zhjzzy_qyyshlljzzy-map.txt"))));
//
//            map.put("code_name","yangzhtestaaaaaaaaaaaaaaaaaaaaa-------------");
//
//            DocumentProducer dp = new DocumentProducer("F://");
//            String complie = dp.Complie("F://", "data_present_book.docx", true);
//            System.out.println(complie);
//            dp.produce(map, ExportFilePath);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}
