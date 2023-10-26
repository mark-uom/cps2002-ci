package org.uom.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    Calculator calc;
    ArrayList<Integer> numbers;

    @BeforeEach
    void beforeEach() {
        calc = new Calculator();
        numbers = new ArrayList<>();
    }

    @DisplayName("Check if an empty array make 0.")
    @Test
    void testAddEmptyArray() {
        assertEquals(0, calc.add(numbers));
    }

    @DisplayName("Check if an 5 and 2 makes 7.")
    @Test
    void testAddPositiveNumbers() {
        numbers.add(5);
        numbers.add(2);

        assertEquals(7, calc.add(numbers));
    }

    @DisplayName("Check if 15 and -2 make 13.")
    @Test
    void testAddNegativeNumber() {
        numbers.add(15);
        numbers.add(-2);

        assertEquals(13, calc.add(numbers));
    }

    @Test
    void testReminder(){
        assertEquals(2, calc.reminder(5,3));
        assertEquals(1,calc.reminder(10,9));
        assertEquals(4, calc.reminder(10,6));
        assertEquals(0,calc.reminder(10,5));
    }
}
