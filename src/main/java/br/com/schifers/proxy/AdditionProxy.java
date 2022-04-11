package br.com.schifers.proxy;

import br.com.schifers.realobject.Addition;
import br.com.schifers.realobject.IOperation;

public class AdditionProxy implements IOperation {
    private IOperation addition;

    public AdditionProxy(IOperation addition) {
        this.addition = addition;
    }

    @Override
    public int execute(int a, int b) {
        if (addition == null) {
            addition = new Addition();
        }
        return addition.execute(a, b);
    }
}
