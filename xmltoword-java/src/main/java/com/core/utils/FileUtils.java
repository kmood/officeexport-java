package com.core.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;

public class FileUtils {
	/**
	 * 
	 * @Title readToStringByFilepath
	 * @Description TODO
	 * @param filePath
	 * @return
	 * @throws Exception
	 * @author SunBC
	 * @time 2018年10月16日 下午6:53:31
	 */
	public static String readToStringByFilepath(String filePath)throws Exception{
		StringBuilder data = new StringBuilder();
		Reader reader  =  null;
		try {
			File file = new File(filePath);
			reader = new FileReader(file);
			char [] c = new char [1024];
			int len = 0;
			while ((len = reader.read(c)) != -1){
				data.append(String.copyValueOf(c,0,len));
			}
		} catch (Exception e) {
			throw e;
		}finally {
			reader.close();
		}
		return data.toString();
	}
}
