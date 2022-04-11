package br.com.schifers.stub;

import br.com.schifers.realobject.IOperation;

public class AdditionStub implements IOperation {
    @Override
    public int execute(int a, int b) {
        return 10;
    }
}
