package com.core.service;

import com.project.basic.mapper.EntityModelMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @Auther: SunBC
 * @Date: 2018/12/10 16:14
 * @Description:
 */
@Service
public class MapperPackageTool  {
    @Autowired
    private EntityModelMapper entityModelMapper;
    /**
     * description: 封装数据库查询数据到指定类型
     * @auther: SunBC
     * @date: 2018/12/11 9:56
     */
    public <T> List<T> sqlByCondReturnListData(Class<T> clazz,String cond)throws  Exception{
        ArrayList<T> resultList = new ArrayList<T>();
        List<Map<String, Object>> maplist = entityModelMapper.sqlByCondReturnListMap(cond);
        if (maplist == null) return null;
        for (Map<String, Object> map : maplist) {
            T t = clazz.newInstance();
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field field : declaredFields) {
                String fieldName = field.getName();
                Class<?> fieldType = field.getType();
                setFieldValue(clazz, t, fieldType, fieldName,map.get(fieldName));
            }
            resultList.add(t);
        }
        return  resultList;
    }
    /**
     * description:封装数据库查询数据到指定类型
     * @auther: SunBC
     * @date: 2018/12/11 9:59
     */
    public <T> T sqlByCondReturnMap(Class<T> clazz,String cond) throws Exception{
        Map<String, Object> map = entityModelMapper.sqlByCondReturnMap(cond);
        if (map == null) return null;
        T t = clazz.newInstance();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            String fieldName = field.getName();
            Class<?> fieldType = field.getType();
            setFieldValue(clazz, t, fieldType, fieldName,map.get(fieldName));
        }
        return t;
    }

    private <T> void  setFieldValue(Class clazz,T obj, Class fieldType,String fieldName,Object fieldValue)throws Exception {
        //setRelation
        String h = fieldName.substring(0, 1);
        String methodName = "set"+h.toUpperCase()+fieldName.substring(1);
        Method method = clazz.getMethod(methodName, fieldType);
        if (method == null) return;
        method.invoke(obj, fieldValue);
    }
    /**
     * description: 对象转map键值对映射
     * @auther: SunBC
     * @date: 2019/6/13 14:55
     */
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

    /**
     * description: Lsit对象列表转map键值对映射
     * @auther: SunBC
     * @date: 2019/6/13 14:54
     */
    public static <T> List<Map<String, Object>> objectListToMap(List<T> objectList) throws Exception {
        if(objectList == null)
            return null;
        ArrayList<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        for (T object:objectList) {
            result.add(objectToMap(object));
        }
        return result;
    }
    /**
     * description: 转换两列的list map 到有序键值对映射
     * @auther: SunBC
     * @date: 2019/6/13 14:55
     */
    public static  LinkedHashMap<String, String> RowToCol(List<Map<String,Object>> maps,String keyToKey,String keyToValues ) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        for (Map map:maps){
            result.put(String.valueOf(map.get(keyToKey)),String.valueOf(map.get(keyToValues)));
        }
        return result;
    }

}
