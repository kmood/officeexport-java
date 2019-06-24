package com.core.service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.core.utils.RSAUtil;
import hprose.server.HttpContext;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.core.hprose.service.HproseAttribute.MethodAttribute;
import com.core.hprose.service.HproseDetailAttribute.MethodDetailAttribute;
import com.core.hprose.service.HproseServer;
import com.core.utils.JsonBinder;
import com.core.utils.LoginCommon;
import com.core.utils.MD5Tool;
import com.google.gson.Gson;
import com.project.basic.entity.PRIVS_LEADER;
import com.project.basic.entity.PRIVS_LEADERExample;
import com.project.basic.entity.PRIVS_USER;
import com.project.basic.entity.PRIVS_USERExample;
import com.project.basic.mapper.EntityModelMapper;
import com.project.basic.mapper.PRIVS_DEPARTMENTMapper;
import com.project.basic.mapper.PRIVS_LEADERMapper;
import com.project.basic.mapper.PRIVS_USERMapper;

import hprose.server.HproseHttpService;

@Service
public class BasicService {

	private static final Gson jsonBinder = JsonBinder.buildNormalBinder("yyyy-MM-dd HH:mm:ss");
	private static final Logger logger = Logger.getLogger(BasicService.class);
	private static final String EXPORT_URL = "/resources/temp";
	@Value("${RSA_PRIVATE_KEY}")
	private  String RSA_PRIVATE_KEY;
	@Autowired
	private PRIVS_USERMapper USERMapper;
	@Autowired
	private PRIVS_DEPARTMENTMapper bmMapper;
	@Autowired
	private EntityModelMapper entityModelMapper;
	@Autowired
	private PRIVS_LEADERMapper LEADERMapper;

	@MethodAttribute(method = "getUserInfo()", description = "得到用户信息")
	@MethodDetailAttribute(argsName = "", argsDes = "", eg = "")
	public String getUserInfo() {
		Map<String, Object> map = new HashMap<>();
		HttpServletRequest request = HproseHttpService.getCurrentContext().getRequest();
		HttpSession session = request.getSession();
		try {
			PRIVS_USER user1 = LoginCommon.getValue("logineduser");
			PRIVS_USERExample userExample = new PRIVS_USERExample();
			PRIVS_USERExample.Criteria criteria = userExample.createCriteria();
			criteria.andISLOCKEDEqualTo("2").andREALNAMEEqualTo(user1.getNAME());
			List<PRIVS_USER> list = USERMapper.selectByExample(userExample);
			PRIVS_USER user = list.get(0);
			user.setBm(bmMapper.selectByPrimaryKey(user.getDEPARTMENTID()).getNAME());
			Map<String, Object> map1 = new HashMap<String, Object>();
			map1.put("user", user);
			session.setAttribute("logineduser", user);
			map.put("status", 0);
			map.put("result", map1);
		} catch (Exception ex) {
			map.put("status", 500);
			map.put("msg", "session为null:" + ex.getMessage());
			logger.error("session为null" + ex.getMessage());
		}
		return jsonBinder.toJson(map);
	}

