package com.kmood.datahandle;

import com.kmood.utils.StringUtil;
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
public class FMConfiguration {
    private static volatile Configuration configuration ;
    private static Version FMVersion = Configuration.VERSION_2_3_28;
    private static TemplateExceptionHandler FMExceptionHandler = TemplateExceptionHandler.RETHROW_HANDLER;
    private static String FMEncoding = "UTF-8";
    private static volatile ArrayList<String > FMModelPathArr = new ArrayList();

    public static void Init(Configuration config) {
        if (config != null ){
            configuration = config;
        }
    }
    public static void Init(Version FMVersion, String encoding, TemplateExceptionHandler ExceptionHandler ) {
        if (configuration == null ){
            synchronized (FMConfiguration.class){
                if (configuration == null ){
                    if (FMVersion != null)configuration = new Configuration(Configuration.VERSION_2_3_28);
                    if (encoding != null)configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
                    if (ExceptionHandler != null)configuration.setDefaultEncoding("UTF-8");
                }
            }
        }
    }
    public static void Init() {
        if (configuration == null ){
            synchronized (FMConfiguration.class){
                if (configuration == null ){
                    configuration = new Configuration(Configuration.VERSION_2_3_28);
                    configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
                    configuration.setDefaultEncoding("UTF-8");
                }
            }
        }
    }
    public static Configuration addFMModelPath(String fmModelPath) throws Exception{
        if (StringUtil.isBlank(fmModelPath)) return configuration;
        int length = fmModelPath.length();
        fmModelPath = fmModelPath.replace("\\",File.separator);
        fmModelPath = fmModelPath.replace("/",File.separator);
        if (FMModelPathArr.contains(fmModelPath)) return configuration;
        TemplateLoader tl = configuration.getTemplateLoader();
        if (tl == null || tl instanceof  MultiTemplateLoader) {
            FMModelPathArr.add(fmModelPath);
            TemplateLoader[] loaders = new TemplateLoader[FMModelPathArr.size()];
            for (int i = 0; i < FMModelPathArr.size(); i++) {
                loaders[i] = new FileTemplateLoader(new File(FMModelPathArr.get(i)));
            }
            MultiTemplateLoader mtl = new MultiTemplateLoader(loaders);
            configuration.setTemplateLoader(mtl);
        }else{
            throw new RuntimeException("freemaker 配置对应的模板加载器类型不一致，若使用自定义配置，请调整模板位置！无需调用方法！");
        }
        return configuration;
    }
    public static Configuration getConfiguration() {
        return configuration;
    }
}
