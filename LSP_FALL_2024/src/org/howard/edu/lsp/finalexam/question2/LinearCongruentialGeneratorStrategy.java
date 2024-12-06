/**
*  Name: Isaac Nyadu Adjei
*/

package org.howard.edu.lsp.finalexam.question2;

/**
 * A strategy implementation that uses a simple Linear Congruential Generator (LCG) algorithm.
 * Formula: X_{n+1} = (aX_n + c) mod m
 * Here I will choose:
 * a = 1664525
 * c = 1013904223
 * m = 2^31
 * This is a common set of parameters used by some LCG implementations. From what I learnt online and from the Java Book "Thiink Positive Java" 
 */
public class LinearCongruentialGeneratorStrategy implements RandomNumStrategy {
    private long seed;
    private final long a = 1664525;
    private final long c = 1013904223;
    private final long m = (long) Math.pow(2, 31);

    /**
     * Default constructor with a default seed.
     */
    public LinearCongruentialGeneratorStrategy() {
        // We can initialize the seed using system time.
        this.seed = System.currentTimeMillis() & 0x7fffffff; 
    }

    /**
     * Generate a random positive integer using LCG algorithm.
     * @return a positive integer
     */
    @Override
    public int generate() {
        seed = (a * seed + c) % m;
        // The result will be a positive integer (since mod m ensures it is within 0 to m-1)
        // Ensure positivity by adding 1 if you wish to avoid zero, though not strictly required.
        return (int) seed;
    }
}
