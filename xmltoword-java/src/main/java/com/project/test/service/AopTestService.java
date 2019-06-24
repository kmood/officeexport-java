package com.project.test.service;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.core.hprose.service.HproseClassAttribute;
import com.core.service.MapperPackageTool;
import hprose.server.HproseHttpService;
import hprose.server.HttpContext;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.core.hprose.service.HproseAttribute.MethodAttribute;
import com.core.hprose.service.HproseDetailAttribute.MethodDetailAttribute;
import com.core.utils.JsonBinder;
import com.core.utils.JdbcUtil;
import com.google.gson.Gson;
import com.project.basic.mapper.EntityModelMapper;
import com.project.basic.service.AopCommonService;
import com.project.test.mapper.TestMapper;
import com.project.test.mapper.Test_twoMapper;
import com.project.test.tablemodel.Test;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;


/**
 * service层事务处理，service方法中包含多条数据库操作，对于同一个数据源的数据库操作，在抛出异常时会全部回滚
 * @ClassName TestAopService
 * @Description TODO
 * @author SunBC
 * @date 2017年11月20日
 * @version V1.0
 */
@Service
@HproseClassAttribute(description = "测试模块")
public class AopTestService {
	private static Gson gson = JsonBinder.buildNormalBinderAndHandlerMap("yyyy-MM-dd HH:mm:ss");
	
	@Autowired
	private Test_twoMapper test_twoMapper;
	@Autowired
	private TestMapper testMapper;
	@Autowired
	private EntityModelMapper entityModelMapper;
	@Autowired
	private AopCommonService CommonService;
	@Autowired
	private MapperPackageTool mapperPackageTool;
	/**
	 * 返回值最好为Object且不能为void，若指定具体返回值类型，可能会出现类型强转错误。
	 * 因为hprose通过反射调用方法，返回值为空时反射获取到返回值类型void不会返回数据，
	 * 并且会将servicehandle返回值强转到原有方法返回值类型。
	 * 
	 * 对于事务的处理需要注意，暂时只能增加dao层做处理，通过service调用来进行事务管理，直接在service上添加事务管理是无效的，
	 * 主要原因是因为对一个连接点配置多个界面，这是需要指定不同切面的执行顺序。这是通过Order来制定执行顺序保证servicehandle在事务之后处理。
	 * @Title testVoid
	 * @Description TODO
	 * @author SunBC
	 * @time 2017年10月27日下午2:46:27
	 */
	@Transactional(rollbackFor=Exception.class,propagation=Propagation.SUPPORTS)
	@MethodAttribute(method = "test1()", description = "测试1")
	@MethodDetailAttribute(argsName = "", argsDes = "", eg = "")
	public Object test1()throws Exception{
		URL url = this.getClass().getResource("/");
		String uri = url.toURI().getPath();
		String path = uri.replace("/", File.separator);
		File file = new File(path);

		System.out.println(path+"--------"+file.exists());
		return uri;
	}

	@Transactional(rollbackFor=Exception.class,propagation=Propagation.SUPPORTS)
	@MethodAttribute(method = "testSession()", description = "测试session")
	@MethodDetailAttribute(argsName = "", argsDes = "", eg = "")
	public Object testSession()throws Exception{
		String result = null;
		HttpContext currentContext = HproseHttpService.getCurrentContext();
		HttpSession session = currentContext.getSession();
		System.out.println(session.getAttribute("test"));
		return "";
	}



	@Transactional(rollbackFor=Exception.class,propagation=Propagation.SUPPORTS)
	@MethodAttribute(method = "testSetCookie()", description = "测试cookie设置")
	@MethodDetailAttribute(argsName = "", argsDes = "", eg = "")
	public Object testSetCookie()throws Exception{
		String result = null;
		HttpContext currentContext = HproseHttpService.getCurrentContext();
		Cookie cookie = new Cookie("test", "test");
		cookie.setDomain("^.+?\\.(\\w+\\.[a-z]+)$");
		currentContext.getResponse().addCookie(cookie);
		currentContext.getResponse().addCookie(new Cookie("SESSION","OGFlZDUyZDAtODRlYy00NWJkLTllYTItYmRhNDcxOWRlYmFm"));
		return "";
	}

	@Transactional(rollbackFor=Exception.class,propagation=Propagation.SUPPORTS)
	@MethodAttribute(method = "testGetCookie()", description = "测试cookie获取")
	@MethodDetailAttribute(argsName = "", argsDes = "", eg = "")
	public Object testGetCookie()throws Exception{
		String result = null;
		HttpContext currentContext = HproseHttpService.getCurrentContext();
		Cookie[] cookies = currentContext.getRequest().getCookies();
		for (int i = 0;i<cookies.length ;i++){
			System.out.println("cookie-----"+cookies[i].getName());
		}
		return "";
	}
	
	@Transactional(rollbackFor=Exception.class)
	@MethodAttribute(method = "testReturnResult()", description = "测试返回结果")
	@MethodDetailAttribute(argsName = "", argsDes = "", eg = "")
	public Object testReturnResult()throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		String result = "test";
		System.out.println("我是servcie方法——————————");
		//throw new RuntimeException("我是一个异常");
		resultMap.put("test", 0);
		resultMap.put("test1", "test");
		dataMap.put("test", "test");
		resultMap.put("data", dataMap);
		
