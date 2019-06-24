package com.project.basic.entity;

import com.core.utils.JsonBinder;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.Map.Entry;

public class CUServiceUtil {
	private static final Gson gson = JsonBinder.buildNormalBinder("yyyy-MM-dd HH:mm:ss");
	/**
	 * 封装listMap数据
	 * @Title packageParam
	 * @Description TODO
	 * @param tableName
	 * @param entityModelList
	 * @return
	 * @author SunBC
	 * @time 2018年6月22日 下午4:40:32
	 */
	public static ParameterMap packageParam(final String tableName, List<Map<String,Object>> entityModelList){
		List<String> fieldList = new ArrayList<String>();
		for (Map<String,Object> map : entityModelList) {
			Set<String> keySet = map.keySet();
			if(!keySet.contains("ID")) map.put("ID", UUID.randomUUID().toString());
			for (String string : keySet) {
				if("".equals(String.valueOf(map.get(string)).trim()))
					map.put(string, null);
			}
		}
		Set<Entry<String, Object>> entrySet = entityModelList.get(0).entrySet();
		//获取所有字段
		for (Entry<String, Object> entry : entrySet) {
			fieldList.add(entry.getKey());
		}
		return new ParameterMap(tableName, fieldList, entityModelList);
	}
	
	/**
	 * 封装附件的数据
	 * @Title packageParam
	 * @Description TODO
	 * @param tableName
	 * @param entityModelList
	 * @return
	 * @author SunBC
	 * @time 2018年7月12日 上午11:09:03
	 */
	public static ParameterMap packageParam(final String tableName, List<Map<String,Object>> entityModelList, String Pid){
		List<String> fieldList = new ArrayList<String>();
		for (Map<String,Object> map : entityModelList) {
			Set<String> keySet = map.keySet();
			if(!keySet.contains("ID")) map.put("ID", UUID.randomUUID().toString());
			map.put("PID", Pid);
		}
		Set<Entry<String, Object>> entrySet = entityModelList.get(0).entrySet();
		//获取所有字段
		for (Entry<String, Object> entry : entrySet) {
			fieldList.add(entry.getKey());
		}
		return new ParameterMap(tableName, fieldList, entityModelList);
	}
	/**
	 * 
	 * @Title packageTableInfoParam
	 * @Description TODO
	 * @param dataList
	 * @return
	 * @author SunBC
	 * @time 2018年6月22日 下午4:41:03
	 *//*
	public static Map<String,Object> packageTableInfoParam(List<Map<String, Object>> dataList){
		Map<String,Object> map = new HashMap<String,Object>(); 
		if(dataList == null || dataList.isEmpty()) return  null;
		for (Map<String, Object> map_temp : dataList) {
			String comment = (String)map_temp.get("COLUMN_COMMENT");
			comment = StringUtils.substringBeforeLast(comment.trim(), "BMZ");
			comment = StringUtils.substringBeforeLast(comment.trim(), "bmz");
			map.put((String)map_temp.get("COLUMN_NAME"), comment);
		}
		return map;
	}*/
	/**
	 * 获取map字段列表
	 * @Title packageParam
	 * @Description TODO
	 * @param dataMap
	 * @return
	 * @author SunBC
	 * @time 2018年6月22日 下午4:41:43
	 */
	public static ArrayList<String> packageParam(final Map<String, Object> dataMap){
		ArrayList<String> fieldList = new ArrayList<String>();
		if(dataMap == null || dataMap.isEmpty()) return null;
		Set<Entry<String, Object>> entrySet = dataMap.entrySet();
		//获取所有字段
		for (Entry<String, Object> entry : entrySet) {
			fieldList.add(entry.getKey());
		}
		return fieldList;
	}
	/**
	 * 清除ListMap中冗余字段
	 * @Title clearField
	 * @Description TODO
	 * @param entityModelList
	 * @param columnList
	 * @return
	 * @author SunBC
	 * @time 2018年6月22日 下午4:42:11
	 */
	public static List<Map<String,Object>>  clearField(List<Map<String,Object>> entityModelList,List<String> columnList){
		List<Map<String,Object>> entityModelList_new = new ArrayList<Map<String,Object>>();
		for (Map<String, Object> dataMap : entityModelList) {
			Map<String, Object> dataMap_new = new HashMap<>();
			//剔除数据库不存在字段
			if(dataMap == null || dataMap.isEmpty()) return null;
			Set<Entry<String, Object>> entrySet = dataMap.entrySet();
			//获取所有字段
			for (Entry<String, Object> entry : entrySet) {
				if(columnList.contains(entry.getKey())){
					dataMap_new.put(entry.getKey(), entry.getValue());
				}
			}
			entityModelList_new.add(dataMap_new);
		}
		return entityModelList_new;
	}
	/**
	 * 清除Map中冗余字段
	 * @Title clearField
	 * @Description TODO
	 * @param dataMap
	 * @param columnList
	 * @return
	 * @author SunBC
	 * @time 2018年6月22日 下午4:44:55
	 */
	public static Map<String, Object>  clearField(final Map<String, Object> dataMap,List<String> columnList){
		Map<String, Object> dataMap_new = new HashMap<>();
		//剔除数据库不存在字段
		if(dataMap == null || dataMap.isEmpty()) return null;
		Set<String> keySet = dataMap.keySet();
//		if(!keySet.contains("ID")) dataMap.put("ID", UUID.randomUUID().toString());
		Set<Entry<String, Object>> entrySet = dataMap.entrySet();
		//获取所有字段
		for (Entry<String, Object> entry : entrySet) {
			if(columnList.contains(entry.getKey())){
				dataMap_new.put(entry.getKey(), entry.getValue());
			}
		}
		return dataMap_new;
	}
	/**
	 * 
	 * @Title getDataIds
	 * @Description TODO 获取所有id
	 * @param datajson
	 * @return
	 * @author SunBC
	 * @time 2017年12月18日上午9:12:58
	 */
	public static List<String> getDataIds(final String datajson){
		List<FjModul> fjModulList = gson.fromJson(datajson, new TypeToken<List<FjModul>>(){}.getType());
		List<String> idList = new ArrayList<String>();
		for (FjModul data : fjModulList) {
			String ID = (String)data.getID();
			if(ID != null) 
				idList.add(ID);
		}
		return idList;
	}
	/**
	 * 
	 * @Title getfjModulList
	 * @Description TODO 获取所有附件 并添加新建id
	 * @param datajson
	 * @return
	 * @author SunBC
	 * @time 2017年12月18日上午11:00:41
	 */
	public static List<FjModul> getfjModulList(final String datajson){
		List<FjModul> fjModulList = null;
		if(datajson != null && !"".equals(datajson.trim()) && !"null".equalsIgnoreCase(datajson.trim())){
			fjModulList = gson.fromJson(datajson, new TypeToken<List<FjModul>>(){}.getType());
			for (FjModul data : fjModulList) {
				String name = data.getName();
				String wjgs = StringUtils.substringAfterLast(name, ".");
				data.setWJGS(wjgs);
				boolean cond = (wjgs != null) &&(wjgs.equalsIgnoreCase("png") || wjgs.equalsIgnoreCase("bmp") ||
						wjgs.equalsIgnoreCase("jpg") || wjgs.equalsIgnoreCase("jpeg")
						|| wjgs.equalsIgnoreCase("gif"));
				if(cond){
					data.setWJFL("0");
				}else{
					data.setWJFL("1");
				}
				data.setID (UUID.randomUUID().toString());	
			}
		}
		return fjModulList;
	}
}
