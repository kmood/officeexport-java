package com.core.utils;

//import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
//import org.junit.Test;

public class StringUtil extends StringUtils {
	
	public static String substringBefore(String str, String separator,int index){
		if (str == null )return null;
		if (separator == null )return str;
		String[] str_arr = str.split("_");
		if(str_arr.length < 1 || index > str_arr.length) return str;
		if(index == 0) return str;
		int index_ = str_arr.length + index;
		if(index_ <= 0) return str;
		if(index < 0) index = index_;
		
		String result = "";
		for (int i=0;i<index;i++) {
			result += str_arr[i]+separator;
		}
		return substringBeforeLast(result, "_");
		
	}
	
	
//	@Test
//	public void test(){
//		String testdata1 = "进度上报1";
//		String testdata2 = "计划编报_项目档案_招投标_附件";
//		String testdata3 = "系统_用户";
//		assertEquals("进度上报1", substringBefore(testdata1, "_", 1));
//		assertEquals("计划编报", substringBefore(testdata2, "_", 1));
//		assertEquals("系统", substringBefore(testdata3, "_", 1));
//		
//		
//		assertEquals("进度上报1", substringBefore(testdata1, "_", 2));
//		assertEquals("计划编报_项目档案", substringBefore(testdata2, "_", 2));
//		assertEquals("系统_用户", substringBefore(testdata3, "_", 2));
//		
//		assertEquals(testdata1, substringBefore(testdata1, null, 2));
//		assertEquals(null, substringBefore(null, "_", 2));
//		assertEquals(testdata3, substringBefore(testdata3, "_", 0));
//		
//		assertEquals("进度上报1", substringBefore(testdata1, "_", -1));
//		assertEquals("计划编报_项目档案_招投标", substringBefore(testdata2, "_", -1));
//		assertEquals("系统", substringBefore(testdata3, "_", -1));
//		
//		assertEquals("进度上报1", substringBefore(testdata1, "_", -2));
//		assertEquals("计划编报", substringBefore(testdata2, "_", -3));
//	}
	
	

}
