package com.kmood.utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ConvertionUtil {
    //对象转map键值对映射

    public static Map<String, Object> objectToMap(Object obj) throws Exception {
        if(obj == null)
            return null;

        Map<String, Object> map = new HashMap<String, Object>();

        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor property : propertyDescriptors) {
            String key = property.getName();
            if (key.compareToIgnoreCase("class") == 0) {
                continue;
            }
            Method getter = property.getReadMethod();
            Object value = getter!=null ? getter.invoke(obj) : null;
            map.put(key, value);
        }

        return map;
    }

    //Lsit对象列表转map键值对映射
    public static <T> List<Map<String, Object>> objectListToMap(List<T> objectList) throws Exception {
        if(objectList == null)
            return null;
        ArrayList<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        for (T object:objectList) {
            result.add(objectToMap(object));
        }
        return result;
    }
}
