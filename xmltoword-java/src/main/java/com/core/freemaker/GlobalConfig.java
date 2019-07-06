package com.core.freemaker;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

/**
 * @Auther: SunBC
 * @Date: 2019/7/5 15:09
 * @Description:
 */
public class GlobalConfig {
    private Configuration configuration ;
    private Version FMVersion = Configuration.VERSION_2_3_28;
    private TemplateExceptionHandler FMExceptionHandler = TemplateExceptionHandler.RETHROW_HANDLER;
    private String FMEncoding = "UTF-8";
    private String FMModelPath ;

    public GlobalConfig(Configuration configuration) {
        this.configuration = configuration;
    }
    public GlobalConfig(String FMModelPath) {
    }
}
