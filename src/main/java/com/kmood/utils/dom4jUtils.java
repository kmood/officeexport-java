package com.kmood.utils;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;

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
}
