package com.core.hprose.service;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**方法发布注解
 * description:
 * @auther: SunBC
 * @date: 2019/4/9 21:16
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface HproseClassAttribute{
	public String description() default "模块信息";
	public String className() default "";
}

	
	

