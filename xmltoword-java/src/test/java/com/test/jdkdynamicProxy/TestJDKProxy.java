package com.test.jdkdynamicProxy;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: SunBC
 * @Date: 2019/4/10 08:42
 * @Description:
 */
public class TestJDKProxy implements InvocationHandler {

    private  Object target;
    public TestJDKProxy(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(target,args);
    }
}
