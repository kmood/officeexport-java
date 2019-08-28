package com.kmood.basic;


public interface ModelHandler {
     String  VerifyModel(String xmlPath,String ftlOutputPath) throws Exception;
     String ConverToFreemaker(String ftlOutputPath)throws Exception;
     void XmlPlaceHolderHandler(String xmlPath) throws Exception;
}
