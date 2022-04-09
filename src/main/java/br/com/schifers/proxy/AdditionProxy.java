package br.com.schifers.proxy;

import br.com.schifers.realobject.Addition;
import br.com.schifers.realobject.IAddition;

// The proxy in this case is a mocked class

public class AdditionProxy implements IAddition {
    @Override
    public int sum(int a, int b) {
        // In this case, the proxy returns a mocked value
        return 10;
    }
}
