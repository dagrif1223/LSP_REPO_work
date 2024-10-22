package org.howard.edu.lsp.assignment5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * A class that implements basic set operations for integers
 */
public class IntegerSet {
    private List<Integer> set = new ArrayList<>();
    public IntegerSet() {}

    /**
     * Constructor creating set from existing ArrayList
     * @param set ArrayList of integers to initialize set with
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /** Removes all elements from the set */
    public void clear() {
        set.clear();
    }

    /**
     * Returns number of elements in set
     * @return size of set
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if two sets are equal (contain same elements)
     * @param o Object to compare with
     * @return true if sets contain same elements, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet other = (IntegerSet) o;
        if (this.length() != other.length()) return false;
        return new HashSet<>(set).equals(new HashSet<>(other.set));
    }

    /**
     * Checks if value exists in set
     * @param value integer to check
     * @return true if value exists, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Finds largest element in set
     * @return largest integer in set
     */
    public int largest() {
        return Collections.max(set);
    }

    /**
     * Finds smallest element in set
     * @return smallest integer in set
     */
    public int smallest() {
        return Collections.min(set);
    }

    /**
     * Adds new element to set if not present
     * @param item integer to add
     */
    public void add(int item) {
        if (!contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes element from set if present
     * @param item integer to remove
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Adds all elements from another set to this set
     * @param intSetb set to union with
     */
    public void union(IntegerSet intSetb) {
        for (Integer item : intSetb.set) {
            add(item);
        }
    }

    /**
     * Keeps only elements present in both sets
     * @param intSetb set to intersect with
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Removes all elements present in other set
     * @param intSetb set to difference with
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Replaces set with elements in other set not in this set
     * @param intSetb set to complement with
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> temp = new ArrayList<>(intSetb.set);
        temp.removeAll(set);
        set = temp;
    }

    /**
     * Checks if set has no elements
     * @return true if set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns string representation of set
     * @return string showing set elements
     */
    @Override
    public String toString() {
        return set.toString();
    }
}