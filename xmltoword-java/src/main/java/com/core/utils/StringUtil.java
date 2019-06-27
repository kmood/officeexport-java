package com.core.utils;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

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

	public static  String removeInvisibleChar(String str){
		if (str == null) return null;
		if (str.trim().length() == 0) return "";
		return str.replaceAll("[\\x00-\\x1F | \\x7F ]","");
	}

	/**
	 *
	 * @param data  字符串
	 * @param i  字符串下标
	 * @param size 截取的长度
	 * @return 放回结果最大长度为2*size
	 */
	public static String substringBeforeAfterSize(String data, int i, int size) {
		String s;
		String pre = "";
		String sub = "";
		if (data == null && data.length() == 0) return "";
		int l = data.length();

		if (i>l-1) return data.substring(l-size, l);
		if (i<=0) return data;

		if (i <= size) pre = data.substring(0,i);
		else pre = data.substring(i-size,i);
		if (i >= l -size) sub = data.substring(i, l);
		else  sub = data.substring(i, i+size);
		return pre+sub;
	}

	@Test
	public void testSubstringBeforeAfterSize(){
		System.out.println(substringBeforeAfterSize("123456789",0,5));
		System.out.println(substringBeforeAfterSize("123456789",4,5));
		System.out.println(substringBeforeAfterSize("123456789",5,5));
		System.out.println(substringBeforeAfterSize("123456789123",6,5));
		System.out.println(substringBeforeAfterSize("123456789123",8,5));
		System.out.println(substringBeforeAfterSize("123456789",9,5));
		System.out.println(substringBeforeAfterSize("123456789",5,10));

	}

	

}
