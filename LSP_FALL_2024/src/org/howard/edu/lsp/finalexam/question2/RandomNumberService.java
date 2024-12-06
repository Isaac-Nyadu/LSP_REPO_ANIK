/**
*  Name: Isaac Nyadu Adjei
*/

package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service class that returns a positive integer using a selected random number strategy.
 */
public class RandomNumberService {
    private static RandomNumberService instance = null;
    private RandomNumStrategy strategy;

    /**
     * Private constructor to prevent instantiation.
     */
    private RandomNumberService() {}

    /**
     * Retrieves the single instance of RandomNumberService.
     * @return the singleton instance
     */
    public static synchronized RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Set the random number generation strategy at runtime.
     * @param strategy a concrete implementation of RandomNumStrategy
     */
    public void setStrategy(RandomNumStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Get a random positive integer using the current strategy.
     * @return a positive integer
     * @throws IllegalStateException if no strategy is set
     */
    public int getRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("No random number strategy has been set!");
        }
        return strategy.generate();
    }
}
