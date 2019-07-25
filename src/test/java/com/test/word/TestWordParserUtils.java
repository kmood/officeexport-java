package com.test.word;

import com.kmood.word.WordParserUtils;
import org.junit.Test;

/**
 * @Auther: SunBC
 * @Date: 2019/7/1 12:57
 * @Description:
 */
public class TestWordParserUtils {

    @Test
    public void testVarifyAll(){
        System.out.println(WordParserUtils.VarifySyntax("{}[*tets@t* ttttttt8*tttttttttt{}tttttttt {} tttttt*test*   ]"));
        System.out.println(WordParserUtils.VarifySyntax("{}[*tets@t* t[tttttt8tttttttttt{}tttttttt {} tttttt*test*   ]"));
    }
    @Test
    public  void testBraceTagHandle(){

        String s = WordParserUtils.BraceTagHandle("<w:t>{{*.**20}}</w:t>");
        String s1 = WordParserUtils.BraceTagHandle("");
        String s2 = WordParserUtils.BraceTagHandle(null);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public  void testIfListHandle(){

        String s = WordParserUtils.ListTagHandle("ttt<#list type=\"list\" content=\" tests as test    \">tttt");
        String s1 = WordParserUtils.ListTagHandle("");
        String s2 = WordParserUtils.ListTagHandle(null);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
    @Test
    public  void testIfTagHandle(){
        String s = WordParserUtils.IfTagHandle("ttt<#if type=\"if\" content=\" (test1)??\">tttt");
        String s1 = WordParserUtils.IfTagHandle("");
        String s2 = WordParserUtils.IfTagHandle(null);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
