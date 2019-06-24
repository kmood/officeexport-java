package com.core.hprose.service;

import java.util.List;

import com.core.hprose.service.HproseDetailAttribute.Arguments;



public class StrFormat {

	public static String getFormatStr(List<Arguments> args,String field){
		String result = "";
		switch(field){
		case "ArgName":
			for(Arguments arg:args){
				result +=arg.ArgName+",";
			}
			break;
			
		case "ArgDes":
			for(Arguments arg:args){
				result +=arg.ArgDes+",";
			}
			break;
		}
		
		result = result.substring(0,result.length()-1);
		return result;
	}
}
