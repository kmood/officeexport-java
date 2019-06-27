package com.core.word;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.TooManyListenersException;

/**
 * @Auther: SunBC
 * @Date: 2019/6/18 11:17
 * @Description:
 */
public class PlaceHolder {
    public  static  final String[] PHARR = new String[]{"{","}","[","]","#","*"};
    //需要转义的字符
    //左大括号
    public static final  String BRACE_L = "\\{";
    //右大括号
    public static final  String BRACE_R = "\\}";
    //左方括号
    public static final  String BRACKET_L = "\\[";
    //右方括号
    public static final  String BRACKET_R = "\\]";
    //#号
    public static final  String pound = "\\#";

    //转义后
    //左大括号
    public static final  String BRACE_L_ = "`~1~`";
    //右大括号
    public static final  String BRACE_R_ = "`~2~`";
    //左方括号
    public static final  String BRACKET_L_ = "`~3~`";
    //右方括号
    public static final  String BRACKET_R_ = "`~4~`";
    //#号
    public static final  String pound_ = "`~5~`";
    //*号
    public static final  String X_ = "`~6~`";
    //@号
    public static final  String A_ = "`~7~`";

    //占位符匹配
    //标识表格行数组
    public static final  String ARRLIST_TABLE_L = "[#";
    public static final  String ARRLIST_TABLE_R = "#]";
    //标识文本的数组
    public static final  String ARRLIST_TEXT_R = "[*";
    public static final  String ARRLIST_TEXT_L = "*]";
    //标识对象
    public static final  String OBJECT_R = "}";
    public static final  String OBJECT_L = "{";
    //标识数组对象名
    public static final  String AS = "@";
    public static final  String ARRLIST_TEXT_NAME = "*";
    public static final  String ARRLIST_TABLE_NAME = "#";

    public static String ToESC(String xmlStr){
        if (StringUtils.isBlank(xmlStr)) return xmlStr;
        xmlStr = xmlStr.replaceAll(BRACE_L, BRACE_L_);
        xmlStr = xmlStr.replaceAll(BRACE_R, BRACE_R_);
        xmlStr = xmlStr.replaceAll(BRACKET_L, BRACKET_L_);
        xmlStr = xmlStr.replaceAll(BRACKET_R, BRACKET_R_);
        xmlStr = xmlStr.replaceAll(pound, pound_);
        return xmlStr;
    }
    public static String FromESC(String xmlStr){
        if (StringUtils.isBlank(xmlStr)) return xmlStr;
        xmlStr = xmlStr.replaceAll(BRACE_L_, BRACE_L);
        xmlStr = xmlStr.replaceAll(BRACE_R_, BRACE_R);
        xmlStr = xmlStr.replaceAll(BRACKET_L_, BRACKET_L);
        xmlStr = xmlStr.replaceAll(BRACKET_R_, BRACKET_R);
        xmlStr = xmlStr.replaceAll(pound_, pound);
        return xmlStr;
    }





}
