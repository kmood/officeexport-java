package com.kmood.utils;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;

//约定模板路径在classes/model下

public class FreemarkerUtil {
    public  static Configuration configuration;
    public  static final String MODELRELATIONPATH = FreemarkerUtil.class.getClassLoader().getResource("./model/").getPath();

    static {
        try {
            configuration = new Configuration(Configuration.VERSION_2_3_28);
            configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            configuration.setDefaultEncoding("UTF-8");
            configuration.setDirectoryForTemplateLoading(new File(MODELRELATIONPATH));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void ExportFile(String modelName,String exportName,String exportPath,Object dataModel)throws Exception{
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(exportPath+File.separator+exportName), "utf-8");
        Template template = FreemarkerUtil.configuration.getTemplate(modelName);
        template.process(dataModel,outputStreamWriter);
    }


}
