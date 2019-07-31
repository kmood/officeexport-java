package com.kmood.word;

public class WordModelParser {
    public static String Compile(String filePath,String ActualModelPath)throws Exception{
        WordModelHandlerImpl wordXmlModelHandler = new WordModelHandlerImpl();
        String path = wordXmlModelHandler.WordXmlModelHandle(filePath,ActualModelPath);
        return path;
    }


}
