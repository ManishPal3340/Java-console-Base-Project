package com.example.Anudip_7LabQuestion;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Step 1: Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Step 2: Add elements using add() method
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");

        // Step 3: Display the HashSet
        System.out.println("HashSet elements: " + set);

        // Step 4: Append a new element
        set.add("Grapes");
        System.out.println("After appending 'Grapes': " + set);
    }
}
