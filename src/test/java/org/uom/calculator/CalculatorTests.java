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

}
