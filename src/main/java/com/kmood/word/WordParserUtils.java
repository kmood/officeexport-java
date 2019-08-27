package com.kmood.word;


import com.kmood.basic.PlaceHolder;
import com.kmood.basic.SyntaxException;
import com.kmood.utils.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class WordParserUtils {


    public static void clearPictureContent(Document document) {
        List pictureList = document.selectNodes(".//w:binData");
        if (pictureList != null) {
            for (int i = 0; i < pictureList.size(); i++) {
                Node node = (Node) pictureList.get(i);
                node.setText("   ");
            }
        }
    }
    public static String VarifySyntax(String data){
        data = StringUtil.removeInvisibleChar(data);
        String errorInfor = "";
        Character errorChar = null ;
        int errorIndex = 0;
        int length = data.length();
        if (length == 0) return null;
        char[] chars = data.toCharArray();
        ArrayList<Character> stack = new ArrayList<Character>();
        ArrayList<Character> charArr = new ArrayList<Character>();
        ArrayList<Integer> indexArr = new ArrayList<Integer>();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (PlaceHolder.PHSTR.indexOf(c) != -1){
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
                    c == PlaceHolder.POUNDC||
                    c == PlaceHolder.DC||
                    c == PlaceHolder.PC)) {
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
            if (c == '$' &&  !PlaceHolder.DIsEffective(charArr,stack,i)){
                errorChar = c;
                errorIndex = i;
                break;
            }
            if (c == '^' &&  !PlaceHolder.PIsEffective(charArr,stack,i)){
                errorChar = c;
                errorIndex = i;
                break;
            }
            //进栈
            if (c == '[' || c == '{'
                    || (c == '*' && stack.get(s-1) != '*')
                    || (c == '#' && stack.get(s-1) != '#')
                    || (c == '$' && stack.get(s-1) != '$')
                    || (c == '^' && stack.get(s-1) != '^')
                    )
                stack.add(c);
            //出栈
            if (c == ']' || c == '}'
                    || (c == '*' && stack.get(s-1) == '*')
                    || (c == '#' && stack.get(s-1) == '#')
                    || (c == '$' && stack.get(s-1) == '$')
                    || (c == '^' && stack.get(s-1) == '^')
                    )
                stack.remove(s - 1);
        }
        if(errorChar != null)errorInfor += StringUtil.substringBeforeAfterSize(data,indexArr.get(errorIndex),10) +"------'"+errorChar+"' 存在语法错误,注意将特殊字符进行转义";
        return errorInfor;
    }

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
            xmlStrNew += cont.replaceAll("@"," as ") + " >";
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
            xmlStrTemp += StringUtils.substringBefore(cont,"@") + ")?? >";
            xmlStr = StringUtil.substringAfter(xmlStrSubfix, ">");
        }
        xmlStrTemp += xmlStr;
        return xmlStrTemp;
    }


    public static String BraceTagHandle(String xmlStr) {
        if (xmlStr == null) return null;
        if (xmlStr.length() == 0) return "";
        String[] arr = StringUtil.substringsBetween(xmlStr, "{", "}");
        if (arr == null ) return xmlStr;
        for (String str:arr ) {
            String replaceStr = "{"+str+"}";
            //去除不显示字符
            str = str.replaceAll("[\\x00-\\x1F | \\x7F ]","");
            String s = "${(" + str + ")!\"\"}";
            if (!str.contains(".")){
                xmlStr = xmlStr.replace(replaceStr, s);
                continue;
            }
            String cond = "";
            int length = str.length();
            for (int one = str.indexOf('.'); one < length -1 && one != -1 ; one = str.indexOf('.',one+1)) {
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
            String[] Xarr = null;
            String[] Jarr = null;
            for (int j = 0; j < wtlist.size(); j++) {
                Node node = (Node)wtlist.get(j);
                String text1 = node.getText();
                if (text1 != null && text1.contains("[#")){
                    //清除[##
                    Jarr = StringUtil.substringsBetween(text1,"[#", "#");
                    for (String s :Jarr)
                        node.setText(text1.replace("[#"+s+ "#",""));
                }
                if (text1 != null && text1.contains("[*")){
                    //清除[**
                    Xarr = StringUtil.substringsBetween(text1, "[*", "*");
                    for (String s :Xarr)
                        node.setText(text1.replace("[*"+s+"*",""));
                }
            }
            if(Jarr != null){
                String s = "#";
                for (int g = 0; g < Jarr.length; g++) {
                    converList(wpNodeList, i, (Element) wpNode, Jarr[g], s);
                }
            }
            if (Xarr != null ){
                String s = "*";
                for (int g = 0; g < Xarr.length; g++) {
                    converList(wpNodeList, i, (Element) wpNode, Xarr[g], s);
                }
            }


        }
    }

    private static void converList(List wpNodeList, int i, Element wpNode, String value, String s) {
        Element beginEle = wpNode;
        if ("#".equals(s)) {
            while (beginEle != null && !"tr".equals(beginEle.getName())){
                beginEle = beginEle.getParent();
            }
        }
        Element endEle = null;
        String valueTrim = StringUtil.substringBefore(StringUtil.removeInvisibleChar(value), "@").trim();
        String t = s + valueTrim + s+"]";
        for (int j = i; j < wpNodeList.size(); j++) {
            Node temp = (Node)wpNodeList.get(j);
            List wtlisttemp = temp.selectNodes(".//w:t");
            for (int k = 0; k < wtlisttemp.size(); k++) {
                Node node = (Node)wtlisttemp.get(k);
                String text1 = node.getText();
                if (text1 != null && StringUtil.removeInvisibleChar(text1).contains(t)){
                    String[] vArr = StringUtil.substringsBetween(text1, s, "]");
                    for (String str : vArr){
                        String s1 = valueTrim + s;
                        if (s1.equals(StringUtil.removeInvisibleChar(str))) node.setText(text1.replace(s + str + "]", ""));
                    }
                    endEle= (Element) temp; // wp标签
                }
            }
        }
        if (endEle == null) throw new SyntaxException(beginEle.getText()+"-----'"+value+"'未匹配到结束符");
        if ("#".equals(s)) {
            while (endEle != null && !"tr".equals(endEle.getName())){
                endEle = endEle.getParent();
            }
        }
        HashMap<String, String> listAttMap = new HashMap<>();
        listAttMap.put("type","list");
        listAttMap.put("content"," "+value+ " ");
        HashMap<String, String> ifAttMap = new HashMap<>();
        ifAttMap.put("type","if");
        ifAttMap.put("content"," ("+StringUtil.substringBefore(value," " ).trim() +")??");
        String name = "#list";

        Element element = WordParserUtils.AddParentNode(beginEle, endEle, name, listAttMap);
        WordParserUtils.AddParentNode(element,"#if",ifAttMap);
    }

//    public static void handleESC(Document document) {
//        List wtNodeList = document.selectNodes(".//w:t");
//        for (int i = 0; i < wtNodeList.size(); i++) {
//            wtNodeList
//        }
//    }


    public static void PlaceHodlerHandle(Node WPNode){
        List WTList = WPNode.selectNodes(".//w:t");
        Node WTNodeNew = null;
        int s = WTList.size();
        for (int j = 0; j < s; j++) {
            WTNodeNew = (Node)WTList.get(j);
            String text = WTNodeNew.getText();
            int fi = text.lastIndexOf('[');
            int xi = text.lastIndexOf("*");
            int ji = text.lastIndexOf("#");

            if (fi > xi || fi >ji){
                WTNodeNew.setText(text.substring(0,fi));
                String temp = text.substring(fi, text.length());
                for (int i = j; i < s; i++) {
                    Node WTNodeNew_ = (Node)WTList.get(i);
                    String t = WTNodeNew_.getText();
                    temp += t;
                    int i1 = StringUtil.countMatches(temp, '*');
                    int i2 = StringUtil.countMatches(temp, '#');
                    if (i1 > 1 || i2 > 1){
                        if (temp.contains("#")) {
                            int endIndex = temp.indexOf('#', temp.indexOf('#')+1)+1;
                            t = temp.substring(endIndex,temp.length());
                            temp = StringUtil.removeInvisibleChar(temp.substring(0, endIndex));
                        }
                        if (temp.contains("*")) {
                            int endIndex = temp.indexOf('*', temp.indexOf('*')+1)+1;
                            t = temp.substring(endIndex,temp.length());
                            temp = StringUtil.removeInvisibleChar(temp.substring(0, endIndex)) ;
                        }
                        WTNodeNew.setText(WTNodeNew.getText()+temp);
                        WTNodeNew_.setText(t);
                        j = i;
                        break;
                    }else{
                        WTNodeNew_.setText("");
                    }
                }
            }
        }
        for (int j = 0; j < s; j++) {
            WTNodeNew = (Node)WTList.get(j);
            String text = WTNodeNew.getText();
            int di = text.lastIndexOf('{');
            int di_ = text.lastIndexOf('}');
            if (di > di_){
                String temp = text.substring(di, text.length());
                for (int i = j+1; i < s; i++) {
                    Node WTNodeNew_ = (Node)WTList.get(i);
                    String t = WTNodeNew_.getText();
                    temp += t;
                    if (StringUtil.countMatches(temp,'}') > 0 ){
                        WTNodeNew.setText(text.substring(0,di));
                        WTNodeNew_.setText(temp);
                        j = i;
                        break;
                    }else{
                        WTNodeNew_.setText("");
                    }
                }
            }
        }
        for (int j = s-1; j >= 0; j--) {
            WTNodeNew = (Node)WTList.get(j);
            String text = WTNodeNew.getText();
            int fi = text.indexOf(']');
            if (fi == -1) continue;
            String text_ = text.substring(0, fi + 1);
            int i1 = StringUtil.countMatches(text_, '*');
            int i2 = StringUtil.countMatches(text_, '#');
            if (text_.contains("]") && ((i1 <2 && i1 >0) || (i2 <2 && i2 >0) || (i1 == 0 && i2 == 0))){
                WTNodeNew.setText(text.substring(fi+1, text.length()));
                String temp = text.substring(0,fi+1);
                for (int i = j; i >= 0; i--) {
                    Node WTNodeNew_ = (Node)WTList.get(i);
                    String t = WTNodeNew_.getText();
                    temp = t + temp;
                    if ((StringUtil.countMatches(temp,'*') > 1 || StringUtil.countMatches(temp,'#') > 1)){
                        WTNodeNew_.setText(temp);
                        j = i;
                        break;
                    }else{
                        WTNodeNew_.setText("");
                    }
                }
            }
        }
    }

}
