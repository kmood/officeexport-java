package com.core.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Auther: SunBC
 * @Date: 2018/11/26 11:25
 * @Description:
 */
public class ServiceTool {
    private static final Gson jsonBinder = JsonBinder.buildNormalBinderAndHandlerMap("yyyy-MM-dd");
    public static String condPackage(String tableAlias,String conds) {
        ArrayList<LinkedHashMap<String,Object>> condMap = jsonBinder.fromJson(conds, new TypeToken<ArrayList<LinkedHashMap<String,Object>>>(){}.getType());
        String tableName_view = "";
        StringBuilder cond = new StringBuilder();
        String orderCond = "";
        if(condMap!=null){
            for (Map<String, Object> map : condMap) {
                //添加表的别名
                String fieldname = StringUtils.isNotBlank(tableAlias)?tableAlias+"."+(String)map.get("fieldname"):(String)map.get("fieldname");
                String relation = (String)map.get("relation");
                String fieldvalue = String.valueOf(map.get("fieldvalue"));
                if(StringUtils.isNotBlank(fieldname) && StringUtils.isNotBlank(relation) ){
                    String relation_real = RelationSign.valueOf(relation).getName();
                    if("OBA".equals(relation) ){
                        if("".equals(orderCond)) orderCond += " order by ";
                        orderCond += fieldname + " , ";
                        continue;
                    }
                    if("OBD".equals(relation) ){
                        if("".equals(orderCond)) orderCond += " order by ";
                        orderCond += fieldname + " desc , ";
                        continue;
                    }
                    //like 调整字段值
                    if("FQ".equals(relation)){
                        fieldvalue = "%"+fieldvalue+"%";
                    }
                    if("EQ_D".equals(relation)){
                        fieldname = "date_format("+fieldname+", '%Y-%m-%d') ";
                    }
                    if("FQL".equals(relation)){
                        fieldvalue = ""+fieldvalue+"%";
                    }
                    if("INULL".equals(relation) || "INNULL".equals(relation))
                        cond.append(" and ").append(fieldname).append(relation_real).append(" ");
                    if("IN".equals(relation) || "IN".equals(relation)) {
                        if (StringUtils.isBlank(fieldvalue)) continue;
                        fieldvalue = fieldvalue.trim().replaceAll(" ", "").replaceAll(",", "','");
                        cond.append(" and ").append(fieldname).append(relation_real).append(" ('").append(fieldvalue).append("') ");
                    }
                    else
                        cond.append(" and ").append(fieldname).append(relation_real).append("'").append(fieldvalue).append("' ");
                }
            }
        }
        orderCond = StringUtils.substringBeforeLast(orderCond, ",");
        String fieldStr = " * ";
        return cond.toString() + orderCond;
    }
    public enum RelationSign {
        EQ(" = "),EQN(" != "),EQ_D(" = "),GT(" > "),LT(" < "),GTE(" >= "),LTE(" <= ")
        ,FQ(" like "),FQL(" like "),INULL(" is null "),INNULL(" is not null ")
        ,IN(" in "),INN(" not in "),OBA(" order by "),OBD(" order by ");

        private final String name;

        private RelationSign(String name)
        {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }
}
