package org.howard.edu.lsp.finalexam.question2;

// Sources: https://www.freecodecamp.org/news/a-beginners-guide-to-the-strategy-design-pattern/
//          https://www.tutorialspoint.com/java-program-to-implement-the-linear-congruential-generator-for-pseudo-random-number-generation
/**
 * Singleton service class for generating random numbers using different strategies.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    /**
     * Private constructor to prevent direct instantiation.
     */
    private RandomNumberService() {}

    /**
     * Gets the singleton instance of RandomNumberService.
     *
     * @return The singleton instance of RandomNumberService.
     */
    public static synchronized RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy for random number generation.
     *
     * @param strategy The strategy to be used for generating random numbers.
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the current strategy.
     *
     * @return A random positive integer.
     * @throws IllegalStateException if no strategy has been set.
     */
    public int getRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Random number strategy not set");
        }
        return strategy.generateRandomNumber();
    }
}
