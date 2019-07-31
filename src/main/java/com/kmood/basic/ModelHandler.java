package com.kmood.basic;


public interface ModelHandler {
     void VerifyModel(String xmlPath) throws Exception;
     String ConverToFreemaker(String xmlPath,String ftlOutputPath)throws Exception;
     void XmlPlaceHolderHandler(String xmlPath) throws Exception;
}
