package com.core.hprose.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.utils.JsonBinder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Service
public class PublisMethod {
	
	@Autowired
	private HomeController homeController;
	private static final Logger logger = Logger.getLogger(PublisMethod.class);
	private static final Gson jsonBinder = JsonBinder.buildNormalBinder("yyyy-MM-dd");
	public Object getServiceList(){
		homeController.service(null);
		return MethodHelper.packageHproseMethodInfoEx(homeController.getServiceTypeDiction());
	}
}
