package org.uom.calculator;

import java.util.ArrayList;

public class Calculator {
    public int add(ArrayList<Integer> x) {

        int aux = 0;
        for (Integer i : x) {
            aux += i;
        }
        return aux;
    }

    public int reminder(int x, int y) {return x % y;}

    public int times(int x, int y) {
        return x*y;
    }
}
