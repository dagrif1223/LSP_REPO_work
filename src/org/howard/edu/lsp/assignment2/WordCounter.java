/**
 *  Name: Devin Griffin
 */
package org.howard.edu.lsp.assignment2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        // Path to the text file
        String filePath = "src/org/howard/edu/lsp/assignment2/words.txt";

        // Create a HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line
                String[] words = line.split("[^a-zA-Z']+"); // Split by non-letter characters
                for (String word : words) {
                    // Further split contractions at apostrophes
                    String[] parts = word.split("'");

                    for (String part : parts) {
                        part = part.toLowerCase(); // Convert to lowercase

                        if (part.length() > 3) { // Ignore trivial words
                            // Increment the word count in the map
                            wordCountMap.put(part, wordCountMap.getOrDefault(part, 0) + 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display the word counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

