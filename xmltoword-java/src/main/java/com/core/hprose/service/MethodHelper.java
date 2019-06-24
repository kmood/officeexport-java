package com.core.hprose.service;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.core.hprose.service.HproseAttribute.MethodAttribute;
import com.core.hprose.service.HproseDetailAttribute.MethodDetailAttribute;

/**
 * 元数据读取
 * @author jiangbw
 * @date 2016年9月26日 上午11:25:22
 */
public class MethodHelper {

	public static Map<String, HproseMethodAttribute> getHproseMethodInfoEx(Map<String, List<Class<?>>> serviceTypeDiction)
    {
        if (serviceTypeDiction == null || serviceTypeDiction.size() == 0)
            return null;
        Map<String, HproseMethodAttribute> hproseListDiction = new HashMap<String, HproseMethodAttribute>();

        for (Map.Entry<String, List<Class<?>>> entry : serviceTypeDiction.entrySet())
        {
        	HproseMethodAttribute result = new HproseMethodAttribute();
        	for(int i = 0;i < entry.getValue().size();i++){
        	    for(Method m : entry.getValue().get(i).getDeclaredMethods()){
        	    	MethodAttribute ma = m.getAnnotation(MethodAttribute.class);
        	    	if(ma !=null){
        	            HproseAttribute ha = new HproseAttribute(ma.method(), ma.description());	            
        	            result.HproseAttributesList.add(ha);
        	    	}

        	    	MethodDetailAttribute mda = m.getAnnotation(MethodDetailAttribute.class);
        	    	if(mda != null){
        	    		HproseDetailAttribute hda = new HproseDetailAttribute(mda.argsName(), mda.argsDes(), mda.eg());
        	    		result.HproseDetailList.add(hda);
        	    	}
        	    	
        	    	
        	    }
        	}
        	
        	hproseListDiction.put(entry.getKey(), result);
        }

        return hproseListDiction;
    }

	/**
	 * 
	 * @Title packageHproseMethodInfoEx
	 * @Description TODO
	 * @param serviceTypeDiction
	 * @return
	 * @author SunBC
	 * @time 2018年6月27日 下午4:46:18
	 */
	public static ArrayList<Map<String, Object>> packageHproseMethodInfoEx(Map<String, List<Class<?>>> serviceTypeDiction)
    {
        if (serviceTypeDiction == null || serviceTypeDiction.size() == 0)
            return null;
        ArrayList<Map<String, Object>> resultData = new ArrayList<Map<String, Object>>();
        
        for (Map.Entry<String, List<Class<?>>> entry : serviceTypeDiction.entrySet())
        {
        	HashMap<String, Object> modelMap = new HashMap<String,Object>();
        	String modelName = entry.getKey();
        	if(modelName != null){
        		modelMap.put("mkmc", modelName);
        		modelMap.put("hslb", null);
        		ArrayList<Object> methodList = new ArrayList<Object>();
        		for(int i = 0;i < entry.getValue().size();i++){
        			for(Method m : entry.getValue().get(i).getDeclaredMethods()){
        				
        				HashMap<Object, Object> methodInfoMap = new HashMap<>();
        				MethodAttribute ma = m.getAnnotation(MethodAttribute.class);
        				if(ma ==null) continue;
        				if(ma !=null){
        					HproseAttribute ha = new HproseAttribute(ma.method(), ma.description());
        					methodInfoMap.put("hsmccn", ha.getDescription());
        					methodInfoMap.put("hssm", ha.getDescription());
        					methodInfoMap.put("hsmcen", StringUtils.substringBefore(ha.getMethod(), "("));
        				}
        				
        				MethodDetailAttribute mda = m.getAnnotation(MethodDetailAttribute.class);
        				if(mda != null){
        					methodInfoMap.put("cslb", null);
        					ArrayList<Object> argumentList = new ArrayList<Object>();
        					HproseDetailAttribute hda = new HproseDetailAttribute(mda.argsName(), mda.argsDes(), mda.eg());
        					hda.getListArgs();
        					String[] ArgsDes = StringUtils.split(mda.argsDes(), '#');
        					String[] ArgsName = StringUtils.split(mda.argsName(), '#');
        					if(ArgsName != null)
	        					for (int j = 0; j < ArgsName.length; j++) {
									HashMap<String, Object> argumentMap = new HashMap<String,Object>();
									argumentMap.put("sfjson", 0);
									if(j<ArgsName.length)
										argumentMap.put("csmc", ArgsName[j]);
									if(j<ArgsDes.length)
										argumentMap.put("scsm", ArgsDes[j]);
									argumentList.add(argumentMap);
								}
        					methodInfoMap.put("cslb", argumentList);
        					methodList.add(methodInfoMap);
        				}
        			}
        		}
        		modelMap.put("hslb", methodList);
        		resultData.add(modelMap);
        	}
        }
        return resultData;
    }

	
}
