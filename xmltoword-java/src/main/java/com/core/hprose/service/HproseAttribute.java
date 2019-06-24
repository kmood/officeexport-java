package com.core.hprose.service;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
public class HproseAttribute implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1843931055521184534L;

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface MethodAttribute{
		public String method() default "方法名及参数";
		
		public String description() default "方法描述信息";
	}
	
	private String method;
	
	private String description;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public HproseAttribute(String method, String description) {
		super();
		this.method = method;
		this.description = description;
	}
	
	

}
