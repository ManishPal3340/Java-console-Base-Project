package com.example.Anudip_LabQuestion;

import java.util.Scanner;

public class LeapYear {
    public static  void main(String args[]){
        // Create Scanner object to take input from user
        Scanner sc=new Scanner(System.in);

        // Ask user to enter a year
        System.out.println("Enter year ");
        int year=sc.nextInt();


        // If condition is true → it is a leap year
        if((year %4==0 && year %100!=0)||
                (year % 400==0)){
            System.out.println("This is a Leap year : "+year);

        }else {
            // Otherwise not a leap year
            System.out.println("This is not Leap Year : "+year);

        }

    }
}
