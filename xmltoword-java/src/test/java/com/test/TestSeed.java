package com.test;

import com.core.hprose.utils.HproseServiceTool;
import com.project.basic.mapper.EntityModelMapper;
import com.project.basic.service.AopWorkflowCommonService;
import com.project.test.service.AopTestService;
import com.project.test.service.CustomCondition;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.core.utils.JsonBinder;
import com.google.gson.Gson;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/*"})
public class TestSeed {
	@Autowired
	private AopTestService aopTestService;
	@Autowired
	private EntityModelMapper entityModelMapper;
	private static Gson gson = JsonBinder.buildNormalBinder("yyyy-MM-dd HH:mm:ss");

	@Test
	public void test(){
		try {
//			URL url = this.getClass().getResource("/log4j.xml");
//			String uri = url.toURI().getPath();
//			String path = uri.replace("/", File.separator);
//			File file = new File(path);
//			Date date = new Date();

//          CustomCondition.setLocalCond(" ID = '2' ");
//			System.out.println(entityModelMapper.sqlByCondReturnInteger("select count(*) from XMGL_XMFZ where 1=1 "));

//			String loginTest = HproseServiceTool.UseHproseService("http://localhost:8081/seed/HproseServer", "loginTest", new Object[]{"王晶晶", "654321"});
//			Class<? extends AopTestService> aClass = aopTestService.getClass();
//			System.out.println("TestAopService:"+aClass.getSuperclass().getTypeName());
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}


}
