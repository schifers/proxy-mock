package br.com.schifers.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
    ITest test;

    public ProxyHandler(ITest test) {
        this.test = test;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] args) throws Throwable {
        System.out.println("Test");
        System.out.println(method.getReturnType());
        return 1;
    }
}
