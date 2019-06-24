package com.core.service;

import com.core.utils.LoginCommon;
import com.project.basic.entity.PRIVS_USER;
import com.project.basic.entity.System_log_exception;
import com.project.basic.entity.System_log_operation;
import com.project.basic.mapper.System_log_exceptionMapper;
import com.project.basic.mapper.System_log_operationMapper;
import hprose.server.HproseService;
import hprose.server.HttpContext;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;


@Service
public class ExceptionOpCommon {
	private static final Logger logger = Logger.getLogger(ExceptionOpCommon.class);
	@Autowired
	private System_log_operationMapper OperationLogMapper;
	@Autowired
	private System_log_exceptionMapper exceptionLogMapper;
	
	
	/**
	 * 
	 * @Title recordOperationLog
	 * @Description TODO
	 * @param dataid
	 * @param model
	 * @param methodName
	 * @param className
	 * @param operationType
	 * @param operationMessage
	 * @author SunBC
	 * @time 2018年8月28日 上午10:33:18
	 */
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public  void recordOperationLog(String dataid ,String model, String methodName,String className, String operationType,String operationTable, String operationMessage) {
        //异常日志记录
		try {
			PRIVS_USER user = LoginCommon.getValue("logineduser");
			if(user == null ) throw new RuntimeException("未登录");
			HttpContext currentContext = (HttpContext)HproseService.getCurrentContext();
			HttpServletRequest request = currentContext.getRequest();
			String ip = getIpAddr(request);
			System_log_operation system_log_operation = new System_log_operation();
			system_log_operation.setId(UUID.randomUUID().toString());
			system_log_operation.setDz(ip);
			system_log_operation.setCzlx(operationType);
			system_log_operation.setFfm(methodName);
			system_log_operation.setLm(className);
			system_log_operation.setMk(model);
			system_log_operation.setSjid(dataid);
			system_log_operation.setYhid(user.getID());
			system_log_operation.setYhmc(user.getNAME());
			String bz = user.getNAME()+operationType+"数据表："+operationTable+",操作数据id为："+dataid;
			if("登录".equals(operationType)|| "登出".equals(operationType))bz = user.getNAME()+operationType;
			system_log_operation.setBz(bz);
			system_log_operation.setSjb(operationTable);
//			int i = 1/0;
			OperationLogMapper.insertSelective(system_log_operation);
		} catch (Throwable ex1) {
//			logger.error("记录操作日志失败"+ex1);
		}
	}
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public  void recordExceptionLog(String exception ,String model, String methodName,String className) {
        //异常日志记录
		try {
			PRIVS_USER user = LoginCommon.getValue("logineduser");
			if(user == null ) throw new RuntimeException("未登录");
			HttpContext currentContext = (HttpContext)HproseService.getCurrentContext();
			HttpServletRequest request = currentContext.getRequest();
			String ip = getIpAddr(request);
			System_log_exception system_log_exception = new System_log_exception();
			system_log_exception.setId(UUID.randomUUID().toString());
			system_log_exception.setDz(ip);
			system_log_exception.setFfm(methodName);
			system_log_exception.setLm(className);
			system_log_exception.setMk(model);
			system_log_exception.setYhid(user.getID());
			system_log_exception.setYhmc(user.getNAME());
			exceptionLogMapper.insertSelective(system_log_exception);
		} catch (Throwable ex1) {
			logger.error("记录异常失败"+ex1);
		}
	}
	
	private static String getIpAddr(HttpServletRequest request) {
		  String Xip = request.getHeader("X-Real-IP");
		  String XFor = request.getHeader("X-Forwarded-For");
		  if(StringUtils.isNotEmpty(XFor) && !"unKnown".equalsIgnoreCase(XFor)){
		   //多次反向代理后会有多个ip值，第一个ip才是真实ip
		   int index = XFor.indexOf(",");
		   if(index != -1){
		    return XFor.substring(0,index);
		   }else{
		    return XFor;
		   }
		  }
		  XFor = Xip;
		  if(StringUtils.isNotEmpty(XFor) && !"unKnown".equalsIgnoreCase(XFor)){
		   return XFor;
		  }
		  if (StringUtils.isBlank(XFor) || "unknown".equalsIgnoreCase(XFor)) {
		   XFor = request.getHeader("Proxy-Client-IP");
		  }
		  if (StringUtils.isBlank(XFor) || "unknown".equalsIgnoreCase(XFor)) {
		   XFor = request.getHeader("WL-Proxy-Client-IP");
		  }
		  if (StringUtils.isBlank(XFor) || "unknown".equalsIgnoreCase(XFor)) {
		   XFor = request.getHeader("HTTP_CLIENT_IP");
		  }
		  if (StringUtils.isBlank(XFor) || "unknown".equalsIgnoreCase(XFor)) {
		   XFor = request.getHeader("HTTP_X_FORWARDED_FOR");
		  }
		  if (StringUtils.isBlank(XFor) || "unknown".equalsIgnoreCase(XFor)) {
		   XFor = request.getRemoteAddr();
		  }
		  return XFor;
		 }
}
