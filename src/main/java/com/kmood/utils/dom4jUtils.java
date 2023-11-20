package com.kmood.utils;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dom4jUtils {
    public static void addSiblingElement(Element currentElement, Element newElement ) {
        Element parent = currentElement.getParent();
        if (parent != null) {
            List<Element> elements = parent.elements();
            int index = elements.indexOf(currentElement);
            elements.add(index + 1, newElement); // Adding at the specified index in the list
        }
    }

    // 移除指定名称的子元素的方法
    public static void removeChildElementByName(Element parent, String elementName) {
        for (Iterator<Element> it = parent.elementIterator(elementName); it.hasNext(); ) {
            Element element = it.next();
            it.remove(); // 移除匹配的子元素
        }
    }

    public static void handleSwitchLine(Document document) {
        List ParagList = document.selectNodes(".//w:p");

        for (int i = 0; i < ParagList.size(); i++) {
            Element WPNode = (Element) ParagList.get(i);
            List WPChildList = WPNode.elements();
            for (int j = 0; j < WPChildList.size(); j++) {

                Element WPEle = (Element)WPChildList.get(j);
                List WrList = WPEle.selectNodes("w:r");
                dom4jUtils.removeChildElementByName(WPEle,"w:r");
                Element WPEleClear = WPEle.createCopy();
                ArrayList<Element> WpListnew = new ArrayList<>();
                WpListnew.add(WPEleClear);
                int wpNum = 0;
                for (int k = 0; k < WrList.size(); k++) {
                    Element WrEle = (Element)WrList.get(k);
                    List WtList = WrEle.selectNodes("w:t");
                    String text = "";
                    for (int m = 0; m < WtList.size(); m++) {
                        Element WtEle = (Element)WtList.get(m);
                        text += WtEle.getText();
                    }
                    if(text.contains("\n")){
                        String[] split = text.split("\n");
                        for (int l = 0; l < split.length ; l++) {
                            Element wrEleCopy = WrEle.createCopy();
                            dom4jUtils.removeChildElementByName(wrEleCopy,"w:t");
                            wrEleCopy.addElement("w:t").setText(split[l]);
                            wpNum++;
                            Element element = WpListnew.get(wpNum);
                            dom4jUtils.addSiblingElement(element,WPEleClear);
                            element.add(wrEleCopy);
                            WpListnew.add(WPEleClear);
                        }
                    }else {
                        Element element = WpListnew.get(wpNum);
                        element.add(WrEle);

                    }
                }
            }
        }
    }
}
