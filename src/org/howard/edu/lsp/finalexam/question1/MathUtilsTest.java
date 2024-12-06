package org.howard.edu.lsp.finalexam.question1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    // Source: https://www.tutorialspoint.com/junit/junit_using_assertion.htm
    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    // Factorial tests
    @Test
    void factorial_ZeroInput_ReturnsOne() {
        assertEquals(1, mathUtils.factorial(0));
    }

    @Test
    void factorial_PositiveInput_ReturnsCorrectResult() {
        assertEquals(120, mathUtils.factorial(5));
    }

    @Test
    void factorial_LargeInput_ReturnsCorrectResult() {
        assertEquals(3628800, mathUtils.factorial(10));
    }

    @Test
    void factorial_NegativeInput_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1));
    }

    // IsPrime tests
    @Test
    void isPrime_PrimeNumber_ReturnsTrue() {
        assertTrue(mathUtils.isPrime(17));
    }

    @Test
    void isPrime_NonPrimeNumber_ReturnsFalse() {
        assertFalse(mathUtils.isPrime(15));
    }

    @Test
    void isPrime_OneInput_ReturnsFalse() {
        assertFalse(mathUtils.isPrime(1));
    }

    @Test
    void isPrime_NegativeInput_ReturnsFalse() {
        assertFalse(mathUtils.isPrime(-7));
    }

    @Test
    void isPrime_LargePrimeNumber_ReturnsTrue() {
        assertTrue(mathUtils.isPrime(997));
    }

    // GCD tests
    @Test
    void gcd_PositiveInputs_ReturnsCorrectResult() {
        assertEquals(6, mathUtils.gcd(54, 24));
    }

    @Test
    void gcd_NegativeInputs_ReturnsPositiveResult() {
        assertEquals(6, mathUtils.gcd(-54, -24));
    }

    @Test
    void gcd_OneZeroInput_ReturnsNonZeroInput() {
        assertEquals(5, mathUtils.gcd(0, 5));
        assertEquals(5, mathUtils.gcd(5, 0));
    }

    @Test
    void gcd_BothZeroInputs_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
    }

    @Test
    void gcd_CoprimeNumbers_ReturnsOne() {
        assertEquals(1, mathUtils.gcd(17, 23));
    }
}