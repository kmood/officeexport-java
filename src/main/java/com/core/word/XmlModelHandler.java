package com.core.word;

/**
 * @Auther: SunBC
 * @Date: 2019/6/18 11:01
 * @Description:
 */
public interface XmlModelHandler {
     void VerifyModel(String xmlPath) throws Exception;
     String ConverToFreemaker(String xmlPath,String ftlOutputPath)throws Exception;
     void XmlPlaceHolderHandler(String xmlPath) throws Exception;
}
