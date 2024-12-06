package org.howard.edu.lsp.finalexam.question2;

/**
 * Concrete strategy using a Linear Congruential Generator algorithm.
 */
public class LCGRandomStrategy implements RandomNumberStrategy {
    private long seed = System.currentTimeMillis();
    private static final long MULTIPLIER = 11035152;
    private static final long INCREMENT = 12345;
    private static final long MODULUS = 1L << 31;

    /**
     * Generates a random positive integer using the LCG algorithm.
     *
     * @return A random positive integer.
     */
    @Override
    public int generateRandomNumber() {
        seed = (MULTIPLIER * seed + INCREMENT) % MODULUS;
        return Math.abs((int) seed);
    }
}
