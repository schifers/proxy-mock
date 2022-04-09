package br.com.schifers.realobject;

public class Multiplication implements IOperation {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
