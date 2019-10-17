package com.kmood.word;


import com.kmood.basic.PlaceHolder;
import com.kmood.basic.SyntaxException;
import com.kmood.datahandle.FMConfiguration;
import com.kmood.utils.FileUtils;
import com.kmood.utils.StringUtil;
import com.kmood.basic.ModelHandler;
import freemarker.template.Configuration;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.util.List;
public class WordModelHandlerImpl implements ModelHandler {
    @Override
    public  String  VerifyModel(String xmlPath,String ftlOutputPath)throws Exception {
        Writer writer = null;
        String  errorInfo = null;
        try {
            Configuration configuration = FMConfiguration.getConfiguration();
            SAXReader reader = new SAXReader();
            File xmlFile = new File(xmlPath);
            String name = xmlFile.getName();
            Document document = reader.read(xmlFile);
            Element rootElement = document.getRootElement();
            //清空占位图片数据
            WordParserUtils.clearPictureContent(document);
            //处理转义字符
            WordParserUtils.handleESC(document);

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
            if (ftlOutputPath == null) ftlOutputPath = xmlPath+".ftl";
            else ftlOutputPath = ftlOutputPath + name +".ftl";


            writer=new OutputStreamWriter(new FileOutputStream(ftlOutputPath),configuration.getDefaultEncoding());
            document.write(writer);
            writer.flush();
        } finally {
            if (writer != null )
                writer.close();
        }
        return ftlOutputPath;
    }



    @Override
    public String ConverToFreemaker(String ftlOutputPath)throws DocumentException,IOException {
        Writer writer = null;
        try {
            Configuration configuration = FMConfiguration.getConfiguration();
            SAXReader reader = new SAXReader();
            File file = new File(ftlOutputPath);

            Document document = reader.read(file);
            List list = document.selectNodes("//w:p");

            for (int i = 0; i <list.size() ; i++) {
                Node WPNode = (Node)list.get(i);
                //处理分离的占位符
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
                        if (alt == null || !alt.contains("{^"))continue;
                        if (StringUtil.isNotBlank(alt)){
                            shapeNode.addAttribute("alt",alt.replaceAll("\\{\\^[\\s\\S]*\\^}",""));
                        }
                        String s = StringUtil.substringBetween(alt, "{^", "^}");
                        binDataNode.setText("{"+s+"}");
                    }

                }
            }
            writer=new OutputStreamWriter(new FileOutputStream(ftlOutputPath),configuration.getDefaultEncoding());
            document.write(writer);
            writer.flush();
            return ftlOutputPath;
        }finally {
            if (writer != null )
                writer.close();
        }
    }

    @Override
    public void XmlPlaceHolderHandler(String xmlFtlPath) throws IOException{
        FileOutputStream out = null;
        try {
            Configuration configuration = FMConfiguration.getConfiguration();
            String xmModelStr = new String(FileUtils.readToBytesByFilepath(xmlFtlPath),configuration.getDefaultEncoding());
            String body = StringUtil.substringBetween(xmModelStr, "<w:body>", "</w:body>");
            body = WordParserUtils.IfTagHandle(body);
            body = WordParserUtils.ListTagHandle(body);
            body = WordParserUtils.BraceTagHandle(body);
            body = PlaceHolder.FromESC(body);
            out = new FileOutputStream(xmlFtlPath);
            xmModelStr = xmModelStr.substring(0,xmModelStr.indexOf("<w:body>"))+"<w:body>"+body+"</w:body>"+xmModelStr.substring(xmModelStr.lastIndexOf("</w:body>")+9);
            out.write(xmModelStr.getBytes(configuration.getDefaultEncoding()));
            out.flush();
        }finally {
            if(out != null){
                out.close();
            }
        }
    }
    public String WordXmlModelHandle(String xmlPath,String ActualModelPath) throws Exception{
        String actualModelPath = VerifyModel(xmlPath, ActualModelPath);
        ConverToFreemaker(actualModelPath);
        XmlPlaceHolderHandler(actualModelPath);
        return actualModelPath;
    }
}
