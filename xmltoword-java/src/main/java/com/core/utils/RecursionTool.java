package com.core.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class RecursionTool {
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
	 * @param dataList 所有数据
	 * @param fid 起始id
	 * @return 
	 * @author SunBC
	 * @time 2018年7月31日 上午9:28:02
	 */
	public static List<Map<Object, Object>> recursionDataTree(List<Map<String, Object>> dataList,String fid){
		ArrayList<Map<Object, Object>> resultList = new ArrayList<Map<Object, Object>>();
		if(CollectionUtils.isEmpty(dataList)) return null;
		for (Map<String, Object>  map : dataList) {
			String bmid_new =String.valueOf(map.get("id"));
			String parentId = String.valueOf(map.get("pid"));
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

}
