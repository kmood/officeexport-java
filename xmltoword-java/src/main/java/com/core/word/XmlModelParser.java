package com.core.word;

import com.core.utils.FileUtils;

/**
 * @Auther: SunBC
 * @Date: 2019/6/17 16:03
 * @Description:
 */
public class XmlModelParser {
    public static String Compile(String filePath)throws Exception{
        WordXmlModelHandlerImpl wordXmlModelHandler = new WordXmlModelHandlerImpl();
        String path = wordXmlModelHandler.WordXmlModelHandle(filePath);
        return path;
    }


}
