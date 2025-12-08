package com.example.CollectionFramework.listExample;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListWithUserInput {

    public  static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();

        while(true){
            System.out.println("=======================ArrayList Menu======================");
            System.out.println("1. Add");
            System.out.println("2. delete");
            System.out.println("3. Search");
            System.out.println("4. display");
            System.out.println("5. Merge another ArrayList");
            System.out.println("6. exit");
            System.out.println("Enter choice Element");
            int n= sc.nextInt();
            sc.nextLine();
            switch (n){

                case 1:
                    //Add
                    System.out.println("====================Add Element======================");
                    //list.add(sc.nextLine());
                    ArrayList<String> addElmt=new ArrayList<>();
                    System.out.println("Enter Add Element ");
                    int ad=sc.nextInt();
                    sc.nextLine();
                    for (int i=1;i<=ad;i++){
                        System.out.println(" Add Element "+i+ "");
                        addElmt.add(sc.nextLine());
                    }
                    list.addAll(addElmt);



                    break;
                case 2:
                    //Delete
                    System.out.println("=====================Delete Element==================");
                    System.out.println("Enter Delete Element");
                    list.remove(sc.nextLine());
                    System.out.println( "Element Delete Successfully");
                    System.out.println("\n Remaning element "+list);
                    break;
                case 3:
                    //search
                    System.out.println("================Search Element=======================");
                    System.out.println("Enter Search Element");
                    System.out.println(list.contains(sc.nextLine())?"Found!":"not Found");

                   // System.out.println("find the Element Number : "+list );
                    break;
                case 4:
                    //display
                    System.out.println("display Element\n"+list);
                    break;
                    
                case 5:
                    //merge
                    System.out.println("==============merge to element Element=============---");
                    ArrayList<String> extra=new ArrayList<>();
                    int ex= sc.nextInt();
                    sc.nextLine();
                    for (int i=1; i<=ex;i++){
                        System.out.println("Enter New Element " +i+ "");
                        extra.add(sc.nextLine());
                    }
                    list.addAll(extra);
                    break;
                case 6:
                    //exit
                    System.out.println("Exits");

            }




        }
    }
}
