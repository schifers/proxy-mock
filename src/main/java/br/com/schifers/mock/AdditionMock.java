package br.com.schifers.mock;

import br.com.schifers.realobject.IOperation;

import java.util.HashMap;
import java.util.Map;

public class AdditionMock implements IOperation {
    Map<String, Integer> expectations;

    @Override
    public int execute(int a, int b) {
        addExpectation("execute");
        return 15;
    }

    private void addExpectation(String method) {
        if (expectations == null) {
            expectations = new HashMap<>();
        }

        if (expectations.containsKey(method)) {
            Integer count = expectations.get(method) + 1;
            expectations.put(method, count);
        } else {
            expectations.put(method, 1);
        }
    }

    public Integer getTimesCalled(String method) {
        return expectations.get(method);
    }
}
