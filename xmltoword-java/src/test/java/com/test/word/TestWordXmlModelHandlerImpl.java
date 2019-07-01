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
            w.ConverToFreemaker("");
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
            w.VerifyModel("");
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
