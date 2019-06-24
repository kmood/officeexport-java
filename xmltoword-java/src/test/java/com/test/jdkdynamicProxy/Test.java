package com.test.jdkdynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @Auther: SunBC
 * @Date: 2019/4/10 12:43
 * @Description:
 */
public class Test implements  TestInter{
    public void testMethod(){
        System.out.println("我是测试方法");
    }
    public static void main(String[] args) {
        Test test = new Test();
        TestJDKProxy testJDKProxy = new TestJDKProxy(test);
        TestInter t = (TestInter)Proxy.newProxyInstance(test.getClass().getClassLoader(), test.getClass().getInterfaces(), testJDKProxy);
        Class<? extends TestInter> aClass = t.getClass();
        Class<?>[] interfaces = aClass.getInterfaces();
        System.out.println(interfaces[0].getTypeName());
        t.testMethod();

    }
}
