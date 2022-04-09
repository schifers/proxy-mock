package br.com.schifers.proxy;

import br.com.schifers.realobject.IOperation;

// The proxy in this case is a mocked class

public class AdditionProxy implements IOperation {
    @Override
    public int execute(int a, int b) {
        // In this case, the proxy returns a mocked value
        return 10;
    }
}
