package com.core.freemaker;

import java.util.HashMap;

/**
 * @Auther: SunBC
 * @Date: 2019/7/5 17:05
 * @Description:
 */
public class Config {
    private ThreadLocal<HashMap<String,DataHandler>> local = new ThreadLocal<>();
    public final  String  CNFIG_DATE_FORMAT = "date_format";
    public final  String  CNFIG_BOOLEAN_FORMAT = "boolean_format";
    public final  String  CNFIG_NUMBER_FORMAT = "number_format";

}




