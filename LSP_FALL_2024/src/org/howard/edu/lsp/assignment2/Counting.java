/**
*  Name: Isaac Nyadu Adjei
*/
package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Counting {

    public static void main(String[] args) {
        // HashMap to store the word count
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        try {
            // Using relative path to read the file
            BufferedReader reader = new BufferedReader(new FileReader("src/org/howard/edu/lsp/assignment2/word.txt"));
            String line;
            
            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Normalizing lines into words. 
                String[] words = line.toLowerCase().split("[^a-zA-Z]+");

                // Count the valid words (ignore trivial words <= 3 letters)
                for (String word : words) {
                    if (word.length() > 3) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
            reader.close();  // Close the file reader

            System.out.println("\nWord Frequency Count:");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            
        } catch (IOException e) {
            // Handle exceptions related to file reading
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
