package com.core.utils;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Element;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

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
        if (i<=0 && (data.length() < size)) return data;
        if (i<=0 && (data.length() > size)) return data.substring(0,size);

        if (i <= size) pre = data.substring(0,i);
        else pre = data.substring(i-size,i);
        if (i >= l -size) sub = data.substring(i, l);
        else  sub = data.substring(i, i+size);
        return pre+sub;
    }



    public static String substringBefore(final String str, final String separator) {
        if (str == null || str.length() == 0 || separator == null) {
            return str;
        }
        if (separator.isEmpty()) {
            return "";
        }
        final int pos = str.indexOf(separator);
        if (pos == -1) {
            return str;
        }
        return str.substring(0, pos);
    }

    public static String substringBeforeLast(final String str, final String separator) {
        if (str == null || "".equals(str) || separator == null || "".equals(separator)) {
            return str;
        }
        final int pos = str.lastIndexOf(separator);
        if (pos == -1) {
            return str;
        }
        return str.substring(0, pos);
    }

    public static String substringBetween(final String str, final String open, final String close) {
        if (str == null || open == null || close == null) {
            return null;
        }
        final int start = str.indexOf(open);
        if (start != -1) {
            final int end = str.indexOf(close, start + open.length());
            if (end != -1) {
                return str.substring(start + open.length(), end);
            }
        }
        return null;
    }
    /**
     ** <pre>
     *      * (null, *)      = null
     *      * ("", *)        = ""
     *      * (*, null)      = ""
     *      * ("abc", "a")   = "bc"
     *      * ("abcba", "b") = "cba"
     *      * ("abc", "c")   = ""
     *      * ("abc", "d")   = ""
     *      * ("abc", "")    = "abc"

     */
    public static String substringAfter(final String str, final String separator) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (separator == null) {
            return "";
        }
        final int pos = str.indexOf(separator);
        if (pos == -1) {
            return "";
        }
        return str.substring(pos + separator.length());
    }
    public static String[] substringsBetween(final String str, final String open, final String close) {
        if (str == null ||open == null || open.length() == 0 || close == null || close.length() == 0) {
            return null;
        }
        final int strLen = str.length();
        if (strLen == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        final int closeLen = close.length();
        final int openLen = open.length();
        final List<String> list = new ArrayList<>();
        int pos = 0;
        while (pos < strLen - closeLen) {
            int start = str.indexOf(open, pos);
            if (start < 0) {
                break;
            }
            start += openLen;
            final int end = str.indexOf(close, start);
            if (end < 0) {
                break;
            }
            list.add(str.substring(start, end));
            pos = end + closeLen;
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.toArray(new String [list.size()]);
    }

}
