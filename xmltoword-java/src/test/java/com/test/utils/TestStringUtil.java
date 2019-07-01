package com.test.utils;

import com.core.utils.StringUtil;
import org.junit.Test;

/**
 * @Auther: SunBC
 * @Date: 2019/7/1 13:00
 * @Description:
 */
public class TestStringUtil {
    @Test
    public void testSubstringBeforeAfterSize(){
        System.out.println(StringUtil.substringBeforeAfterSize("123456789",0,5));
        System.out.println(StringUtil.substringBeforeAfterSize("123456789",4,5));
        System.out.println(StringUtil.substringBeforeAfterSize("123456789",5,5));
        System.out.println(StringUtil.substringBeforeAfterSize("123456789123",6,5));
        System.out.println(StringUtil.substringBeforeAfterSize("123456789123",8,5));
        System.out.println(StringUtil.substringBeforeAfterSize("123456789",9,5));
        System.out.println(StringUtil.substringBeforeAfterSize("123456789",5,10));

    }

}
