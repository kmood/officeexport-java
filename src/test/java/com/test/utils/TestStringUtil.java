package com.test.utils;

import com.kmood.utils.StringUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Auther: SunBC
 * @Date: 2019/7/1 13:00
 * @Description: 测试utils
 */
public class TestStringUtil {
    @Test
    public void testSubstringBeforeAfterSize(){
        Assert.assertEquals(StringUtil.substringBeforeAfterSize("123456789",0,5),"12345");
        Assert.assertEquals(StringUtil.substringBeforeAfterSize("123456789",4,5),"123456789");
        Assert.assertEquals(StringUtil.substringBeforeAfterSize("123456789",5,5),"123456789");
        Assert.assertEquals(StringUtil.substringBeforeAfterSize("123456789",6,5),"23456789");
        Assert.assertEquals(StringUtil.substringBeforeAfterSize("123456789123",6,5),"2345678912");
        Assert.assertEquals(StringUtil.substringBeforeAfterSize("123456789123",8,5),"456789123");
        Assert.assertEquals(StringUtil.substringBeforeAfterSize("123456789123",9,5),"56789123");
        Assert.assertEquals(StringUtil.substringBeforeAfterSize("123456789",9,5),"56789");
    }
    @Test
    public void testApi(){
//        System.out.println("0123aaa789aaa".indexOf("aaa"));
        System.out.println("123".substring(0,"123".length()-1));
    }


}
