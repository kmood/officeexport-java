package com.kmood.utils;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipParameters;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ZipUtils {

    public static String compress(String zipPath,String sourceFolderPath){
        try {
            ZipFile zipFile = new ZipFile(zipPath);
            File folder = new File(sourceFolderPath);
            File[] files = folder.listFiles();
            List<File> fileslist = Arrays.asList(files);
            for (File fileitem : fileslist) {
                if (fileitem.isDirectory()) {
                    zipFile.addFolder(fileitem);
                } else {
                    zipFile.addFile(fileitem);
                }
            }
            return sourceFolderPath;
        }catch(Exception ex){

            return null;
        }

    }

    public static void main(String[] args) throws ZipException {
//		String folder = "D:\\upload\\backup\\down\\dezip\\";
//		compress("D:/upload/zip/测试.zip", "123456", folder);

        ZipFile zipFile1 = new ZipFile("F://docx.zip");
        zipFile1.extractAll("F://docx");


        String resultPath="F://testtttttt.zip";
        String sourceFolderPath="F://docx";



        ZipFile zipFile = new ZipFile(resultPath);
        File folder=new File(sourceFolderPath);
        File[] files = folder.listFiles();
        List<File> fileslist = Arrays.asList(files);
        for(File fileitem : fileslist){
            if(fileitem.isDirectory()){
                zipFile.addFolder(fileitem);
            }else{
                zipFile.addFile(fileitem);
            }
        }
        // return resultPath;

    }
}
