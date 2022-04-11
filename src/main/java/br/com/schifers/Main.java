package br.com.schifers;

import br.com.schifers.clientobject.Calculator;
import br.com.schifers.proxy.AdditionProxy;
import br.com.schifers.stub.AdditionStub;

public class Main {
    public static void main(String[] args) {
        AdditionStub additionStub = new AdditionStub();

        Calculator stubbedCalculator = new Calculator(new AdditionProxy(additionStub));

        int sum1 = stubbedCalculator.calculate(10, 10);

        System.out.println();
        System.out.println("Mocked: (expected 10 as result)");
        System.out.println("a + b = " + sum1);

        Calculator realCalculator = new Calculator();

        int sum2 = realCalculator.calculate(10, 20);

        System.out.println();
        System.out.println("Real: (expected the real sum)");
        System.out.println("a + b = " + sum2);
    }
}
