package com.test.dom4j;

import org.dom4j.*;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import javax.print.Doc;
import java.io.FileWriter;
import java.util.*;

/**
 * @Auther: SunBC
 * @Date: 2019/6/19 11:09
 * @Description:
 */
public class dom4jTest {
    public static void AddParentNode(Element ele, String parentName, HashMap<String ,String > Attr){
        if (ele == null) return;
        Element parent = ele.getParent();
        List elements = parent.elements();
        int eleIndex = elements.indexOf(ele);
        ArrayList<Element> elementsPrefix = new ArrayList<>();
        ArrayList<Element> elementsSubfix = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            Element e = (Element) elements.get(i);
            if (i <eleIndex)
                elementsPrefix.add(e);
            if (eleIndex >i)
                elementsSubfix.add(e);
            parent.remove(e);
        }
        Element parentNameEle = parent.addElement(parentName);
        Set<String> keyset = Attr.keySet();
        for (String key:keyset){
            parentNameEle.addAttribute(key,Attr.get(key));
        }
        for (int i = 0; i <elementsPrefix.size() ; i++) {
            parentNameEle.add(elementsPrefix.get(i));
        }
        parentNameEle.add(ele);
        for (int i = 0; i <elementsSubfix.size() ; i++) {
            parentNameEle.add(elementsSubfix.get(i));
        }
    }
    @Test
    public void NodeAddParent(){
        String xml = "<person> " +
                "<name1>" +
                "  <tr><tc>test</tc></tr>" +
                "<tr><tc></tc></tr>" +
                "</name1><name2>James</name2>  " +
                "</person>";
        try {
            Document document = DocumentHelper.parseText(xml);
            List nodes = document.selectNodes("/person/name1/tr/tc");
            Element node =(Element) document.selectSingleNode("/person/name1/tr/tc");
            HashMap<String, String> atr = new HashMap<>();
            atr.put("name","test");
            AddParentNode(node,"#list",atr);
            String name = node.getName();
            System.out.println(node.getPath());
//            FileWriter fileWiter = new FileWriter("C:\\Users\\admin\\Desktop\\ngccoa export\\test.xml");
//            XMLWriter writer = new XMLWriter(fileWiter);
//            writer.write( document );
//            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