	@MethodAttribute(method = "loginTest(String username, String password)", description = "用户登录")
	@MethodDetailAttribute(argsName = "username#password", argsDes = "用户名#密码", eg = "")
	public String loginTest(String name, String pwd) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			HttpContext context = HproseHttpService.getCurrentContext();
			HttpSession session = context.getSession();
			PRIVS_USERExample userExample = new PRIVS_USERExample();
			PRIVS_USERExample.Criteria userCriteria = userExample.createCriteria();
			userCriteria.andNAMEEqualTo(name);
			List<PRIVS_USER> userList = USERMapper.selectByExample(userExample);
			if (userList != null && userList.size() > 0) {// 此用户存在
				int userNum = 0;
				try {
					String sourceStr = RSAUtil.decryptByPrivateKey(pwd,RSA_PRIVATE_KEY);
					String pass = MD5Tool.MD5(sourceStr, 32);// 加密后密码
					userNum = entityModelMapper.sqlByCondReturnInteger("select count(*) from PRIVS_USER where NAME='" + name + "' and PASSWORD = '" + pass + "' ");
				} catch (Exception e)  {
					String pass_old = MD5Tool.MD5(pwd, 32);
					userNum = entityModelMapper.sqlByCondReturnInteger("select count(*) from PRIVS_USER where NAME='" + name + "' and PASSWORD = '" + pass_old + "' ");
				}
				if (userNum>0 ) {// 此用户存在
					PRIVS_USER user = userList.get(0);
					PRIVS_USER userInfo = USERMapper.selectByPrimaryKey(user.getID());
					userInfo.setBm(bmMapper.selectByPrimaryKey(user.getDEPARTMENTID()).getNAME());
					Map<String, Object> map1 = new HashMap<String, Object>();
					session.setAttribute("logineduser", userInfo);
					map1.put("user", userInfo);
					map.put("status", 0);
					map.put("result", map1);
				} else {
					map.put("status", 500);
					map.put("msg", "密码错误，请重新输入！");
				}
			} else {
				map.put("status", 500);
				map.put("msg", "用户名不存在，请重新输入！");
			}
		} catch (Exception e) {
			map.clear();
			map.put("status", 500);
			map.put("msg", "登录失败！");
			logger.error("用户登录异常：" + e.getMessage());
		}
		return jsonBinder.toJson(map);
	}

	@MethodAttribute(method = "isLogin()", description = "判断是否登录")
	@MethodDetailAttribute(argsName = "", argsDes = "", eg = "")
	public String isLogin() {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			PRIVS_USER user = LoginCommon.getValue("logineduser");
			user.setBm(bmMapper.selectByPrimaryKey(user.getDEPARTMENTID()).getNAME());
			Map<String, Object> map1 = new HashMap<String, Object>();
			map1.put("user", user);
			map.put("status", 0);
			map.put("result", map1);
		} catch (Exception ex) {
			map.clear();
			map.put("status", 500);
		}
		return jsonBinder.toJson(map);
	}

	@MethodAttribute(method = "userOut()", description = "登出")
	@MethodDetailAttribute(argsName = "", argsDes = "", eg = "")
	public String userOut() {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			HttpServletResponse response = HproseHttpService.getCurrentContext().getResponse();
			response.addCookie(new Cookie("test","test"));
			LoginCommon.loginOut();
			map.put("status", 0);
		} catch (Exception ex) {
			map.clear();
			map.put("status", 500);
			map.put("msg", "用户登出失败！");
		}
		return jsonBinder.toJson(map);
	}

	/**
	 * 
	 * @Title deleteServerFiles
	 * @Description 定时删除服务器上的文件
	 * @author sunsz
	 * @time 2017年8月2日 上午11:39:56
	 */
	@Scheduled(cron = "0 0 1 ? * * ")
	private void deleteServerFiles() {
		String rootpath = HproseServer.rootPath;
		String absolutePath = rootpath + EXPORT_URL;
		File file = new File(absolutePath);
		if (file.exists()) {
			file.delete();
		}
	}

	/**
	 * 
	 * @Title deletServeFile
	 * @Description 删除服务器上的文件
	 * @param url
	 * @return Strings
	 * @author sunsz
	 * @time 2017年8月3日 下午1:52:39
	 */
	@MethodAttribute(method = "deletServeFile(String url)", description = "删除服务器上的文件")
	@MethodDetailAttribute(argsName = "url", argsDes = "相对路径，如/resources/temp", eg = "")
	public String deletServeFile(String url) {
		Map<String, Object> map = new HashMap<>();
		try {
			String rootpath = HproseServer.rootPath;
			String absolutePath = rootpath + url;
			File file = new File(absolutePath);
			if (file.exists()) {
				file.delete();
			}
			map.put("status", 0);
		} catch (Exception ex) {
			map.clear();
			map.put("status", 500);
			map.put("msg", "根据创建人id获取创建人所在部门的多有员工的id集合失败！");
			logger.error("根据创建人id获取创建人所在部门的多有员工的id集合异常:" + ex.getMessage());
		}
		return jsonBinder.toJson(map);
	}

