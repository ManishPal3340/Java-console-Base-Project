package com.example.Anudip_6LabQuestion;
import java.util.ArrayList;

public class sumEvenNumber {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of integers with predefined values
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(15);

        // Step 2: Calculate sum of even numbers
        int sum = 0;
        for (int num : numbers) {  // advanced for loop
            if (num % 2 == 0) {
                sum += num;
            }
        }

        // Step 3: Display result
        System.out.println("ArrayList: " + numbers);
        System.out.println("Sum of even numbers: " + sum);
    }
}
