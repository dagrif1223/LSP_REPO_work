package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program demonstrating the use of RandomNumberService with different strategies.
 */
public class RandomNumberClient {
    /**
     * Main method to run the client program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Use Java's built-in random number generator
        service.setStrategy(new JavaRandomStrategy());
        System.out.println("Using Java's Random:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Random number: " + service.getRandomNumber());
        }

        System.out.println();

        // Switch to custom LCG algorithm
        service.setStrategy(new LCGRandomStrategy());
        System.out.println("Using LCG Algorithm:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Random number: " + service.getRandomNumber());
        }
    }
}
