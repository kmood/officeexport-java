
package com.core.hprose.utils;

import java.net.URISyntaxException;

import hprose.server.HproseHttpService;
import hprose.server.HproseTcpServer;

/**
 * @author jiangbw
 * @date 2016年9月9日 上午11:07:03
 */
public class HproseServerFactory {

	private static HproseHttpService service = null;
	private static HproseTcpServer tcpServer = null;
	
	synchronized public static HproseHttpService getInstance(){
		if(service == null){
			service = new HproseHttpService();
		}
		
		return service;
	}
	
	synchronized public static HproseTcpServer getTcpInstance(String address){
		if(tcpServer == null){
			try {
				tcpServer = new HproseTcpServer(address);
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return tcpServer;
	}
}
