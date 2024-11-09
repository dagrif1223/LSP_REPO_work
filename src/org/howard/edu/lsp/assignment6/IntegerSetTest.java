package org.howard.edu.lsp.assignment6;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class IntegerSetTest {
    private IntegerSet set;

    @Before
    public void setUp() {
        set = new IntegerSet();
    }

    @Test
    @DisplayName("Test for add method")
    public void testAdd() {
        set.add(1);
        assertTrue(set.contains(1));
        assertEquals("[1]", set.toString());

        // Test adding duplicate
        set.add(1);
        assertEquals("[1]", set.toString());
    }

    @Test
    @DisplayName("Test for remove method")
    public void testRemove() {
        set.add(1);
        set.add(2);
        set.remove(1);
        assertFalse(set.contains(1));
        assertTrue(set.contains(2));
    }

    @Test
    @DisplayName("Test for clear method")
    public void testClear() {
        set.add(1);
        set.add(2);
        set.clear();
        assertTrue(set.isEmpty());
        assertEquals(0, set.length());
    }

    @Test
    @DisplayName("Test for length method")
    public void testLength() {
        assertEquals(0, set.length());
        set.add(1);
        assertEquals(1, set.length());
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("test for equals method")
    public void testEquals() {
        IntegerSet set2 = new IntegerSet();
        assertTrue(set.equals(set2)); // empty sets are equal

        set.add(1);
        set.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set.equals(set2)); // order doesn't matter

        set2.add(3);
        assertFalse(set.equals(set2)); // different contents
    }

    @Test
    @DisplayName("Test for contains method")
    public void testContains() {
        assertFalse(set.contains(1));
        set.add(1);
        assertTrue(set.contains(1));
    }

    @Test(expected = IntegerSetException.class)
    @DisplayName("Test for exception handling of largest method")
    public void testLargestEmpty() throws IntegerSetException {
        set.largest();
    }

    @Test
    @DisplayName("Test for largest method")
    public void testLargest() throws IntegerSetException {
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(3, set.largest());
    }

    @Test(expected = IntegerSetException.class)
    @DisplayName("Test for exception handling of smallest method")
    public void testSmallestEmpty() throws IntegerSetException {
        set.smallest();
    }

    @Test
    @DisplayName("Test for smallest method")
    public void testSmallest() throws IntegerSetException {
        set.add(3);
        set.add(1);
        set.add(2);
        assertEquals(1, set.smallest());
    }

    @Test
    @DisplayName("Test case for union method")
    public void testUnion() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set2.add(2);
        set2.add(3);
        set.union(set2);
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
        assertEquals(3, set.length());
    }

    @Test
    @DisplayName("Test for intersect method")
    public void testIntersect() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set2.add(2);
        set2.add(3);

        set.intersect(set2);
        assertFalse(set.contains(1));
        assertTrue(set.contains(2));
        assertFalse(set.contains(3));
        assertEquals(1, set.length());
    }

    @Test
    @DisplayName("Test for diff method")
    public void testDiff() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set2.add(2);
        set2.add(3);

        set.diff(set2);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
        assertFalse(set.contains(3));
        assertEquals(1, set.length());
    }

    @Test
    @DisplayName("Test for complement method")
    public void testComplement() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set2.add(2);
        set2.add(3);
        set.complement(set2);
        assertFalse(set.contains(1));
        assertFalse(set.contains(2));
        assertTrue(set.contains(3));
        assertEquals(1, set.length());
    }

    @Test
    @DisplayName("Test for isEmpty method")
    public void testIsEmpty() {
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("Test for toString method")
    public void testToString() {
        assertEquals("[]", set.toString());
        set.add(1);
        assertEquals("[1]", set.toString());
        set.add(2);
        assertEquals("[1, 2]", set.toString());
    }
}