		return resultMap;
	}
	
	@Transactional(rollbackFor=Exception.class)
	@MethodAttribute(method = "testTransactional(int flag)", description = "测试事务")
	@MethodDetailAttribute(argsName = "flag", argsDes = "", eg = "0:抛异常")
	public Object testTransactional(int flag)throws Exception{
		Test test = new Test();
		test.setId("testTransactional");
		testMapper.insert(test);
		if(flag == 0)
		throw new RuntimeException("抛出一个异常");
		return "";
	}
	public void KeepAliveDB(){
		Connection oracleConnect = null;
		try {
			oracleConnect = JdbcUtil.getOracleConnect();
			QueryRunner qr = new QueryRunner(true);
			ResultSetHandler<String> rsh = new ResultSetHandler<String>() {
				@Override
				public String handle(ResultSet rs) throws SQLException {
					rs.next();
					String result = rs.getString(1);
					return result;
				}
			};
			try {
				String rkjbxx_rksj = qr.query(oracleConnect,"select to_char(t.RKSJ,'yyyy-MM-dd HH24:mi:ss') rksj_ from (SELECT RKSJ from SYRK_RKJBXX ORDER by RKSJ DESC) t WHERE ROWNUM = 1", rsh);
				List<Map<String, Object>> rkjbxxMapList = entityModelMapper.selectByTableNameAndId("SYRK_RKJBXX", null, null, " and rksj > '"+rkjbxx_rksj+"'");
				String generatorSql_rk = JdbcUtil.generatorSql("SYRK_RKJBXX",rkjbxxMapList);
				if(generatorSql_rk != null) {
					PreparedStatement ps = oracleConnect.prepareStatement(generatorSql_rk);
					ps.executeUpdate();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				String yy_rksj = qr.query(oracleConnect,"select to_char(t.RKSJ,'yyyy-MM-dd HH24:mi:ss') rksj_ from (SELECT RKSJ from SHZZGL_YLWSJG_YY ORDER by RKSJ DESC) t WHERE ROWNUM = 1", rsh);
				List<Map<String, Object>> yyMapList = entityModelMapper.selectByTableNameAndId("SHZZGL_YLWSJG_YY", null, null, " and rksj > '"+yy_rksj+"'");
				String generatorSql_yy = JdbcUtil.generatorSql("SHZZGL_YLWSJG_YY",yyMapList);
				if(generatorSql_yy != null) {
					PreparedStatement ps = oracleConnect.prepareStatement(generatorSql_yy);
					ps.executeUpdate();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				String hjrk_rksj = qr.query(oracleConnect,"select to_char(t.RKSJ,'yyyy-MM-dd HH24:mi:ss') rksj_ from (SELECT RKSJ from SYRK_HJRK ORDER by RKSJ DESC) t WHERE ROWNUM = 1", rsh);
				List<Map<String, Object>> hjrkMapList = entityModelMapper.selectByTableNameAndId("SYRK_HJRK", null, null, " and rksj > '"+hjrk_rksj+"'");
				String generatorSql_hjrk = JdbcUtil.generatorSql("SYRK_HJRK",hjrkMapList);
				if(generatorSql_hjrk != null) {
					PreparedStatement ps = oracleConnect.prepareStatement(generatorSql_hjrk);
					ps.executeUpdate();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				String ldrk_rksj = qr.query(oracleConnect,"select to_char(t.RKSJ,'yyyy-MM-dd HH24:mi:ss') rksj_ from (SELECT RKSJ from SYRK_LDRK ORDER by RKSJ DESC) t WHERE ROWNUM = 1", rsh);
				List<Map<String, Object>> ldrkMapList = entityModelMapper.selectByTableNameAndId("SYRK_LDRK", null, null, " and rksj > '"+ldrk_rksj+"'");
				String generatorSql_ldrk = JdbcUtil.generatorSql("SYRK_LDRK",ldrkMapList);
				if(generatorSql_ldrk != null) {
					PreparedStatement ps = oracleConnect.prepareStatement(generatorSql_ldrk);
					ps.executeUpdate();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				String zdglry_rksj = qr.query(oracleConnect,"select to_char(t.RKSJ,'yyyy-MM-dd HH24:mi:ss') rksj_ from (SELECT RKSJ from TSRQGL_ZDGLRQ_ZSZHDYZJSZAHZ ORDER by RKSJ DESC) t WHERE ROWNUM = 1", rsh);
				List<Map<String, Object>> zdryMapList = entityModelMapper.selectByTableNameAndId("TSRQGL_ZDGLRQ_ZSZHDYZJSZAHZ", null, null, " and rksj > '"+zdglry_rksj+"'");
				String generatorSql_zdry = JdbcUtil.generatorSql("TSRQGL_ZDGLRQ_ZSZHDYZJSZAHZ",zdryMapList);
				if(generatorSql_zdry != null) {
					PreparedStatement ps = oracleConnect.prepareStatement(generatorSql_zdry);
					ps.executeUpdate();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				String xx_rksj = qr.query(oracleConnect,"select to_char(t.RKSJ,'yyyy-MM-dd HH24:mi:ss') rksj_ from (SELECT RKSJ from XYJZBAQGL_XX ORDER by RKSJ DESC) t WHERE ROWNUM = 1", rsh);
				List<Map<String, Object>> xxMapList = entityModelMapper.selectByTableNameAndId("XYJZBAQGL_XX", null, null, " and rksj > '"+xx_rksj+"'");
				String generatorSql_xx = JdbcUtil.generatorSql("XYJZBAQGL_XX",xxMapList);
				if(generatorSql_xx != null) {
					PreparedStatement ps = oracleConnect.prepareStatement(generatorSql_xx);
					ps.executeUpdate();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(oracleConnect != null){
				try {
					oracleConnect.close();
				} catch (SQLException e) {
					
				}
			}
		}
	}
	
	
}
