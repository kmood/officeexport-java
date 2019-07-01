package com.core.word;


import com.core.utils.FileUtils;
import com.core.utils.StringUtil;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;

/**
 * @Auther: SunBC
 * @Date: 2019/6/18 11:09
 * @Description:
 */
public class WordXmlModelHandlerImpl implements XmlModelHandler{
    @Override
    public   void VerifyModel(String xmlPath) throws Exception {
        String  errorInfo = "";
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File(xmlPath));
        Element rootElement = document.getRootElement();
        //校验表格
        List tableRowList = document.selectNodes("//w:tbl/w:tr");
        for (int i = 0; i < tableRowList.size(); i++) {
            String tableRowStr = "";
            Node node = (Node)tableRowList.get(i);
            //验证[] # 是否有效
            List TextNodeList = node.selectNodes(".//w:t");
            for (int j = 0; j < TextNodeList.size(); j++) {
                Node TextNode = (Node)TextNodeList.get(j);
                String text = TextNode.getText();
                tableRowStr += StringUtil.removeInvisibleChar(text);
            }
            errorInfo =  XmlParserUtils.VarifyAll(tableRowStr);
            if (errorInfo.length() != 0) break;
        }

        //校验段落
        List ParagList = document.selectNodes(".//wx:sect/w:p");
        StringBuilder wpStr = new StringBuilder();
        for (int i = 0; i < ParagList.size(); i++) {
            Node node = (Node)ParagList.get(i);
            List TextNodeList = node.selectNodes(".//w:t");
            for (int j = 0; j < TextNodeList.size(); j++) {
                Node TextNode = (Node)TextNodeList.get(j);
                String text = TextNode.getText();
                wpStr.append(StringUtil.removeInvisibleChar(text));
            }
        }
        errorInfo= XmlParserUtils.VarifyAll(wpStr.toString());
        if (errorInfo.length() != 0) throw new SyntaxException(errorInfo);
        return ;
    }

    @Override
    public String ConverToFreemaker(String xmlPath) throws  Exception{
        XMLWriter writer = null;
        try {
            SAXReader reader = new SAXReader();
//            xmlPath = "C:\\Users\\admin\\Desktop\\ngccoa export\\附件9-低值易耗品购置申请表.xml";
            Document document = reader.read(new File(xmlPath));
            List list = document.selectNodes("//w:p");
            for (int i = 0; i <list.size() ; i++) {
                Node WPNode = (Node)list.get(i);
                List WTList = WPNode.selectNodes(".//w:t");
                String textTotal = "";
                Node WTNodeNew = null;
                for (int j = 0; j < WTList.size(); j++) {
                    WTNodeNew = (Node)WTList.get(j);
                    String text = WTNodeNew.getText();
                    textTotal  += text;
                    //可避免无占位符的段落
                    if(XmlParserUtils.ContainPlaceHolder(textTotal))WTNodeNew.setText("");
                    else textTotal = "";
                }
                if (!"".equals(textTotal)) WTNodeNew.setText(textTotal);
            }
            //转换[[ 到list标签
            DoubleBracketToListConversion(document);
            //转换[ 到list标签
            BracketToListConversion(document);
            String xmlFtlPath = xmlPath.replace(".xml", ".ftl");
            FileWriter fileWiter = new FileWriter(xmlFtlPath);
            writer = new XMLWriter(fileWiter);
            writer.write( document );
            return xmlFtlPath;
        }catch (Exception e){
            throw e;
        }finally {
            if (writer != null )
                writer.close();
        }
    }

    @Override
    public void XmlPlaceHolderHandler(String xmlFtlPath) throws Exception{
        XMLWriter writer = null;
        FileOutputStream out = null;
        try {
            SAXReader reader = new SAXReader();
//            xmlFtlPath = "C:\\Users\\admin\\Desktop\\ngccoa export\\附件9-低值易耗品购置申请表.xml";
            String xmModelStr = FileUtils.readToStringByFilepath(xmlFtlPath);
            xmModelStr = IfTagHandle(xmModelStr);
            xmModelStr = ListTagHandle(xmModelStr);
            xmModelStr = BraceTagHandle(xmModelStr);
            out = new FileOutputStream(xmlFtlPath);
            out.write(xmModelStr.getBytes());
            out.flush();
        }catch (Exception e){
            throw e;
        }finally {
            if(out != null){
                out.close();
            }
        }
    }


    private String ListTagHandle(String xmlStrTemp) {
        String xmlStrNew = "";
        if (xmlStrTemp == null ) return null;
        if (xmlStrTemp.length() == 0) return "";
        while(xmlStrTemp.contains("<#list")){
            xmlStrNew += XmlParserUtils.substringBefore(xmlStrTemp, "<#list");
            xmlStrNew += "<#list ";
            String xmlStrSubfix = XmlParserUtils.substringAfter(xmlStrTemp, "<#list");
            String tagContent = XmlParserUtils.substringBefore(xmlStrSubfix, ">");
            String cont = XmlParserUtils.substringBetween(tagContent, "content=\"", "\"");
            xmlStrNew += cont + " >";
            xmlStrTemp = XmlParserUtils.substringAfter(xmlStrSubfix, ">");
        }
        xmlStrNew += xmlStrTemp;
        return xmlStrNew;
    }

    @Test
    public  void testIfListHandle(){

        String s = ListTagHandle("ttt<#list type=\"list\" content=\" tests as test    \">tttt");
        String s1 = ListTagHandle("");
        String s2 = ListTagHandle(null);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }

    private String IfTagHandle(String xmlStr) {
        String xmlStrTemp = "";
        if (xmlStr == null  ) return null;
        if (xmlStr.length() == 0) return "";
        while(xmlStr.contains("<#if")){
            xmlStrTemp += XmlParserUtils.substringBefore(xmlStr, "<#if");
            xmlStrTemp += "<#if ";
            String xmlStrSubfix = XmlParserUtils.substringAfter(xmlStr, "<#if");
            String tagContent = XmlParserUtils.substringBefore(xmlStrSubfix, ">");
            String cont = XmlParserUtils.substringBetween(tagContent, "content=\"", "\"");
            xmlStrTemp += cont + " >";
            xmlStr = XmlParserUtils.substringAfter(xmlStrSubfix, ">");
        }
        xmlStrTemp += xmlStr;
        return xmlStrTemp;
    }

    @Test
    public  void testIfTagHandle(){

        String s = IfTagHandle("ttt<#if type=\"if\" content=\" (test1)??\">tttt");
        String s1 = IfTagHandle("");
        String s2 = IfTagHandle(null);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }


    private String BraceTagHandle(String xmlStr) {
        if (xmlStr == null) return null;
        if (xmlStr.length() == 0) return "";
        String[] arr = XmlParserUtils.substringsBetween(xmlStr, "{{", "}}");
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
    @Test
    public  void testBraceTagHandle(){

        String s = BraceTagHandle("<w:t>{{*.**20}}</w:t>");
        String s1 = BraceTagHandle("");
        String s2 = BraceTagHandle(null);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
    private void BracketToListConversion(Document document) {
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
                    node.setText(text1.replace("[#"+XmlParserUtils.substringBetween(text1,"[#","#")+"#",""));
                }
            }
            Element wpEle = (Element)wpNode;
            Element beginEle = null;
            Element endEle = null;
            String value = null;
            if (text != null && text.contains("[#")){
                beginEle = wpEle;
                value = XmlParserUtils.substringBetween(text, "[#", "#");
                String valueTrim = XmlParserUtils.substringBefore(value, " as").trim();
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
                ifAttMap.put("content"," ("+XmlParserUtils.substringBefore(value," " ).trim() +")??");
                String name = "#list";

                Element element = XmlParserUtils.AddParentNode(beginEle, endEle, name, listAttMap);
                XmlParserUtils.AddParentNode(element,"#if",ifAttMap);
            }
        }
    }


    private void DoubleBracketToListConversion(Document document) {
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
                    String value = XmlParserUtils.substringBetween(text, "[#", "#");
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
                            String trim = XmlParserUtils.substringBefore(value, " as").trim();
                            ifAttMap.put("content"," ("+ trim +")??");

                            XmlParserUtils.AddParentNode(listNode,"#if",ifAttMap);
                            //清除##]]
                            List list = listNode.selectNodes(".//w:t");
                            for (int k = 0; k < list.size(); k++) {
                                Element e = (Element)list.get(k);
                                String text1 = e.getText();
                                if (text1!= null && text1.contains("]]") && text1.contains(trim)){
                                    String s = XmlParserUtils.substringBeforeLast(XmlParserUtils.substringBeforeLast(text1, "#"), "#");
                                    e.setText(text1.replaceAll("#"+trim+"#]",""));
                                }
                            }
                        }
                    }
                }
            }


        }
    }
    @Test
    public void testVerifyModel(){
        try {
            VerifyModel("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void ConverToFreemakerTest(){
        try {
            ConverToFreemaker("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void XmlPlaceHolderHandlerTest(){
        try {
            XmlPlaceHolderHandler("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void VerifyModelTest(){
        try {
            VerifyModel("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void VerifyModelTotalTest(){
        try {
            VerifyModel("");
            ConverToFreemaker("");
            XmlPlaceHolderHandler("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String WordXmlModelHandle(String xmlPath) throws Exception{
        VerifyModel(xmlPath);
        String xmlFtlpath = ConverToFreemaker(xmlPath);
        XmlPlaceHolderHandler(xmlFtlpath);
        return xmlFtlpath;
    }
}
