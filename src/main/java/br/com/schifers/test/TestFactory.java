package br.com.schifers.test;

import java.lang.reflect.Proxy;

public class TestFactory {
    public static ITest getInstance() {
        return (ITest) Proxy.newProxyInstance(ITest.class.getClassLoader(), new Class<?>[]{ITest.class}, new ProxyHandler(new TestImpl()));
    }

    public static void main(String[] args) {
        ITest proxy = getInstance();
        System.out.println("" + proxy.getInt());
    }
}
