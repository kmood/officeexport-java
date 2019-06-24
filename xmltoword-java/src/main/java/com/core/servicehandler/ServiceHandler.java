package com.core.servicehandler;


import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.core.bean.ResultBean;
import com.core.utils.JsonBinder;
import com.google.gson.Gson;

@Component
@Aspect
@Order(0)
public class ServiceHandler {
	private static Gson gson = JsonBinder.buildNormalBinder("yyyy-MM-dd HH:mm:ss");
	private static final Logger logger = Logger.getLogger(ServiceHandler.class);
	/**
	 *
	 * 全局异常处理以及日志记录
	 * @Title exceptionHandler
	 * @Description TODO
	 * @param pjp
	 * @return
	 * @author SunBC
	 * @time 2017年9月26日上午10:00:24
	 */
	//返回值为String
	@Around("execution(* com.project.*.service.Aop*.*(..))")
	public Object exceptionHandler(ProceedingJoinPoint pjp){
		String result = "";
		String methodName = "";
		//获取参数
		Object[] args = pjp.getArgs();
		//获取方法名
		MethodSignature signature = (MethodSignature)pjp.getSignature();
		methodName = signature.getName();
//		String name = signature.getMethod().getReturnType().getName();
		try {
			result = gson.toJson(new ResultBean(ResultBean.RESULT_STATUS_SUCCED, "服务成功", pjp.proceed(args)));
		} catch (Throwable e) {
			result = gson.toJson(new ResultBean(ResultBean.RESULT_STATUS_FAIL, "服务失败："+e.getMessage()));
			logger.error(methodName+"方法调用异常,错误原因："+e);
		}
		return result;
	}
}
