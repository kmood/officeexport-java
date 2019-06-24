package com.core.utils;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtils {
	/**
	 * 拆分数组
	 * @Title averageAssign
	 * @Description TODO
	 * @param source
	 * @param n
	 * @return
	 * @author SunBC
	 * @time 2018年5月29日 下午4:17:59
	 */
	public static <T> List<List<T>> averageAssign(List<T> source,int n){ 
	    List<List<T>> result=new ArrayList<List<T>>();  
	    int remaider=source.size()%n;  //(先计算出余数)  
	    int number=source.size()/n;  //然后是商  
	    int offset=0;//偏移量  
	    for(int i=0;i<n;i++){  
	        List<T> value=null;  
	        if(remaider>0){  
	            value=source.subList(i*number+offset, (i+1)*number+offset+1);  
	            remaider--;  
	            offset++;  
	        }else{  
	            value=source.subList(i*number+offset, (i+1)*number+offset);  
	        }  
	        result.add(value);  
	    }  
	    return result;  
	}

}
