package com.example.Anudip_2LabQuestion;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        // input user first number
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        //input user second number
        System.out.println("Enter Second number");
        int b=sc.nextInt();

        // Ternary operator
        int max = (a > b) ? a : b;
        System.out.println("The Maximum Number is" +max);

    }
}
