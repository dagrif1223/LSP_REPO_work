package org.howard.edu.lsp.midterm.question2;

/**
 * A driver class to demonstrate the functionality of the Calculator utility class.
 */
public class CalculatorDriver {
    public static void main(String[] args) {
        // Demonstrate sum of two integers
        System.out.println(Calculator.sum(5, 10));            // Output: 15 (sum of two integers)

        // Demonstrate sum of two doubles
        System.out.println(Calculator.sum(3.5, 7.8));        // Output: 11.3 (sum of two doubles)

        // Demonstrate sum of an array of integers
        System.out.println(Calculator.sum(new int[]{1, 2, 3, 4, 5})); // Output: 15 (sum of array of integers)
    }
}
