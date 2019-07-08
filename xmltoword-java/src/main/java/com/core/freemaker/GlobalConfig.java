package com.core.freemaker;

import freemarker.cache.FileTemplateLoader;
import freemarker.cache.MultiTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

import java.io.File;
import java.util.ArrayList;

/**
 * @Auther: SunBC
 * @Date: 2019/7/5 15:09
 * @Description:
 */
public class GlobalConfig {
    private volatile Configuration configuration ;
    private Version FMVersion = Configuration.VERSION_2_3_28;
    private TemplateExceptionHandler FMExceptionHandler = TemplateExceptionHandler.RETHROW_HANDLER;
    private String FMEncoding = "UTF-8";
    private volatile ArrayList<String > FMModelPathArr = new ArrayList();

    public GlobalConfig(Configuration configuration) {
        this.configuration = configuration;
    }
    public GlobalConfig(Version FMVersion,String encoding,TemplateExceptionHandler ExceptionHandler ) {
        if (configuration == null ){
            synchronized (GlobalConfig.class){
                if (configuration == null ){
                    if (FMVersion != null)configuration = new Configuration(Configuration.VERSION_2_3_28);
                    if (encoding != null)configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
                    if (ExceptionHandler != null)configuration.setDefaultEncoding("UTF-8");
                }
            }
        }
    }
    public GlobalConfig() {
        if (configuration == null ){
            synchronized (GlobalConfig.class){
                if (configuration == null ){
                    configuration = new Configuration(Configuration.VERSION_2_3_28);
                    configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
                    configuration.setDefaultEncoding("UTF-8");
                }
            }
        }
    }
    public void setFMModelPath(String fmModelPath){
        if (fmModelPath.lastIndexOf(File.separator)  != fmModelPath.length()) fmModelPath.
//        if (FMModelPathArr.contains())
    }

}
