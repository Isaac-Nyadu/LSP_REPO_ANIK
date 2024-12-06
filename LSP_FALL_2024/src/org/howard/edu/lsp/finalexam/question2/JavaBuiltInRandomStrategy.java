/**
*  Name: Isaac Nyadu Adjei
*/

package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * A strategy implementation that uses Java's built-in Random class.
 */
public class JavaBuiltInRandomStrategy implements RandomNumStrategy {
    private Random random;

    /**
     * Constructor initializes the Java built-in random generator.
     */
    public JavaBuiltInRandomStrategy() {
        this.random = new Random();
    }

    /**
     * Generate a random positive integer using Java's built-in Random.
     * @return a positive integer
     */
    @Override
    public int generate() {
        // Bound it by a large number and ensure positivity.
        return 1 + random.nextInt(Integer.MAX_VALUE - 1);
    }
}
