package com.test.utils;

import com.kmood.utils.dom4jUtils;
import org.dom4j.*;
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
            dom4jUtils.removeChildElementByName(root,"element1");
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

    @Test
    public void testHandleSwitchLine(){
        try{
            Document document = DocumentHelper.createDocument();

            Element root = document.addElement("root");
            Element root1 = root.addElement("p");
            root1.addElement("r").addElement("a").setText("孙柏超");
            root1.addElement("r").addElement("t").setText("孙柏超");
            root1.addElement("r").addElement("t").setText("孙柏超2\nsdfsdfs\ndfsdfsdfsdf");

            Element root2 = root.addElement("p");
            root2.addElement("r").addElement("t").setText("孙柏\n超");
            root2.addElement("r").addElement("t").setText("孙柏超2sd\nfsdfsdfsdfsdfsdf");


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
            System.out.println(xmlString+"\n-----------------------------------------------------------");


            dom4jUtils.handleSwitchLinetemp(document);
            // 保存XML文档
            // Saving the XML document to a String
            format = OutputFormat.createPrettyPrint();
            format.setEncoding("UTF-8");
            stringWriter = new StringWriter();
            writer = new XMLWriter(stringWriter, format);
            writer.write(document);
            writer.flush();

            xmlString = stringWriter.toString();

            // Output the XML string to console
            System.out.println(xmlString);
        }
        catch(Exception e){
        e.printStackTrace();
        }
    }

}
