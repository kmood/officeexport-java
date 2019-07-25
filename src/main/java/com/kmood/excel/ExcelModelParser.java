package com.kmood.excel;

import com.kmood.word.WordModelHandlerImpl;

/**
 * @Auther: SunBC
 * @Date: 2019/6/17 16:03
 * @Description:
 */
public class ExcelModelParser {
    public static String Compile(String filePath,String ActualModelPath)throws Exception{
        WordModelHandlerImpl wordXmlModelHandler = new WordModelHandlerImpl();
        String path = wordXmlModelHandler.WordXmlModelHandle(filePath,ActualModelPath);
        return path;
    }


}
