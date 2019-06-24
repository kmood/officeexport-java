package com.core.hprose.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.core.service.BasicService;
import com.project.basic.service.AopCommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.test.service.AopTestService;

/**
 * 此处必须使用新建service类，否则无法获取注解参数信息
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private static Map<String, List<Class<?>>> serviceTypeDiction = new LinkedHashMap<>();
	
	public Map<String, List<Class<?>>> getServiceTypeDiction() {
		return serviceTypeDiction;
	}
	@Autowired
	private AopTestService testAopService;

	@Autowired
	private BasicService basicService;

	@Autowired
	private ApplicationContext applicationContext;


	@RequestMapping(value = "/service", method = RequestMethod.GET)
	public ModelAndView service(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView("service");
		Map<String, Object> HprosePublishBean = applicationContext.getBeansWithAnnotation(HproseClassAttribute.class);
		for (String key:HprosePublishBean.keySet()) {
			String publisClassName = HprosePublishBean.get(key).getClass().getTypeName();
			Class<?> publisClass = null;
			try {
				publisClass = Class.forName(publisClassName);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			if (publisClass == null) continue;
			HproseClassAttribute hproseClassAttribute = publisClass.getAnnotation(HproseClassAttribute.class);
			String description = hproseClassAttribute.description();
			List<Class<?>> ServiceList = new ArrayList<Class<?>>();
			ServiceList.add(publisClass);
			serviceTypeDiction.put(description, ServiceList);
		}
        Map<String, HproseMethodAttribute> result = MethodHelper.
        		getHproseMethodInfoEx(serviceTypeDiction);

        ArrayList<Map<String, Object>> packageHproseMethodInfoEx = MethodHelper.packageHproseMethodInfoEx(serviceTypeDiction);
        
		mav.addObject("methodInfo", result);
		if(request != null)
			request.getSession().setAttribute("methodInfo", result);
		return mav;
	}
}
