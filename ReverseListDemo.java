package com.example.Anudip_6LabQuestion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create a List of Strings
        List<String> list = new ArrayList<>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String str = sc.nextLine();
            list.add(str);
        }

        // Display original list
        System.out.println("\nOriginal List: " + list);

        // Step 2: Reverse the list
        Collections.reverse(list);

        // Display reversed list
        System.out.println("Reversed List: " + list);

        sc.close();
    }
}
