package com.core.word;

/**
 * @Auther: SunBC
 * @Date: 2019/6/18 11:01
 * @Description:
 */
public interface XmlModelHandler {
    public void VerifyModel(String xmlPath) throws Exception;
    public String ConverToFreemaker(String xmlPath,String ftlOutputPath)throws Exception;
    public void XmlPlaceHolderHandler(String xmlPath) throws Exception;
}
