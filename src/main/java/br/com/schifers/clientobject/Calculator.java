package br.com.schifers.clientobject;

import br.com.schifers.realobject.IOperation;

public class Calculator {
    private final IOperation operation;

    public Calculator(IOperation operation) {
        this.operation = operation;
    }

    public int calculate(int a, int b) {
        return operation.execute(a, b);
    }
}
