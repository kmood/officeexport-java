package com.core.hprose.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HproseMethodAttribute implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -4232552525651429056L;
	public List<HproseAttribute> HproseAttributesList;
    public List<HproseDetailAttribute> HproseDetailList;

	public List<HproseAttribute> getHproseAttributesList() {
		return HproseAttributesList;
	}
	public void setHproseAttributesList(List<HproseAttribute> hproseAttributesList) {
		HproseAttributesList = hproseAttributesList;
	}
	public List<HproseDetailAttribute> getHproseDetailList() {
		return HproseDetailList;
	}
	public void setHproseDetailList(List<HproseDetailAttribute> hproseDetailList) {
		HproseDetailList = hproseDetailList;
	}
	public HproseMethodAttribute() {
		super();
		HproseAttributesList = new ArrayList<>();
		HproseDetailList = new ArrayList<>();
	}
}
