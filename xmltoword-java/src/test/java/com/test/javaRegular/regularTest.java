package com.test.javaRegular;

import org.apache.commons.io.output.WriterOutputStream;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.*;

/**
 * @Auther: SunBC
 * @Date: 2019/6/17 16:34
 * @Description:
 */
public class regularTest {
    @Test
    public void strTest(){
        String  test = "<w:t>[</w:t>[ testser<w:t>{</w:t>{<w:t>test</w:t>}}ttsett]]sdfsdfsdf[#<w:t>test</w:t>#]tetetse{{}}sdfsdfs";
//        String s = test.replaceAll("\\[[\\s\\S]*\\[", "\\[[");
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read(new File("C:\\Users\\admin\\Desktop\\ngccoa export\\附件9-低值易耗品购置申请表.xml"));
            Node node = document.selectSingleNode("//w:r[w:t='[']/w:t");
//            String path = node.getPath();
//            System.out.println(path);

//  Element element = DocumentHelper.createElement("#list");
//            OutputFormat format = OutputFormat.createPrettyPrint();
//            XMLWriter writer = new XMLWriter(System.out, format);
//            writer.write( document );
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

//        String s = test.replaceAll("][\\s\\S]*]", "]]");
//        s = test.replaceAll("\\[[\\s\\S]*#", "\\[#");


//        System.out.println(s);
    }
}
