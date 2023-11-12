package com.test.utils;

import com.kmood.utils.dom4jUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.StringWriter;
import java.io.Writer;

public class TestDom4jutils {

    @Test
    public void testAddSiblingElement(){
        try{
        Document document = DocumentHelper.createDocument();
        Element root = document.addElement("root");
        Element element1 = root.addElement("element1");
        Element element3 = root.addElement("element3");
            Element wbr = DocumentHelper.createElement("w:br");
            Element copyEle = element1.createCopy();
        dom4jUtils.addSiblingElement(element1, wbr);
            dom4jUtils.addSiblingElement(wbr, copyEle);

        // 保存XML文档
        // Saving the XML document to a String
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");

        StringWriter stringWriter = new StringWriter();
        XMLWriter writer = new XMLWriter(stringWriter, format);
        writer.write(document);
        writer.flush();

        String xmlString = stringWriter.toString();

        // Output the XML string to console
        System.out.println(xmlString);}
        catch(Exception e){

        }
    }
}
