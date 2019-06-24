package com.core.hprose.service;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;


public class HproseDetailAttribute implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3680191120976402139L;
	
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface MethodDetailAttribute{
		public String argsName() default "参数名";
		
		public String argsDes() default "参数描述";
		
		public String eg() default "";
	}
	
	private String argsName;
	private String argsDes;
	@SuppressWarnings("unused")
	private String eg;
	
	
	public String getArgsName() {
		return argsName;
	}
	public void setArgsName(String argsName) {
		this.argsName = argsName;
	}
	public String getArgsDes() {
		return argsDes;
	}
	public void setArgsDes(String argsDes) {
		this.argsDes = argsDes;
	}
	public HproseDetailAttribute(String eg)
    {
        this.ListArgs=new ArrayList<Arguments>();
        this.Eg = eg;
    }
    public HproseDetailAttribute()
    {
        this.ListArgs = new ArrayList<Arguments>();
        this.Eg = "";
    }

    public HproseDetailAttribute(String argsName, String dess,String eg)
    {
        this.ListArgs = new ArrayList<Arguments>();
        String[] argNameArr = argsName.split("#");
        String[] dessArr = dess.split("#");
        for (int i = 0; i < dessArr.length; i++)
        {
            this.ListArgs.add(new Arguments(argNameArr[i],dessArr[i]));
        }
        this.Eg = eg;
    }
    
    public String GetArgNamesStr()
    {
        return StrFormat.getFormatStr(ListArgs, "ArgName");
    }
    public String GetArgDesStr()
    {
    	 return StrFormat.getFormatStr(ListArgs, "ArgDes");
    }
    
	public class Arguments implements  Serializable
    {
		private static final long serialVersionUID = -3680191120976402138L;
        public Arguments(String argName,String argDes)
        {
            this.ArgDes = argDes;
            this.ArgName = argName;
        }

        public String ArgName;
        public String ArgDes;
        
		public String getArgName() {
			return ArgName;
		}
		public void setArgName(String argName) {
			ArgName = argName;
		}
		public String getArgDes() {
			return ArgDes;
		}
		public void setArgDes(String argDes) {
			ArgDes = argDes;
		}
        

    }
	
	public List<Arguments> ListArgs;
    public String Eg;
    
    public List<Arguments> getListArgs() {
		return ListArgs;
	}
	public void setListArgs(List<Arguments> listArgs) {
		ListArgs = listArgs;
	}
	public String getEg() {
		return Eg;
	}
	public void setEg(String eg) {
		Eg = eg;
	}
	
    
	
}
