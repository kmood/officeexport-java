package com.kmood.word;


import com.kmood.basic.SyntaxException;
import com.kmood.utils.FileUtils;
import com.kmood.utils.StringUtil;
import com.kmood.basic.ModelHandler;
import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * @Auther: SunBC
 * @Date: 2019/6/18 11:09
 * @Description:
 */
public class WordModelHandlerImpl implements ModelHandler {
    @Override
    public  void VerifyModel(String xmlPath)throws DocumentException {
        String  errorInfo = null;
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File(xmlPath));
        Element rootElement = document.getRootElement();
        //清空占位图片数据
        WordParserUtils.clearPictureContent(document);
        List pictList = document.selectNodes(".//v:shape");
        //校验图片
        for (int i = 0; pictList != null &&i < pictList.size(); i++) {
            Element node = (Element)pictList.get(i);
            Attribute alt = node.attribute("alt");
            if (alt == null || StringUtil.isBlank(alt.getText())) continue;
            errorInfo = WordParserUtils.VarifySyntax(StringUtil.removeInvisibleChar(alt.getText()));
            if (errorInfo != null && errorInfo.length() != 0) throw new SyntaxException("(图片占位符)"+errorInfo);
        }

        //校验段落
        List ParagList = document.selectNodes(".//w:p");
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
        errorInfo= WordParserUtils.VarifySyntax(wpStr.toString());
        if (errorInfo != null && errorInfo.length() != 0) throw new SyntaxException(errorInfo);
        return ;
    }



    @Override
    public String ConverToFreemaker(String xmlPath,String ftlOutputPath)throws DocumentException,IOException {
        XMLWriter writer = null;
        try {
            SAXReader reader = new SAXReader();
            File file = new File(xmlPath);
            Document document = reader.read(file);
            //清空占位图片数据
            WordParserUtils.clearPictureContent(document);
            List list = document.selectNodes("//w:p");
            for (int i = 0; i <list.size() ; i++) {
                Node WPNode = (Node)list.get(i);
                WordParserUtils.PlaceHodlerHandle(WPNode);
            }
            //转换[ 到list标签
            String name = file.getName();
            WordParserUtils.BracketToListConversion(document);
            List pictureList = document.selectNodes("//w:pict");
            if (pictureList != null ){
                for (int i = 0; i < pictureList.size(); i++) {
                    Element node = (Element)pictureList.get(i);
                    Element shapeNode = (Element)node.selectSingleNode("./v:shape");
                    Element binDataNode = (Element)node.selectSingleNode("./w:binData");
                    if (binDataNode == null && shapeNode != null) {
                        String alt = shapeNode.attributeValue("alt");
                        if (StringUtil.isNotBlank(alt)){
                            shapeNode.addAttribute("alt",alt.replaceAll("\\{\\^[\\s\\S]*\\^}",""));
                        }
                        continue;
                    }
                    if (binDataNode != null  && shapeNode != null){
                        String alt = shapeNode.attributeValue("alt");
                        if (StringUtil.isNotBlank(alt)){
                            shapeNode.addAttribute("alt",alt.replaceAll("\\{\\^[\\s\\S]*\\^}",""));
                        }
                        String s = StringUtil.substringBetween(alt, "{^", "^}");
                        binDataNode.setText("{"+s+"}");
                    }

                }
            }
            if (ftlOutputPath == null) ftlOutputPath = xmlPath+".ftl";
            else ftlOutputPath = ftlOutputPath + name +".ftl";
            FileWriter fileWiter = new FileWriter(ftlOutputPath);
            writer = new XMLWriter(fileWiter);
            writer.write( document );
            writer.flush();
            return ftlOutputPath;
        }finally {
            if (writer != null )
                writer.close();
        }
    }

    @Override
    public void XmlPlaceHolderHandler(String xmlFtlPath) throws IOException{
        XMLWriter writer = null;
        FileOutputStream out = null;
        try {
            String xmModelStr = FileUtils.readToStringByFilepath(xmlFtlPath);
            String body = StringUtil.substringBetween(xmModelStr, "<w:body>", "</w:body>");
            body = WordParserUtils.IfTagHandle(body);
            body = WordParserUtils.ListTagHandle(body);
            body = WordParserUtils.BraceTagHandle(body);
            out = new FileOutputStream(xmlFtlPath);
            xmModelStr = xmModelStr.substring(0,xmModelStr.indexOf("<w:body>"))+"<w:body>"+body+"</w:body>"+xmModelStr.substring(xmModelStr.lastIndexOf("</w:body>")+9);
            out.write(xmModelStr.getBytes());
            out.flush();
        }finally {
            if(out != null){
                out.close();
            }
        }
    }



    public String WordXmlModelHandle(String xmlPath,String ActualModelPath) throws IOException,DocumentException{
        VerifyModel(xmlPath);
        String xmlFtlpath = ConverToFreemaker(xmlPath,ActualModelPath);
        XmlPlaceHolderHandler(xmlFtlpath);
        return xmlFtlpath;
    }
}
