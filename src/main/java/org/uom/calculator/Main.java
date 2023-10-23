package org.uom.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        for (int i = 1; i <= 5; i++) {
            System.out.println(c.add(i,i));
        }
    }
}