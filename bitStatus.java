package com.example.Anudip_2LabQuestion;

import java.util.Scanner;

public class bitStatus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  user input first number
        System.out.println("Enter first Number");
        int num = sc.nextInt();
        // user input bit position
        System.out.println("Enter bit position");
        int n = sc.nextInt();
        /*
         * If result is 1 => nth bit was 1 (SET)
         * If result is 0 => nth bit was 0 (NOT SET)
         */
        int bitStatus = (num >> n) & 1;

        // Checking the extracted bit using if-else
        if (bitStatus == 1) {
            System.out.println("The " + n + "th bit is SET (1)");
        } else {
            System.out.println("The " + n + "th bit is NOT SET (0)");
        }
    }
}