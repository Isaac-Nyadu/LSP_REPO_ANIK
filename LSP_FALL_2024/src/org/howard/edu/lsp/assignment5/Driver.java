package org.howard.edu.lsp.assignment5; 

/**
 * Driver class to test the IntegerSet class.
 * Contains the main method.
 * @author Isaac Adjei
 */
public class Driver {
    public static void main(String[] args) {
        // Create two IntegerSet instances
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // Add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Value of Set1 is: " + set1.toString());

        // Add elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Value of Set2 is: " + set2.toString());

        // Test smallest and largest methods
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

        // Test contains method
        System.out.println("Set1 contains 2: " + set1.contains(2));
        System.out.println("Set1 contains 5: " + set1.contains(5));

        // Test equals method
        System.out.println("Set1 equals Set2: " + set1.equals(set2));

        // Test union
        System.out.println("\nUnion of Set1 and Set2");
        System.out.println("Set1 before union: " + set1.toString());
        System.out.println("Set2: " + set2.toString());
        set1.union(set2);
        System.out.println("Set1 after union: " + set1.toString());

        // Reset set1 and set2
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("\nSet1 reset to: " + set1.toString());

        // Test intersection
        System.out.println("\nIntersection of Set1 and Set2");
        set1.intersect(set2);
        System.out.println("Result of intersection: " + set1.toString());

        // Reset set1 and set2
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("\nSet1 reset to: " + set1.toString());

        // Test difference
        System.out.println("\nDifference of Set1 and Set2 (Set1 - Set2)");
        set1.diff(set2);
        System.out.println("Result of difference: " + set1.toString());

        // Test complement
        System.out.println("\nComplement of Set1 in Set2");
        set1.complement(set2);
        System.out.println("Result of complement: " + set1.toString());

        // Test isEmpty
        System.out.println("\nIs Set1 empty? " + set1.isEmpty());
        set1.clear();
        System.out.println("Set1 cleared.");
        System.out.println("Is Set1 empty now? " + set1.isEmpty());
    }
}
