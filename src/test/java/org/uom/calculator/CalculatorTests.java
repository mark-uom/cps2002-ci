package org.uom.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    Calculator calc;

    @BeforeEach
    void beforeEach() {
        calc = new Calculator();
    }

    @DisplayName("Check if 2 and 3 make 5.")
    @Test
    void testAdd() {
        assertEquals(5, calc.add(2,3));
    }

    @DisplayName("Check if 5 times 3 make 15.")
    @Test
    void testTimes() {
        assertEquals(15, calc.times(5,3));
    }

    @DisplayName("Check if 15 and -2 make 13.")
    @Test
    void testAddNegativeNumber() {
        assertEquals(13, calc.add(15,-2));
    }

    @Test
    void testAddStringParameter(){ assertEquals(16, calc.add("13,4,-3,2"));}
    
    @Test
    void testReminder(){
        assertEquals(2, calc.reminder(5,3));
        assertEquals(1,calc.reminder(10,9));
        assertEquals(4, calc.reminder(10,6));
        assertEquals(0,calc.reminder(10,5));
    }
}
