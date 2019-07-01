package com.test.word;

import com.core.word.XmlParserUtils;
import org.junit.Test;

/**
 * @Auther: SunBC
 * @Date: 2019/7/1 12:57
 * @Description:
 */
public class TestXmlParserUtils {

    @Test
    public void testVarifyAll(){
        System.out.println(XmlParserUtils.VarifySyntax("{}[*tets@t* ttttttt8*tttttttttt{}tttttttt {} tttttt*test*   ]"));
        System.out.println(XmlParserUtils.VarifySyntax("{}[*tets@t* t[tttttt8tttttttttt{}tttttttt {} tttttt*test*   ]"));
    }
    @Test
    public  void testBraceTagHandle(){

        String s = XmlParserUtils.BraceTagHandle("<w:t>{{*.**20}}</w:t>");
        String s1 = XmlParserUtils.BraceTagHandle("");
        String s2 = XmlParserUtils.BraceTagHandle(null);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public  void testIfListHandle(){

        String s = XmlParserUtils.ListTagHandle("ttt<#list type=\"list\" content=\" tests as test    \">tttt");
        String s1 = XmlParserUtils.ListTagHandle("");
        String s2 = XmlParserUtils.ListTagHandle(null);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
    @Test
    public  void testIfTagHandle(){

        String s = XmlParserUtils.IfTagHandle("ttt<#if type=\"if\" content=\" (test1)??\">tttt");
        String s1 = XmlParserUtils.IfTagHandle("");
        String s2 = XmlParserUtils.IfTagHandle(null);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
