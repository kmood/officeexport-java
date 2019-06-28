package com.core.utils;

import org.apache.commons.lang3.StringUtils;

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

	public static String substringBeforeAfterSize(String data, int i, int size) {
		String s;
		String pre = "";
		String sub = "";
		int l = data.length();
		if (l == 0) return "";
		if (i>l-1) return data;
		if (i < size) pre = data.substring(0,i);
		else pre = data.substring(i-15,i);
		if (i > l -size) sub = data.substring(i, l -1);
		else  sub = data.substring(i, i+15);
		return pre+sub;
	}


	

}
