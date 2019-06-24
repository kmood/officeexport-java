package com.project.basic.service;

import java.net.UnknownHostException;
import java.util.*;

import javax.servlet.ServletContext;

import com.core.hprose.service.HproseAttribute;
import com.core.hprose.service.HproseDetailAttribute;
import com.core.service.ExceptionOpCommon;
import com.core.utils.ServiceTool;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.hprose.service.HproseAttribute.MethodAttribute;
import com.core.hprose.service.HproseDetailAttribute.MethodDetailAttribute;
import com.core.utils.JsonBinder;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.project.basic.entity.CUServiceUtil;
import com.project.basic.entity.ParameterMap;
import com.project.basic.mapper.EntityModelMapper;


@Service
public class AopCommonService {
	private static Gson gson = JsonBinder.buildNormalBinderAndHandlerMap("yyyy-MM-dd HH:mm:ss");
	@Autowired
	private EntityModelMapper entityModelMapper;
	@Autowired
	private ServletContext servletContext;

	@Autowired
	private ExceptionOpCommon exceptionOpCommon;
//	@Value("${XMXXProcDefid}")
//	private String XMXXProcDefid;
	private static final Logger logger = Logger.getLogger(AopCommonService.class);
	private static final Gson jsonBinder = JsonBinder.buildNormalBinder("yyyy-MM-dd");
	
	/**
	 * 通用创建服务，包含附件与数据
	 * @Title createAndUpdateData
	 * @Description TODO
	 * @param tableType
	 * @param json
	 * @return
	 * @author SunBC
	 * @time 2018年7月12日 上午11:14:55
	 */
	@MethodAttribute(method = "createAndUpdateData(String tableType, String json)", description = "新建或编辑通用服务（单条）")
	@MethodDetailAttribute(argsName = "tableType#json", argsDes = "表的类型#数据json", eg = "")
	public Object createAndUpdateData(String tableType, String json) {
		Map<String,Object> mapParam = jsonBinder.fromJson(json, new TypeToken<HashMap<String,Object>>(){}.getType());
		Object id = mapParam.get("ID");
		if(id == null){
			id = UUID.randomUUID().toString();
			mapParam.put("ID", id);
		}
		@SuppressWarnings("unchecked")
		List<Map<String,Object>>  FJList = (List<Map<String,Object>>)mapParam.get("FJList");
		String tableName = entityModelMapper.selectTableName(tableType,null);
		List<String> columnList = entityModelMapper.sqlByCondReturnListString("SELECT col.COLUMN_NAME FROM information_schema.COLUMNS col where col.TABLE_NAME = '"+tableName+"' ");
		Map<String, Object> mapParam_new = CUServiceUtil.clearField(mapParam, columnList);
		ArrayList<String> fieldList = (ArrayList<String>) CUServiceUtil.packageParam(mapParam_new);
		entityModelMapper.InsertAndUpdate(tableName, fieldList, mapParam_new);
		
		// 更新附件
		String fjTableName = (tableName+"_FJ").toUpperCase();
		int fjTableNum = entityModelMapper.getTableNameNum(fjTableName,null);
		//获取附件表明
		if(fjTableNum > 0   ) {
			String pid = (String)mapParam_new.get("ID");
			entityModelMapper.deleteDataByCond(fjTableName, pid,"PID",null);
			if(CollectionUtils.isNotEmpty(FJList)){
				ParameterMap fjpackageParam = CUServiceUtil.packageParam(fjTableName, FJList,pid);
				entityModelMapper.batchInsertAndUpdate(fjpackageParam);
			}
		}
		exceptionOpCommon.recordOperationLog((String)id,tableType,"createAndUpdateData","com.project.basic.service.CommonService",(mapParam.get("ID")) != null?"更新":"新建",tableName,json);
		return id;
	}
	
	
	
	
	/**
	 * 
	 * @Title createOrganizationInfo
	 * @Description TODO 批量新建或更新信息数据
	 * @author SunBC
	 * @throws Throwable 
	 * @throws UnknownHostException 
	 * @time 2017年11月23日下午3:35:02
	 */
	@Transactional(rollbackFor=Exception.class)
	@MethodAttribute(method = "createAndUpdateDatas(final String tableComment,final String dataJsons)", description = "批量新建或更新数据")
	@MethodDetailAttribute(argsName = "tableComment#OrganizationInfoJsons", argsDes = "注释#数据数组json", eg = "")
	public Object createAndUpdateDatas(final String tableComment, final String dataJsons) throws Throwable {
		/*PRIVS_USER user = LoginCommon.getValue("logineduser");
		if(user == null)throw new RuntimeException("未登陆！！！！");*/
		List<Map<String,Object>> entityModelList = jsonBinder.fromJson(dataJsons, new TypeToken<List<Map<String,String>>>(){}.getType());
		String tableName = "";
		String ID = null ;
		tableName = entityModelMapper.selectTableName(tableComment,null);
		String xzqhid =  null;
		List<String> columnList = entityModelMapper.sqlByCondReturnListString("SELECT col.COLUMN_NAME FROM information_schema.COLUMNS col where col.TABLE_NAME = '"+tableName+"' and col.TABLE_SCHEMA = 'gxsnerp'");
		ParameterMap packageParam = CUServiceUtil.packageParam(tableName, CUServiceUtil.clearField(entityModelList, columnList));
		List<Map<String, Object>> list = packageParam.getList();
		entityModelMapper.batchInsertAndUpdate(packageParam);
		return ID;
	}




