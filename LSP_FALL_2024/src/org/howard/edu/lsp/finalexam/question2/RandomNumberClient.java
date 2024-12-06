/**
*  Name: Isaac Nyadu Adjei
*/

package org.howard.edu.lsp.finalexam.question2;

/**
 * Client class that demonstrates the use of RandomNumberService with different strategies.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        // Get the single instance of RandomNumberService
        RandomNumberService service = RandomNumberService.getInstance();

        // Use Java built-in random strategy
        service.setStrategy(new JavaBuiltInRandomStrategy());
        int builtInRandomResult = service.getRandomNumber();
        System.out.println("Random number using Java's built-in Random: " + builtInRandomResult);

        // Use LCG strategy
        service.setStrategy(new LinearCongruentialGeneratorStrategy());
        int lcgRandomResult = service.getRandomNumber();
        System.out.println("Random number using Linear Congruential Generator: " + lcgRandomResult);
    }
}
