package com.core.bean;

import java.util.List;
import java.util.Map;

public class ParameterMap {

	private String tableName;

	private List<String> fieldList;

	private List<Map<String, Object>> list;
	
	private String id;//导入时所需id
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ParameterMap() {
		super();
	}

	public ParameterMap(String tableName, List<String> fieldList, List<Map<String, Object>> list) {
		super();
		this.tableName = tableName;
		this.fieldList = fieldList;
		this.list = list;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<String> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<String> fieldList) {
		this.fieldList = fieldList;
	}

	public List<Map<String, Object>> getList() {
		return list;
	}

	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ParameterMap [tableName=" + tableName + ", fieldList=" + fieldList + ", list=" + list + "]";
	}
	

}
