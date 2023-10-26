package org.uom.calculator;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int reminder(int x, int y) {return x % y;}

    public int times(int x, int y) {
        return x*y;
    }

    public int max(int[] array){
        if (array.length == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;

        for (int j : array) {
            if (j >= max) {
                max = j;
            }
        }

        return max;
    }
}
