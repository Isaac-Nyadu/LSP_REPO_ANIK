/**
*  Name: Isaac Nyadu Adjei
*/

package org.howard.edu.lsp.finalexam.question1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MathUtilsTest {
    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    // -------------------------
    // Tests for factorial(int n)
    // -------------------------

    /**
     * Test factorial with a base case: factorial(0) = 1.
     */
    @Test
    public void testFactorial_WhenInputIsZero_ShouldReturnOne() {
        assertEquals(1, mathUtils.factorial(0));
    }

    /**
     * Test factorial with a small positive integer: factorial(5) = 120.
     */
    @Test
    public void testFactorial_WhenInputIsFive_ShouldReturn120() {
        assertEquals(120, mathUtils.factorial(5));
    }

    /**
     * Test factorial with another base case: factorial(1) = 1.
     */
    @Test
    public void testFactorial_WhenInputIsOne_ShouldReturnOne() {
        assertEquals(1, mathUtils.factorial(1));
    }

    /**
     * Test factorial with a larger integer (e.g., 10) to ensure correctness.
     */
    @Test
    public void testFactorial_WhenInputIsTen_ShouldReturn3628800() {
        assertEquals(3628800, mathUtils.factorial(10));
    }

    /**
     * Test factorial with a negative integer should throw IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFactorial_WhenInputIsNegative_ShouldThrowException() {
        mathUtils.factorial(-3);
    }

    // -------------------------
    // Tests for isPrime(int n)
    // -------------------------

    /**
     * Test isPrime with a prime number: isPrime(2) = true.
     */
    @Test
    public void testIsPrime_WhenInputIsTwo_ShouldReturnTrue() {
        assertTrue(mathUtils.isPrime(2));
    }

    /**
     * Test isPrime with a non-prime number: isPrime(4) = false.
     */
    @Test
    public void testIsPrime_WhenInputIsFour_ShouldReturnFalse() {
        assertFalse(mathUtils.isPrime(4));
    }

    /**
     * Test isPrime with 1, which is not prime: isPrime(1) = false.
     */
    @Test
    public void testIsPrime_WhenInputIsOne_ShouldReturnFalse() {
        assertFalse(mathUtils.isPrime(1));
    }

    /**
     * Test isPrime with a larger prime number (I chose 17).
     */
    @Test
    public void testIsPrime_WhenInputIsSeventeen_ShouldReturnTrue() {
        assertTrue(mathUtils.isPrime(17));
    }

    /**
     * Test isPrime with a negative number, which should return false.
     */
    @Test
    public void testIsPrime_WhenInputIsNegative_ShouldReturnFalse() {
        assertFalse(mathUtils.isPrime(-5));
    }

    // -------------------------
    // Tests for gcd(int a, int b)
    // -------------------------

    /**
     * Test gcd with two positive integers: gcd(48, 18) = 6.
     */
    @Test
    public void testGcd_WhenInputsAre48And18_ShouldReturnSix() {
        assertEquals(6, mathUtils.gcd(48, 18));
    }

    /**
     * Test gcd with zero and a positive number: gcd(0, 5) = 5.
     */
    @Test
    public void testGcd_WhenInputIsZeroAndFive_ShouldReturnFive() {
        assertEquals(5, mathUtils.gcd(0, 5));
    }

    /**
     * Test gcd with both inputs zero should throw IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGcd_WhenBothInputsAreZero_ShouldThrowException() {
        mathUtils.gcd(0, 0);
    }

    /**
     * Test gcd with negative integers: gcd(-24, -6) = 6 (absolute values considered).
     */
    @Test
    public void testGcd_WhenInputsAreNegative_ShouldReturnPositiveGcd() {
        assertEquals(6, mathUtils.gcd(-24, -6));
    }

    /**
     * Test gcd with one input negative and the other positive: gcd(-9, 3) = 3.
     */
    @Test
    public void testGcd_WhenInputIsNegativeAndPositive_ShouldReturnPositiveGcd() {
        assertEquals(3, mathUtils.gcd(-9, 3));
    }
}


