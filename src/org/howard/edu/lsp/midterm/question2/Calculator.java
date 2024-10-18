package org.howard.edu.lsp.midterm.question2;
/**
 * A utility class providing methods for summing numbers.
 */
public class Calculator {

    /**
     * Calculates the sum of two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Calculates the sum of two double values.
     *
     * @param a The first double value.
     * @param b The second double value.
     * @return The sum of the two double values.
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Calculates the sum of all elements in an array of integers.
     *
     * @param numbers An array of integers to sum.
     * @return The sum of all elements in the array.
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}