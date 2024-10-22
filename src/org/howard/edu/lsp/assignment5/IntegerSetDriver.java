package org.howard.edu.lsp.assignment5;
/**
 * A driver class to demonstrate the functionality of the IntegerSet class.
 */
public class IntegerSetDriver {
        public static void main(String[] args) {
            // Test basic operations
            IntegerSet set1 = new IntegerSet();
            set1.add(1);
            set1.add(2);
            set1.add(3);
            System.out.println("Set1 after adding 1,2,3: " + set1);
            System.out.println("Length of Set1: " + set1.length());
            System.out.println("Smallest in Set1: " + set1.smallest());
            System.out.println("Largest in Set1: " + set1.largest());
            System.out.println("Set1 contains 2: " + set1.contains(2));

            // Test remove
            set1.remove(2);
            System.out.println("Set1 after removing 2: " + set1);

            // Test clear
            set1.clear();
            System.out.println("Set1 after clear: " + set1);
            System.out.println("Is Set1 empty? " + set1.isEmpty());

            // Test set operations
            IntegerSet set2 = new IntegerSet();
            set2.add(1);
            set2.add(2);

            IntegerSet set3 = new IntegerSet();
            set3.add(2);
            set3.add(3);

            System.out.println("\nSet2: " + set2);
            System.out.println("Set3: " + set3);

            // Test union
            set2.union(set3);
            System.out.println("Union of Set2 and Set3: " + set2);

            // Reset set2
            set2.clear();
            set2.add(1);
            set2.add(2);

            // Test intersection
            set2.intersect(set3);
            System.out.println("Intersection of Set2 and Set3: " + set2);

            // Reset set2
            set2.clear();
            set2.add(1);
            set2.add(2);

            // Test difference
            set2.diff(set3);
            System.out.println("Difference of Set2 and Set3: " + set2);

            // Reset set2
            set2.clear();
            set2.add(1);
            set2.add(2);

            // Test complement
            set2.complement(set3);
            System.out.println("Complement of Set2 with respect to Set3: " + set2);

            // Test equals
            IntegerSet set4 = new IntegerSet();
            set4.add(1);
            set4.add(2);

            IntegerSet set5 = new IntegerSet();
            set5.add(2);
            set5.add(1);

            System.out.println("\nSet4: " + set4);
            System.out.println("Set5: " + set5);
            System.out.println("Set4 equals Set5? " + set4.equals(set5));
        }
    }

