package com.test.word;

import com.core.word.WordXmlModelHandlerImpl;
import org.junit.Test;

/**
 * @Auther: SunBC
 * @Date: 2019/7/1 13:05
 * @Description:
 */
public class TestWordXmlModelHandlerImpl {
    private  static WordXmlModelHandlerImpl w ;
    static {
        w = new WordXmlModelHandlerImpl();
    }
    @Test
    public void TestConverToFreemaker(){
        try {
            w.ConverToFreemaker("C:\\Users\\admin\\Desktop\\ngccoaexport\\附件8-固定资产处置申请表.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void TestXmlPlaceHolderHandler(){
        try {
            w.XmlPlaceHolderHandler("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void TestVerifyModel(){
        try {
            w.VerifyModel("C:\\Users\\admin\\Desktop\\ngccoaexport\\附件8-固定资产处置申请表.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void TestVerifyModelTotal(){
        try {
            w.VerifyModel("");
            w.ConverToFreemaker("");
            w.XmlPlaceHolderHandler("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
