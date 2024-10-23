package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * IntegerSet class that contains only integers.
 * This class provides methods to perform various set operations.
 * @author Isaac Adjei 
 */
public class IntegerSet {
    // Store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<Integer>();
    /**
     * Default Constructor
     *
     */
    
    
    public IntegerSet() {
    }
    
    /**
     * Constructor if you want to pass in already initialized
     * @param set integer set
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the length of the set.
     * @return the number of elements in the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
     * This overrides the equals method from the Object class.
     * @param o the Object to compare with
     * @return true if the sets are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof IntegerSet) {
            IntegerSet otherSet = (IntegerSet) o;
            return set.size() == otherSet.set.size() && set.containsAll(otherSet.set);
        }
        return false;
    }

    /**
     * Returns true if the set contains the value, otherwise false.
     * @param value the value to check
     * @return true if the set contains the value, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest item in the set.
     * @return the largest item in the set, or Integer.MIN_VALUE if the set is empty
     */
    public int largest() {
        if (set.isEmpty()) {
            // Since we cannot throw an exception, we return Integer.MIN_VALUE to indicate the set is empty
            return Integer.MIN_VALUE;
        }
        int max = set.get(0);
        for (int num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Returns the smallest item in the set.
     * @return the smallest item in the set, or Integer.MAX_VALUE if the set is empty
     */
    public int smallest() {
        if (set.isEmpty()) {
            // Since we cannot throw an exception, we return Integer.MAX_VALUE to indicate the set is empty
            return Integer.MAX_VALUE;
        }
        int min = set.get(0);
        for (int num : set) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Adds an item to the set or does nothing if it's already there.
     * @param item the item to add
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set or does nothing if not there.
     * @param item the item to remove
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Set union.
     * @param intSetb the IntegerSet to union with
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Set intersection, all elements in both sets.
     * @param intSetb the IntegerSet to intersect with
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Set difference, i.e., s1 - s2.
     * @param intSetb the IntegerSet to difference with
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Set complement, all elements not in s1.
     * @param intSetb the universal set to complement against
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> tempSet = new ArrayList<Integer>(intSetb.set);
        tempSet.removeAll(set);
        set = tempSet;
    }

    /**
     * Returns true if the set is empty, false otherwise.
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Return String representation of your set.
     * This overrides the toString method from the Object class.
     * @return the String representation of the set
     */
    @Override
    public String toString() {
        return set.toString();
    }
}
