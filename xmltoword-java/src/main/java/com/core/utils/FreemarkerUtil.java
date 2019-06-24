package com.core.utils;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;

/**
 * 约定模板路径在classes/model下
 * @Auther: SunBC
 * @Date: 2019/4/16 10:10
 * @Description:
 */
public class FreemarkerUtil {
    public  static Configuration configuration;
    public  static final String MODELRELATIONPATH = "/model";
    static {
        try {
            URL url = FreemarkerUtil.class.getClassLoader().getResource(MODELRELATIONPATH);
            if (url == null) throw new RuntimeException("模板路径不存在");
            String uri = url.toURI().getPath();
            String path = uri.replace("/", File.separator);
            configuration = new Configuration(Configuration.VERSION_2_3_28);
            configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            configuration.setDefaultEncoding("UTF-8");
            configuration.setDirectoryForTemplateLoading(new File(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * description:导出
     * modelName 模板文件名
     * exportName 导出后的文件名字
     * exportPath 导出的路径（绝对路径）
     * dataModel 导出的数据模型，可为javabean、map
     * @auther: SunBC
     * @date: 2019/4/16 13:34
     */
    public static void ExportFile(String modelName,String exportName,String exportPath,Object dataModel)throws Exception{
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(exportPath+File.separator+exportName), "utf-8");
        Template template = FreemarkerUtil.configuration.getTemplate(modelName);
        template.process(dataModel,outputStreamWriter);
    }


}
