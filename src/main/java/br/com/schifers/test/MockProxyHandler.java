package br.com.schifers.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MockProxyHandler implements InvocationHandler {
    private Map<String, Object> expectations = new HashMap<>();

    public static ITest createMock() {
        ITest proxy = (ITest) Proxy.newProxyInstance(ITest.class.getClassLoader(), new Class<?>[]{ITest.class}, mockProxyHandler);
        return proxy;
    }

    public static void mockResult(String method, Object result) {
        mockProxyHandler.addExpectation(method, result);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (expectations.containsKey(method.getName())) {
            return expectations.get(method.getName());
        } else {
            throw new Exception("No mock assigned to method");
        }
    }

    public void addExpectation(String method, Object result) {
        expectations.put(method, result);
    }
}
