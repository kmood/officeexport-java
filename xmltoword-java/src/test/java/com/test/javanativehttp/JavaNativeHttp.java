package com.test.javanativehttp;

import com.test.mybatis.CustomCondition;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Auther: SunBC
 * @Date: 2019/4/29 10:22
 * @Description:
 */
public class JavaNativeHttp {
    @Test
    public void  testHttp(){
        try {
            
            String data = "";
            String hproseUrl = "http://sdk229ws.eucp.b2m.cn:8080/sdkproxy/querybalance.action?cdkey=9SDK-EMY-0229-JCWUO&password=951040";
            URL url = new URL(hproseUrl);
            URLConnection cn = url.openConnection();
            InputStream inputStream = cn.getInputStream();
            int read = 0;
            byte [] b = new byte [1024];
            while((read = inputStream.read(b)) !=-1){
                data += new String(b,0,read);
            }
            System.out.println(data);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
