
package com.core.hprose.utils;



import hprose.client.HproseHttpClient;

/**
 * @author jiangbw
 * @date 2016年6月7日 下午3:25:43
 */
public class HproseServiceTool {

	public static String UseHproseService(String serviceName,String functionName,Object[] params) throws Throwable{
		HproseHttpClient client = new HproseHttpClient();  
		client.useService(serviceName);
		String result = "";
		if(params == null){
			result = (String)client.invoke(functionName);
		}else{
			result = (String)client.invoke(functionName,params);
		}
		client.close();
		return result;
	}
}
