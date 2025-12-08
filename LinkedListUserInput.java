package com.example.CollectionFramework.listExample;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListUserInput {
    public static void  main(String []arg){

        Scanner sc =new Scanner(System.in);
        LinkedList<String> list=new LinkedList<>();

        System.out.println("Enter nuumber of Element");
        int n=sc.nextInt();
        sc.nextLine();

        for (int i=0;i<=n;i++){
            System.out.println("Enter Items " + i + " ");
            String value= sc.nextLine();
            list.add(value);
        }
        System.out.println("Link List " +list);

    }
}
