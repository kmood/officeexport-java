package com.core.hprose.service;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.core.service.BasicService;
import com.project.basic.service.AopCommonService;
import com.project.basic.service.AopWorkflowCommonService;
import hprose.server.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.project.test.service.AopTestService;

import java.util.Map;

@WebServlet(name="HproseServer",urlPatterns="/HproseServer",asyncSupported = true)
public class HproseServer extends HproseServlet{
	@Autowired
	private ApplicationContext applicationContext;

	private static final long serialVersionUID = -3545650463646661202L;
	public static String rootPath;
	public HproseServer(){super();}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,config.getServletContext());
	}

	@Override
	protected void processRequest(HttpServletRequest request, HttpServletResponse response){
		rootPath = request.getSession().getServletContext().getRealPath("/");
		this.service.setTimeout(60000);
		this.service.setCrossDomainEnabled(true);
		this.service.setP3pEnabled(true);
		this.service.setGetEnabled(true);
		this.service.setDebugEnabled(true);
		HproseHttpMethods methods = new HproseHttpMethods();
		/* 此处必须使用spring容器中已创建的bean*/
		Map<String, Object> HprosePublishBean = applicationContext.getBeansWithAnnotation(HproseClassAttribute.class);
		for (String key:HprosePublishBean.keySet()) {
			this.service.add(HprosePublishBean.get(key),HprosePublishBean.get(key).getClass());
		}
		this.service.handle(new HttpContext(service, request, response, this.getServletConfig(), this.getServletContext()),methods);
	}



}

