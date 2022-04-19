package br.com.schifers;

import br.com.schifers.clientobject.Calculator;
import br.com.schifers.mock.AdditionMock;
import br.com.schifers.proxy.AdditionProxy;
import br.com.schifers.realobject.Addition;
import br.com.schifers.realobject.IOperation;
import br.com.schifers.stub.AdditionStub;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        AdditionStub additionStub = new AdditionStub();
        AdditionMock additionMock = new AdditionMock();
        Addition additionReal = new Addition();

        // Real execution
        Calculator realCalculator = new Calculator(new AdditionProxy(additionReal));

        int sum2 = realCalculator.calculate(10, 20);

        System.out.println();
        System.out.println("Real (expected the real sum)");
        System.out.println("a + b = " + sum2);

        // Stage 1: Proxy pattern stubbing
        Calculator stubbedCalculator = new Calculator(new AdditionProxy(additionStub));

        int sum1 = stubbedCalculator.calculate(10, 10);

        System.out.println();
        System.out.println("Stage 1: Stubbed (expected 10 as result)");
        System.out.println("a + b = " + sum1);

        // Stage 2: Java proxy usage
        InvocationHandler handler = (proxy, method, args1) -> additionStub.execute((Integer) args1[0], (Integer) args1[1]);

        Calculator proxiedCalculator = new Calculator((IOperation) Proxy.newProxyInstance(additionStub.getClass().getClassLoader(), new Class[]{IOperation.class}, handler));

        int sum3 = proxiedCalculator.calculate(10, 20);

        System.out.println();
        System.out.println("Stage 2: Java proxy (expected 10 as result)");
        System.out.println("a + b = " + sum3);

        // Stage 3: Mock usage
        InvocationHandler mockHandler = (proxy, method, args1) -> additionMock.execute((Integer) args1[0], (Integer) args1[1]);

        Calculator mockedCalculator = new Calculator((IOperation) Proxy.newProxyInstance(additionMock.getClass().getClassLoader(), new Class[]{IOperation.class}, mockHandler));

        int sum4 = mockedCalculator.calculate(10, 20);

        System.out.println();
        System.out.println("Stage 3: Using a mock (expected 15 as result)");
        System.out.println("a + b = " + sum4);
        System.out.println("expected calls: " + additionMock.getTimesCalled("execute"));
    }
}
