package com.example.Anudip_7LabQuestion;
import java.util.HashSet;
import java.util.Set;

public class UnionSetDemo {
    public static void main(String[] args) {
        // Step 1: Create two sets
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");

        Set<String> set2 = new HashSet<>();
        set2.add("cherry");
        set2.add("date");
        set2.add("fig");

        // Step 2: Create union set
        Set<String> unionSet = new HashSet<>(set1); // copy all elements of set1
        unionSet.addAll(set2); // add all elements of set2

        // Step 3: Display the union set
        System.out.println("Union of Set1 and Set2: " + unionSet);

        // Step 4: Check if unionSet is a subset of set1
        if (set1.containsAll(unionSet)) {
            System.out.println("Union set is a subset of Set1.");
        } else {
            System.out.println("Union set is NOT a subset of Set1.");
        }
    }
}
