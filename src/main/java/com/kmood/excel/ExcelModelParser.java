package com.kmood.excel;

import com.kmood.word.WordModelHandlerImpl;


public class ExcelModelParser {
    public static String Compile(String filePath,String ActualModelPath)throws Exception{
        WordModelHandlerImpl wordXmlModelHandler = new WordModelHandlerImpl();
        String path = wordXmlModelHandler.WordXmlModelHandle(filePath,ActualModelPath);
        return path;
    }


}
