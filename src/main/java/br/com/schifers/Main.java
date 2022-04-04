package br.com.schifers;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        int sum = addition.sum(10, 20);
        System.out.println("a + b = " + sum);
    }
}
