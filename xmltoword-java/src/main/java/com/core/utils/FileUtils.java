package com.core.utils;

import org.apache.commons.io.output.FileWriterWithEncoding;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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
	/**
	 * 
	 * @Title generatorFileByType
	 * @Description TODO
	 * @param fileType 文件类型 如 pdf
	 * @param fileDirPath 文件所在目录
	 * @param filePrefix 导出文件名的前缀
	 * @param data 数据
	 * @return
	 * @throws IOException
	 * @author SunBC
	 * @time 2018年10月27日 上午11:24:33
	 */
	public static  String generatorFileByType(String fileType, String fileDirPath, String filePrefix, String data)
			throws IOException {
		File dir = new File(fileDirPath); 
		if(!dir.exists()) dir.mkdirs();
		String filename = filePrefix+System.currentTimeMillis()+"."+fileType;
		String shpJsonFilePath = fileDirPath + File.separator +filename;
		File shpJsonFile = new File(shpJsonFilePath);
		if(!shpJsonFile.exists()) shpJsonFile.createNewFile();
		FileWriterWithEncoding jsonFileWriter = null;
		jsonFileWriter = new FileWriterWithEncoding(shpJsonFile, "utf-8", false);
		jsonFileWriter.write(data);
		jsonFileWriter.flush();
		String relativePath = File.separator +"resources"+StringUtil.substringAfter(shpJsonFilePath, "resources");
		return relativePath;
	}
}
