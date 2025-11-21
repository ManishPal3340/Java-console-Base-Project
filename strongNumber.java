package com.example.Anudip_LabQuestion;

import java.util.Scanner;

public class strongNumber {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Any Number");// take a number to be a user
        int num= sc.nextInt();

        int temp=num,sum=0; //store in original number

        //
        while(num>0){
            int d=num%10;
            int fact=1;


            for(int i=1;i<=d;i++){
                fact=fact*i;

            }
            sum=sum+fact; //Check  if sum equal in original number
                    num=num/10;


        }
        if(sum==temp)
            System.out.println("Stronger Nummber is :" +temp);
        else
            System.out.println(" Not Stronger Nummber is :" +temp);

    }
}
