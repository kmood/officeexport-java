package com.core.word;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

/**
 * @Auther: SunBC
 * @Date: 2019/6/18 11:17
 * @Description:
 */
public class PlaceHolder {
    public  static  final String[] PHARR = new String[]{"{","}","[","]","#","*","$","@"};
    public  static  final String PHSTR = "[]{}*#$@";
    //需要转义的字符
    //左大括号
    public static final  String BRACE_L = "\\{";
    //右大括号
    public static final  String BRACE_R = "}";
    //左方括号
    public static final  String BRACKET_L = "\\[";
    //右方括号
    public static final  String BRACKET_R = "]";
    //#号
    public static final  String POUND = "#";
    //*号
    public static final  String X = "\\*";
    //@号
    public static final  String A = "@";
    //$号
    public static final  String D = "$";

    //需要转义的字符
    //左大括号
    public static final  Character BRACE_LC = '{';
    //右括号
    public static final  Character BRACE_RC = '}';
    //左方括号
    public static final  Character BRACKET_LC = '[';
    //右方括号
    public static final  Character BRACKET_RC = ']';
    //#号
    public static final  Character POUNDC = '#';
    //*号
    public static final  Character XC = '*';
    //@号
    public static final  Character AC = '@';
    //$号
    public static final  Character DC = '$';

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
    public static final  String POUND_ = "`~5~`";
    //*号
    public static final  String X_ = "`~6~`";
    //@号
    public static final  String A_ = "`~7~`";
    //$号
    public static final  String D_ = "`~8~`";

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
    public static final  String MERGE_UNIT = "$";

    public static String ToESC(String xmlStr){
        if (StringUtils.isBlank(xmlStr)) return xmlStr;
        xmlStr = xmlStr.replaceAll(BRACE_L, BRACE_L_);
        xmlStr = xmlStr.replaceAll(BRACE_R, BRACE_R_);
        xmlStr = xmlStr.replaceAll(BRACKET_L, BRACKET_L_);
        xmlStr = xmlStr.replaceAll(BRACKET_R, BRACKET_R_);
        xmlStr = xmlStr.replaceAll(POUND, POUND_);
        xmlStr = xmlStr.replaceAll(X, X_);
        xmlStr = xmlStr.replaceAll(A, A_);
        xmlStr = xmlStr.replaceAll(D, D_);
        return xmlStr;
    }
    public static String FromESC(String xmlStr){
        if (StringUtils.isBlank(xmlStr)) return xmlStr;
        xmlStr = xmlStr.replaceAll(BRACE_L_, BRACE_L);
        xmlStr = xmlStr.replaceAll(BRACE_R_, BRACE_R);
        xmlStr = xmlStr.replaceAll(BRACKET_L_, BRACKET_L);
        xmlStr = xmlStr.replaceAll(BRACKET_R_, BRACKET_R);
        xmlStr = xmlStr.replaceAll(POUND_, POUND);
        xmlStr = xmlStr.replaceAll(X_,X);
        xmlStr = xmlStr.replaceAll(A_,A);
        xmlStr = xmlStr.replaceAll(D_, D);
        return xmlStr;
    }
    public static   boolean DIsEffective(ArrayList<Character> charArr , ArrayList<Character> stack, int i){
        int dl = charArr.size();
        int l = stack.size();
        if (l == 0 || dl == i+1 ) return false ;
        if (stack.get(l-1) == '{' && charArr.get(i +1) == '$'&& dl> i+2 && charArr.get(i +2) == '}') return true;
        if (l >= 2 && stack.get(l-1) == '$'&& stack.get(l-2) == '{' &&  charArr.get(i +1) == '}') return true;
        return  false;
    }
    /**
     * 判断{ 的有效性
     * @param charArr
     * @param stack
     * @param i
     * @return
     */
    public static   boolean BERIsEffective(ArrayList<Character> charArr , ArrayList<Character> stack, int i){
        int dl = charArr.size();
        int l = stack.size();
        if (dl == i+1 ) return false ;
        if (charArr.get(i +1) == '}' || charArr.get(i +1) == '$') return true;
        return  false;
    }

    /**
     * 判断}的有效性
     * @param charArr
     * @param stack
     * @param i
     * @return
     */
    public static   boolean BELIsEffective(ArrayList<Character> charArr ,ArrayList<Character> stack,int i){
        int dl = charArr.size();
        int l = stack.size();
        if(l == 0) return false;
        if (stack.get(l-1) == '{') return true;
        return  false;
    }
    /**
     * 判断[ 的有效性
     * @param charArr
     * @param stack
     * @param i
     * @return
     */
    public static   boolean BRIsEffective(ArrayList<Character> charArr ,ArrayList<Character> stack,int i){
        int dl = charArr.size();
        int l = stack.size();
        if (dl < i+4 ) return false ;
        if (charArr.get(i +1) == '*' && charArr.get(i +2) == '@' && charArr.get(i +3) == '*' ) return true;
        return  false;
    }

    /**
     * 判断】的有效性
     * @param charArr
     * @param stack
     * @param i
     * @return
     */
    public static   boolean BLIsEffective(ArrayList<Character> charArr ,ArrayList<Character> stack,int i){
        int dl = charArr.size();
        int l = stack.size();
        if(l == 0) return false;
        if ((charArr.get(i-1) == '*' && charArr.get(i -2) == '*')
                || (charArr.get(i-1) == '#' && charArr.get(i -2) == '#')
                && stack.get(l-1) == '[')
            return true;
        return  false;
    }

    /**
     * 判断@的有效性
     * @param charArr
     * @param stack
     * @param i
     * @return
     */
    public static   boolean AIsEffective(ArrayList<Character> charArr ,ArrayList<Character> stack,int i){
        int dl = charArr.size();
        int l = stack.size();
        if (l < 2 || dl == i+1 ) return false ;
        if (stack.get(l-1) == '*' && stack.get(l-2) == '[' && charArr.get(i +1) == '*' ) return true;
        if (stack.get(l-1) == '#' && stack.get(l-2) == '[' && charArr.get(i +1) == '#' ) return true;
        return  false;

    }
    /**
     * 判断 * # 的有效性
     * @param charArr
     * @param stack
     * @param i
     * @param c
     * @return
     */
    public static   boolean XJIsEffective(ArrayList<Character> charArr ,ArrayList<Character> stack,int i,char c){
        int dl = charArr.size();
        int l = stack.size();
        if (l == 0 || dl == i+1 || i == 0 ) return false ;
        //[*@*{}{}**]
        if (stack.get(l-1) == '[' && charArr.get(i-1) == '[' && charArr.get(i +1 ) == '@') return true;
        if (stack.get(l-1) == c && charArr.get(i-1) == '@' ) return true;
        if (stack.get(l-1) == '[' && charArr.get(i +1 ) == c && dl>i+2 && charArr.get(i+2 ) == ']') return true;
        if (stack.get(l-1) == c && l>1 && stack.get(l-2) == '[' && charArr.get(i-1) == c && charArr.get(i +1 ) == ']') return true;
        return  false;

    }


    /**
     * description: 验证是否存在占位符
     * @auther: SunBC
     * @date: 2019/6/18 19:13
     */
    public static boolean ContainPlaceHolder(String data){
        for (String ph :PlaceHolder.PHARR) {
            if (data.contains(ph)) return true;
        }
        return false;
    }






}