	@Transactional
	@MethodAttribute(method = "forDelete(String ids, String tableComment)", description = "删除")
	@MethodDetailAttribute(argsName = "ids#tableComment", argsDes = "id的json#注释", eg = "")
	public Object forDelete(String ids, String tableComment) throws Exception {
		String tableName = "";
		tableName = entityModelMapper.selectTableName(tableComment, null);
		String[] id = ids.split(",");
		List<String> idList = Arrays.asList(id);
		if (CollectionUtils.isEmpty(idList)) return ids;
		List<Map<String, Object>> data = entityModelMapper.selectByTableNameAndFeildAndIdlist(tableName, idList, "ID", null);
		entityModelMapper.forDelete("ID", idList, tableName);
		exceptionOpCommon.recordOperationLog(ids,tableComment,"forDelete","com.project.basic.service.CommonService","删除",tableName,data.toString());
		return ids;
	}


	@HproseAttribute.MethodAttribute(method = "getTableInfo(String tableComment , String ID)", description = "通过表注释和ID查详情(编辑)")
	@HproseDetailAttribute.MethodDetailAttribute(argsName = "tableComment#ID", argsDes = "表注释#数据id", eg = "")
	public Object getTableInfo(String tableComment, String ID) throws Exception {
		String tableName = "";
		Map<String, Object> resultMap = null;
		if(StringUtils.isBlank(ID)) return  null;
		tableName = entityModelMapper.selectTableName(tableComment,null);
		String fjTableName = (tableName+"_FJ").toUpperCase();
		int ViewTableNum = entityModelMapper.getTableNameNum("VIEW_"+tableName, null);
		if(ViewTableNum > 0)
			resultMap = entityModelMapper.selectSingByTableNameAndId("VIEW_"+tableName, ID, "ID"," ");
		else
			resultMap = entityModelMapper.selectSingByTableNameAndId(tableName, ID, "ID"," ");
		if(resultMap == null) return  null;

		int tableNum = entityModelMapper.getTableNameNum(fjTableName,null);
		resultMap.put("FJList", null);
		if(resultMap != null && !resultMap.isEmpty() && tableNum >0){
			List<Map<String, Object>> fjList = entityModelMapper.selectByTableNameAndId(fjTableName, (String)resultMap.get("ID"), "PID", "");
			resultMap.put("FJList", fjList);
		}
		return resultMap;
	}
	
	
	@MethodAttribute(method = "getTableFieldAndComment(String tableComment)", description = "获取指定表的注释详情")
	@MethodDetailAttribute(argsName = "tableComment", argsDes = "表注释", eg = "")
	public Object getTableFieldAndComment(String tableComment) throws Exception {
		Map<String, Object> map = new HashMap<>();
		Map<String, Object> mapReault = new HashMap<>();
		String tableName = "";
		tableName = entityModelMapper.selectTableName(tableComment,null);
		List<Map<String, Object>> fieldAndComment = entityModelMapper.sqlByCondReturnListMap("SELECT col.COLUMN_NAME,col.COLUMN_COMMENT FROM information_schema.`COLUMNS` col where col.TABLE_NAME ='"+tableName+"' ");
		return fieldAndComment;
	}


	/**
	 * description: 单表多条件获取列表的服务
	 * @auther: SunBC
	 * @date: 2019/1/7 13:33
	 */
	@MethodAttribute(method = "getdataListByCond(int pageNo, int pageSize,String tableComment,String conds)", description = "单表多条件获取列表的服务")
	@MethodDetailAttribute(argsName = "pageNo#pageSize#tableComment#conds", argsDes = "起始页（小于零时不分页）#页大小#表注释#条件（[{\"fieldname\":\"ID\",\"relation\":\"EQ\",\"fieldvalue\":\"2\"}]）", eg = "")
	public Object getdataListByCond(int pageNo, int pageSize,String tableComment,String conds) throws Exception {
		String tableName = entityModelMapper.selectTableName(tableComment,null);
		ArrayList<LinkedHashMap<String,Object>> condMap = gson.fromJson(conds, new TypeToken<ArrayList<LinkedHashMap<String,Object>>>(){}.getType());
		String tableName_view = "VIEW_"+tableName;
		List<Map<String, Object>> dataList = null;
		int viewTableNum = entityModelMapper.getTableNameNum(tableName_view,null);
		String cond = ServiceTool.condPackage(null,conds);
		if(pageNo > 0 ) PageHelper.startPage(pageNo, pageSize);
		if(viewTableNum>0) dataList = entityModelMapper.sqlByCondReturnListMap("select * from "+tableName_view +" where 1=1 " + cond);
		else dataList = entityModelMapper.sqlByCondReturnListMap("select * from "+tableName+" where 1=1 " + cond);
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(dataList);
		return pageInfo;
	}




	
	
}
