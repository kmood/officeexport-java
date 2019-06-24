package com.core.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class ZipUtils {
	public static List<String> filelist=new ArrayList<String>();
//	压缩文件为zip
	public static void zipFile(String fileName, ZipOutputStream out) throws IOException{
        File file = new File(fileName);
        if( file.exists() ){
            byte[] buffer = new byte[1024];
            FileInputStream fis = new FileInputStream(file);
            out.putNextEntry(new ZipEntry(file.getName()));
            int len = 0 ;
            //读入需要下载的文件的内容，打包到zip文件    
            while ((len = fis.read(buffer)) > 0) {
                    out.write(buffer, 0, len);
            }
            out.flush();
            out.closeEntry();
            fis.close();
        }
    }
	/**
	 * 优化
	 * @Title zipFile
	 * @Description TODO
	 * @param outPath zip文件输出路径,不包含文件名
	 * @param zipFileName zip文件名
	 * @throws IOException
	 * @author SunBC
	 * @time 2018年10月31日 上午10:47:08
	 */
	public static void zipFile(File[]  zipFileList, String outPath,String zipFileName) throws IOException{
		FileOutputStream fileoutStream = null;
		ZipOutputStream out = null;
		FileInputStream fis = null;
        try {
        	File outDir = new File(outPath);
        	if(!outDir.exists()) outDir.mkdirs();
        	File  zipFile = new File(outPath+"/"+zipFileName+".zip");
        	if(zipFile.exists()) zipFile.delete();
        	fileoutStream = new FileOutputStream(zipFile);
        	out = new ZipOutputStream(fileoutStream);
        	for (File file : zipFileList) {
        		if(file != null && file.exists() ){
        			byte[] buffer = new byte[1024];
        			fis = new FileInputStream(file);
        			out.putNextEntry(new ZipEntry(file.getName()));
        			int len = 0 ;
        			//读入需要下载的文件的内容，打包到zip文件    
        			while ((len = fis.read(buffer)) != -1) {
        				out.write(buffer, 0, len);
        			}
        			out.flush();
        			out.closeEntry();
        			fis.close();
        		}
			}
		} catch (Exception e) {
			throw new RuntimeException("压缩文件出错"+e);
		}finally {
			if(out!= null){
				out.close();
			}
			if(fileoutStream!= null){
				fileoutStream.close();
			}
			if(fis != null){
				fis.close();
			}
		}
    }
//	解压zip文件
	public static void unZipFiles(File zipFile, String outDir) throws IOException {
		File pathFile = new File(outDir);
		if (!pathFile.exists()) {
			pathFile.mkdirs();
		}
		ZipFile zip = new ZipFile(zipFile);
		for (Enumeration entries = zip.entries(); entries.hasMoreElements();) {
			OutputStream out = null;
			InputStream in = null;
			try {
				ZipEntry entry = (ZipEntry) entries.nextElement();
				String zipEntryName = entry.getName();
				in = zip.getInputStream(entry);
				String outPath = outDir + File.separator + zipEntryName;
				File file = new File(outPath);
				if(entry.isDirectory()){
					if(!file.exists()) file.mkdirs();
				}else{
					if(!file.exists()) file.createNewFile();
					out = new FileOutputStream(file);
					byte[] buf1 = new byte[1024];
					int len;
					while ((len = in.read(buf1)) > 0) {
						out.write(buf1, 0, len);
					}
				}
				
			} catch (Exception e) {
				throw new RuntimeException("解压文件报错"+e);
			}finally {
				if(out != null){
					out.close();
				}
				if(in != null){
					in.close();
				}
			}
		}

	}
	
//	遍历文件夹下所有文件
	public static List<String> getFileList(String strPath,String fileType) {
        File dir = new File(strPath);
        File[] files = dir.listFiles(); // 该文件目录下文件全部放入数组
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                if (files[i].isDirectory()) { // 判断是文件还是文件夹
                    getFileList(files[i].getAbsolutePath(),fileType); // 获取文件绝对路径
                } else if (fileName.endsWith(fileType)) { // 判断文件名是否以.shp结尾
                    String strFileName = files[i].getAbsolutePath();
                    System.out.println("---" + strFileName);
                    filelist.add(strFileName);
                } else {
                    continue;
                }
            }

        }
        return filelist;
    }
	
	public static void main(String[] args) throws IOException {
//		解压zip
		File zipFile = new File("e:/20170810.zip");
		String path = "e:/zipfile/";
		unZipFiles(zipFile, path);
		
//		获取shape文件
		getFileList(path, ".shp");
		System.out.println(filelist.size());
filelist=new ArrayList<>();
	}
}
