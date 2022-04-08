package br.com.schifers;

import br.com.schifers.clientobject.Calculator;
import br.com.schifers.proxy.AdditionProxy;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(new AdditionProxy(null));
        int sum = calc.calculate(10, 20);
        System.out.println("a + b = " + sum);
    }
}
