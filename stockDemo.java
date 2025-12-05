package com.example.Anudip_7LabQuestion;
import java.util.Stack;

public class stockDemo {
    public static void main(String[] args) {
        // Step 1: Create a Stack of integers
        Stack<Integer> stack = new Stack<>();

        // Step 2: Push 10 elements into the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);  // Adds element to the top of the stack
        }

        System.out.println("Stack after pushing 10 elements: " + stack);

        // Step 3: Pop 4 elements from the stack
        for (int i = 1; i <= 4; i++) {
            stack.pop();  // Removes element from the top of the stack
        }

        // Step 4: Display the remaining stack
        System.out.println("Stack after removing 4 elements: " + stack);
    }
}