//	public void recordLog(String user, String module, String sjId, String operationType, String operation)
//			throws Throwable {
//		LogModel lm = new LogModel(user, module, sjId, operationType, operation);
//		String json = jsonBinder.toJson(lm);
//		HproseClient.create(recordLogUrl).invoke("insertLogRecord", new Object[] { json });
//	}
	@MethodAttribute(method = "getUseridListByAuthority(PRIVS_USER user)", description = "权限控制")
	@MethodDetailAttribute(argsName = "user", argsDes = "当前用户信息", eg = "")
	public List<String> getUseridListByAuthority(PRIVS_USER user){
//		PRIVS_USER user = LoginCommon.getValue("logineduser");
		if(user == null) return null;
		List<String> useridList = new ArrayList<>();
		String departmentid = user.getDEPARTMENTID();
		String userid = user.getID();
		
		List<Map<String, Object>> user_role = entityModelMapper.selectByTableNameAndId("PRIVS_USER_ROLE", null, null, " and t.USERID = '"+userid+"' and  ( t.ROLEID = (select r1.id from PRIVS_ROLE r1 where r1.name = '【项目管理】部门领导' ) or t.ROLEID = (select r2.id from PRIVS_ROLE r2 where r2.name = '【项目管理】业务中心' ) ) ");
		if("901".equals(departmentid) || "904".equals(departmentid) ){
			useridList = null;
		}else if(user_role != null && !user_role.isEmpty() ){
			String bmTreeString = getBmTreeString(departmentid);
			useridList = entityModelMapper.selectSingFieldListByCondAndHQfield("ID", "PRIVS_USER", null, null, " and DEPARTMENTID in ("+bmTreeString+") and ISLOCKED='2'");
		}else
			useridList.add(userid);
		return useridList;
	}
	
	private String getBmTreeString(String bmid){
		StringBuilder stringbuilder = new StringBuilder(" ");
		String recursionBmBYBmid = getRecursionBmBYBmid(bmid);
		stringbuilder.append(" '").append(bmid).append("' ").append(recursionBmBYBmid);
		return stringbuilder.toString();
	}
	@SuppressWarnings("unused")
	private String getRecursionBmBYBmid(String bmid){
		StringBuilder stringbuilder = new StringBuilder(" ");
		if(bmid == null) return "";
		List<String> bmSonId = null;
		if(bmSonId!=null){
		for (String bmidStr : bmSonId) {
			String recursionBmBYBmid = getRecursionBmBYBmid(bmidStr);
			stringbuilder.append(",'"+bmidStr + "'");
		}}
		return stringbuilder.toString();
	}
	
	/**
	 * 
	 * @Title recursionBM
	 * @Description TODO
	 * @param bmlist
	 * @param bmid
	 * @return
	 * @author SunBC
	 * @time 2018年6月26日 上午11:36:35
	 */
	public List<String> recursionBM(List<Map<String, Object>> bmlist,String bmid){
		ArrayList<String> resultList = new ArrayList<>();
		if(CollectionUtils.isEmpty(bmlist)) return null;
		resultList.add(bmid);
		for (Map<String, Object>  map : bmlist) {
			String bmid_new =(String) map.get("ID");
			String parentId = (String)map.get("PARENTID");
			if(bmid.equals(parentId)){
				List<String> idList = recursionBM(bmlist, bmid_new);
				resultList.addAll(idList);
			}
		}
		return resultList;
	}
	/**
	 * 
	 * @Title recursionBMString
	 * @Description TODO
	 * @param bmlist
	 * @param bmid
	 * @return
	 * @author SunBC
	 * @time 2018年6月26日下午3:01:18
	 */
	public String recursionBMString(List<Map<String, Object>> bmlist,String bmid){
		List<String> bmidList = recursionBM(bmlist, bmid);
		StringBuilder stringbuilder = new StringBuilder(" (");
		for (String bmid_new : bmidList) {
			stringbuilder.append(" '").append(bmid_new).append("' ").append(",");
		}
		String substringBeforeLast = StringUtils.substringBeforeLast(stringbuilder.toString(), ",");
		substringBeforeLast += ")";
		return substringBeforeLast;
	}
	/**
	 * 
	 * @Title recursionDataTree
	 * @Description TODO
	 * @param dataList
	 * @param fid
	 * @return
	 * @author SunBC
	 * @time 2018年7月31日 上午9:28:02
	 */
	public List<Map<Object, Object>> recursionDataTree(List<Map<String, Object>> dataList,String fid){
		ArrayList<Map<Object, Object>> resultList = new ArrayList<Map<Object, Object>>();
		if(CollectionUtils.isEmpty(dataList)) return null;
		for (Map<String, Object>  map : dataList) {
			String bmid_new =String.valueOf(map.get("ID"));
			String parentId = String.valueOf(map.get("FID"));
			if(fid.equals(parentId)){
				HashMap<Object, Object> data = new HashMap<>(map);
				List<Map<Object, Object>> childrenList = recursionDataTree(dataList, bmid_new);
				if(CollectionUtils.isNotEmpty(childrenList))
					data.put("children", childrenList);
				resultList.add(data);
			}
		}
		return resultList;
	}
	public PRIVS_USER getLeader(String departmentID) {
		PRIVS_LEADERExample LEADERExample = new PRIVS_LEADERExample();
		PRIVS_LEADERExample.Criteria LEADERCriteria = LEADERExample.createCriteria();
		LEADERCriteria.andDEPARTMENTIDEqualTo(departmentID).andLEADERLEVELEqualTo("1");
		List<PRIVS_LEADER> leaders = LEADERMapper.selectByExample(LEADERExample);
		if(leaders == null || leaders.isEmpty()) return null;
		String userid = leaders.get(0).getUSERID();
		PRIVS_USER user = USERMapper.selectByPrimaryKey(userid);
		return user;
	}

	
}
