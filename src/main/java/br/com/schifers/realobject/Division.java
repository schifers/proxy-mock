package br.com.schifers.realobject;

public class Division implements IOperation {
    @Override
    public int execute(int a, int b) {
        return a / b;
    }
}
