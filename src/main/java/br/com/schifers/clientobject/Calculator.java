package br.com.schifers.clientobject;

import br.com.schifers.realobject.IAddition;

public class Calculator {
    private IAddition addition;

    public Calculator(IAddition addition) {
        this.addition = addition;
    }

    public int calculate(int a, int b) {
        return addition.sum(a, b);
    }
}
