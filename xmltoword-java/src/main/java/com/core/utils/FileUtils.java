package com.core.utils;

import java.io.File;
import java.io.FileInputStream;

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
		String data ="";
		FileInputStream input =  null;
		try {
			File file = new File(filePath);
			input = new FileInputStream(file);
			
			byte [] b = new byte [1024];
			int len = 0;
			while ((len = input.read(b)) != -1){
				data += new String (b, 0 , len);
			}
		} catch (Exception e) {
			throw e;
		}finally {
			input.close();
		}
		return data;
	}
}
