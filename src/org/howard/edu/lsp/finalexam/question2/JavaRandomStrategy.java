package org.howard.edu.lsp.finalexam.question2;


import java.util.Random; /**
 * Concrete strategy using Java's built-in random number generator.
 */
public class JavaRandomStrategy implements RandomNumberStrategy {
    private Random random = new Random();

    /**
     * Generates a random positive integer using Java's Random class.
     *
     * @return A random positive integer.
     */
    @Override
    public int generateRandomNumber() {
        return Math.abs(random.nextInt());
    }
}
