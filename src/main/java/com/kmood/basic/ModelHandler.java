package com.kmood.basic;

/**
 * @Auther: SunBC
 * @Date: 2019/6/18 11:01
 * @Description:
 */
public interface ModelHandler {
     void VerifyModel(String xmlPath) throws Exception;
     String ConverToFreemaker(String xmlPath,String ftlOutputPath)throws Exception;
     void XmlPlaceHolderHandler(String xmlPath) throws Exception;
}
