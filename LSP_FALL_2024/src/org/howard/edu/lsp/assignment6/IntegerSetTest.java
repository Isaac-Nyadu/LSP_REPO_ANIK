package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.clear();
        assertEquals(0, set.length());
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        assertEquals(0, set.length());
        set.add(1);
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        assertTrue(set1.equals(set2));

        set1.add(1);
        assertFalse(set1.equals(set2));

        set2.add(1);
        assertTrue(set1.equals(set2));

        set1.add(2);
        set2.add(2);
        assertTrue(set1.equals(set2));

        set2.add(3);
        assertFalse(set1.equals(set2));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        assertFalse(set.contains(1));
        set.add(1);
        assertTrue(set.contains(1));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(3, set.largest());

        set.add(5);
        assertEquals(5, set.largest());

        set.clear();
        assertThrows(IntegerSetException.class, () -> {
            set.largest();
        });
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(4);
        set.add(2);
        set.add(3);
        assertEquals(2, set.smallest());

        set.add(1);
        assertEquals(1, set.smallest());

        set.clear();
        assertThrows(IntegerSetException.class, () -> {
            set.smallest();
        });
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1));
        set.add(1); // Adding duplicate
        assertEquals(1, set.length());
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.remove(1);
        assertFalse(set.contains(1));
        assertEquals(1, set.length());
        set.remove(3); // Removing non-existent element
        assertEquals(1, set.length());
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.union(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
        assertEquals(3, set1.length());
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2));
        assertEquals(1, set1.length());
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(2);
        set2.add(4);
        set1.diff(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(3));
        assertFalse(set1.contains(2));
        assertEquals(2, set1.length());
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet universalSet = new IntegerSet();
        for (int i = 1; i <= 5; i++) {
            universalSet.add(i);
        }
        IntegerSet set = new IntegerSet();
        set.add(2);
        set.add(3);
        set.complement(universalSet);
        assertTrue(set.contains(1));
        assertTrue(set.contains(4));
        assertTrue(set.contains(5));
        assertFalse(set.contains(2));
        assertFalse(set.contains(3));
        assertEquals(3, set.length());
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        assertEquals("[]", set.toString());
        set.add(1);
        set.add(2);
        assertTrue(set.toString().contains("1"));
        assertTrue(set.toString().contains("2"));
    }
}
