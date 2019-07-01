package com.core.word;


import com.core.utils.StringUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @Auther: SunBC
 * @Date: 2019/6/18 11:11
 * @Description:
 */
public class XmlParserUtils {

    /**
     * description:
     * @auther: SunBC
     * @date: 2019/7/1 12:50
     */
    public static String VarifySyntax(String data){
        data = StringUtil.removeInvisibleChar(data);
        String errorInfor = "";
        char errorChar = ' ' ;
        int errorIndex = 0;
        int length = data.length();
        if (length == 0) return null;
        char[] chars = data.toCharArray();
        ArrayList<Character> stack = new ArrayList<Character>();
        ArrayList<Character> charArr = new ArrayList<Character>();
        ArrayList<Integer> indexArr = new ArrayList<Integer>();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == PlaceHolder.AC ||
                    c == PlaceHolder.BRACE_LC ||
                    c == PlaceHolder.BRACE_RC||
                    c == PlaceHolder.BRACKET_LC||
                    c == PlaceHolder.BRACKET_RC||
                    c == PlaceHolder.XC||
                    c == PlaceHolder.poundC){
                charArr.add(c);
                indexArr.add(i);
            }
        }
        int dl = charArr.size() ;
        for (int i = 0; i < dl; i++) {
            Character c = charArr.get(i);
            // 第一次循环时碰到 *#@ ]} 错误跳出
            if (i == 0 && (c == PlaceHolder.AC ||
                    c == PlaceHolder.BRACE_RC||
                    c == PlaceHolder.BRACKET_RC||
                    c == PlaceHolder.XC||
                    c == PlaceHolder.poundC)) {
                errorChar = c;
                errorIndex = i;
                break;
            }
            //栈为空时，直接入栈
            int s = stack.size();
            if (s == 0){
                stack.add(c);
                continue;
            }
            //判断错误情况
            if (c == '}' && !PlaceHolder.BELIsEffective(charArr,stack,i)  ) {
                errorChar = c;
                errorIndex = i;
                break;
            }
            if (c == ']' && !PlaceHolder.BLIsEffective(charArr,stack,i)  ) {
                errorChar = c;
                errorIndex = i;
                break;
            }
            if (c == '{' && !PlaceHolder.BERIsEffective(charArr,stack,i)  ) {
                errorChar = c;
                errorIndex = i;
                break;
            }
            if (c == '[' && !PlaceHolder.BRIsEffective(charArr,stack,i)  ) {
                errorChar = c;
                errorIndex = i;
                break;
            }
            if (c == '@' && !PlaceHolder.AIsEffective(charArr,stack,i)){
                errorChar = c;
                errorIndex = i;
                break;
            }
            if (c == '*' && !PlaceHolder.XJIsEffective(charArr,stack,i ,'*')){
                errorChar = c;
                errorIndex = i;
                break;
            }
            if (c == '#' &&  !PlaceHolder.XJIsEffective(charArr,stack,i,'#')){
                errorChar = c;
                errorIndex = i;
                break;
            }
            //进栈
            if (c == '[' || c == '{' || (c == '*' && stack.get(s-1) != '*') || (c == '#' && stack.get(s-1) != '#') ) stack.add(c);
            //出栈
            if (c == ']' || c == '}' || (c == '*' && stack.get(s-1) == '*') || (c == '#' && stack.get(s-1) == '#') ) stack.remove(s - 1);
        }
        if(errorChar != ' ')errorInfor += StringUtil.substringBeforeAfterSize(data,indexArr.get(errorIndex),10) +"------'"+errorChar+"' 存在语法错误,注意将特殊字符进行转义";
        return errorInfor;
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


    /**
     * description:
     * @auther: SunBC
     * @date: 2019/7/1 13:00
     */
    public static Element AddParentNode(Element beginEle, Element endEle, String name, HashMap<String, String> attMap) {
        if (beginEle == null || endEle == null) return null;
        Element beginEleParent = beginEle.getParent();
        Element endEleParent = endEle.getParent();
        if (!beginEleParent.equals(endEleParent))  throw new RuntimeException("模板占位符格式不正确：-----"+beginEle.getText()+"-----部分的占位符起始符与结束符不同级");
        List elements = beginEleParent.elements();
        ArrayList<Element> elementPrefixArr = new ArrayList<>();
        ArrayList<Element> elementArr = new ArrayList<>();
        ArrayList<Element> elementSubfixArr = new ArrayList<>();
        int beginIndex = elements.indexOf(beginEle);
        int endIndex = elements.indexOf(endEle);
        for (int j = 0; j < elements.size(); j++) {
            Element e = (Element)elements.get(j);
            if (j<beginIndex)elementPrefixArr.add(e);
            else if (j > endIndex) elementSubfixArr.add(e);
            else elementArr.add(e);
            beginEleParent.remove(e);
        }
        for (int j = 0; j < elementPrefixArr.size(); j++) {
            beginEleParent.add(elementPrefixArr.get(j));
        }

        Element element = beginEleParent.addElement(name);
        Set<String> keyset = attMap.keySet();
        for (String key:keyset){
            element.addAttribute(key,attMap.get(key));
        }
        for (int j = 0; j < elementArr.size(); j++) {
            element.add(elementArr.get(j));
        }
        for (int j = 0; j < elementSubfixArr.size(); j++) {
            beginEleParent.add(elementSubfixArr.get(j));
        }
        return element;
    }
    /**
     * description:
     * @auther: SunBC
     * @date: 2019/7/1 13:04
     */
    public static Element AddParentNode(Element ele, String parentName, HashMap<String ,String > Attr){
        if (ele == null) return null;
        Element parent = ele.getParent();
        List elements = parent.elements();
        int eleIndex = elements.indexOf(ele);
        ArrayList<Element> elementsPrefix = new ArrayList<>();
        ArrayList<Element> elementsSubfix = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            Element e = (Element) elements.get(i);
            if (i <eleIndex)
                elementsPrefix.add(e);
            if (eleIndex <i)
                elementsSubfix.add(e);
            parent.remove(e);
        }

        for (int i = 0; i <elementsPrefix.size() ; i++) {
            Element element = elementsPrefix.get(i);
            parent.add(element);
        }
        Element parentNameEle = parent.addElement(parentName);
        Set<String> keyset = Attr.keySet();
        for (String key:keyset){
            parentNameEle.addAttribute(key,Attr.get(key));
        }
        parentNameEle.add(ele);
        for (int i = 0; i <elementsSubfix.size() ; i++) {
            Element element = elementsSubfix.get(i);
            parent.add(element);
        }
        return parentNameEle;
    }

    public static String ListTagHandle(String xmlStrTemp) {
        String xmlStrNew = "";
        if (xmlStrTemp == null ) return null;
        if (xmlStrTemp.length() == 0) return "";
        while(xmlStrTemp.contains("<#list")){
            xmlStrNew += StringUtil.substringBefore(xmlStrTemp, "<#list");
            xmlStrNew += "<#list ";
            String xmlStrSubfix = StringUtil.substringAfter(xmlStrTemp, "<#list");
            String tagContent = StringUtil.substringBefore(xmlStrSubfix, ">");
            String cont = StringUtil.substringBetween(tagContent, "content=\"", "\"");
            xmlStrNew += cont + " >";
            xmlStrTemp = StringUtil.substringAfter(xmlStrSubfix, ">");
        }
        xmlStrNew += xmlStrTemp;
        return xmlStrNew;
    }

    public static String IfTagHandle(String xmlStr) {
        String xmlStrTemp = "";
        if (xmlStr == null  ) return null;
        if (xmlStr.length() == 0) return "";
        while(xmlStr.contains("<#if")){
            xmlStrTemp += StringUtil.substringBefore(xmlStr, "<#if");
            xmlStrTemp += "<#if ";
            String xmlStrSubfix = StringUtil.substringAfter(xmlStr, "<#if");
            String tagContent = StringUtil.substringBefore(xmlStrSubfix, ">");
            String cont = StringUtil.substringBetween(tagContent, "content=\"", "\"");
            xmlStrTemp += cont + " >";
            xmlStr = StringUtil.substringAfter(xmlStrSubfix, ">");
        }
        xmlStrTemp += xmlStr;
        return xmlStrTemp;
    }


    public static String BraceTagHandle(String xmlStr) {
        if (xmlStr == null) return null;
        if (xmlStr.length() == 0) return "";
        String[] arr = StringUtil.substringsBetween(xmlStr, "{{", "}}");
        if (arr == null ) return xmlStr;
        for (String str:arr ) {
            String replaceStr = "{{"+str+"}}";
            //去除不显示字符
            str = str.replaceAll("[\\x00-\\x1F | \\x7F ]","");
            String s = "${(" + str + ")!\"\"}";
            if (!str.contains(".")){
                xmlStr = xmlStr.replace(replaceStr, s);
                continue;
            }
            String cond = "";
            int length = str.length();
            for (int one = str.indexOf('.'); one < length -2 && one != -1 ; one = str.indexOf('.',one+1)) {
                cond += " (";
                cond += str.substring(0, one);
                cond +=")?? &&";
            }
            cond = cond.substring(0,cond.length()-3);

            xmlStr = xmlStr.replace(replaceStr, "<#if " + cond + " >" + s +"</#if>");
        }
        return xmlStr;
    }

    public static void BracketToListConversion(Document document) {
        List wpNodeList = document.selectNodes("//w:p");
        for (int i = 0; i < wpNodeList.size(); i++) {
            Node wpNode = (Node)wpNodeList.get(i);
            List wtlist = wpNode.selectNodes(".//w:t");
            String text = null;
            for (int j = 0; j < wtlist.size(); j++) {
                Node node = (Node)wtlist.get(j);
                String text1 = node.getText();
                if (text1 != null && text1.contains("[#")){
                    text = text1;
                    //清除[##
                    node.setText(text1.replace("[#"+StringUtil.substringBetween(text1,"[#","#")+"#",""));
                }
            }
            Element wpEle = (Element)wpNode;
            Element beginEle = null;
            Element endEle = null;
            String value = null;
            if (text != null && text.contains("[#")){
                beginEle = wpEle;
                value = StringUtil.substringBetween(text, "[#", "#");
                String valueTrim = StringUtil.substringBefore(value, " as").trim();
                String s1 = "#" + valueTrim + "#]";
                for (int j = i; j < wpNodeList.size(); j++) {
                    Node temp = (Node)wpNodeList.get(j);
                    List wtlisttemp = temp.selectNodes(".//w:t");
                    for (int k = 0; k < wtlisttemp.size(); k++) {
                        Node node = (Node)wtlisttemp.get(k);
                        String text1 = node.getText();
                        if (text1 != null && text1.contains(s1)){
                            //清除##]
                            String text1New = node.getText().replace("#" + valueTrim + "#]", "");
                            node.setText(text1New);
                            endEle= (Element) temp; // wp标签
                        }
                    }
                }
            }
            if (beginEle != null){
                String errInfo = value != null ?"未匹配到[#"+value+"#结束符":"";
                if (endEle == null) throw new RuntimeException("模板占位符格式不正确：-----"+beginEle.getText()+"-----"+errInfo);
                HashMap<String, String> listAttMap = new HashMap<>();
                listAttMap.put("type","list");
                listAttMap.put("content"," "+value+ " ");
                HashMap<String, String> ifAttMap = new HashMap<>();
                ifAttMap.put("type","if");
                ifAttMap.put("content"," ("+StringUtil.substringBefore(value," " ).trim() +")??");
                String name = "#list";

                Element element = XmlParserUtils.AddParentNode(beginEle, endEle, name, listAttMap);
                XmlParserUtils.AddParentNode(element,"#if",ifAttMap);
            }
        }
    }


    public static void DoubleBracketToListConversion(Document document) {
        List tblList = document.selectNodes("//w:tbl");
        for (int i = 0; i < tblList.size(); i++) {
            Node tblNode = (Node)tblList.get(i);
            List wtlist = tblNode.selectNodes(".//w:t");
            for (int j = 0; j < wtlist.size(); j++) {
                Node wtlNode = (Node)wtlist.get(j);
                String text = wtlNode.getText();
                //
                wtlNode.setText(text.replaceAll("\\[\\[#[\\s\\S]*#",""));
                if (text != null && text.contains("[[#")) {
                    String value = StringUtil.substringBetween(text, "[#", "#");
                    boolean f = true;
                    for (Element parent = wtlNode.getParent(); parent != null&& f; parent = parent.getParent()){
                        String name = parent.getName();
                        if ("tr".equals(name)){
                            f = true;
                            HashMap<String, String> listAttMap = new HashMap<>();
                            listAttMap.put("type","list");
                            listAttMap.put("content"," "+value+ " ");
                            XmlParserUtils.AddParentNode(parent,"#list",listAttMap);
                            Element listNode = parent.getParent();
                            HashMap<String, String> ifAttMap = new HashMap<>();
                            ifAttMap.put("type","if");
                            String trim = StringUtil.substringBefore(value, " as").trim();
                            ifAttMap.put("content"," ("+ trim +")??");

                            XmlParserUtils.AddParentNode(listNode,"#if",ifAttMap);
                            //清除##]]
                            List list = listNode.selectNodes(".//w:t");
                            for (int k = 0; k < list.size(); k++) {
                                Element e = (Element)list.get(k);
                                String text1 = e.getText();
                                if (text1!= null && text1.contains("]]") && text1.contains(trim)){
                                    String s = StringUtil.substringBeforeLast(StringUtil.substringBeforeLast(text1, "#"), "#");
                                    e.setText(text1.replaceAll("#"+trim+"#]",""));
                                }
                            }
                        }
                    }
                }
            }


        }
    }

}
