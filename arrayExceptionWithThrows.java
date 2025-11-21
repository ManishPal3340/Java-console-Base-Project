package com.example.Anudip_4LabQuestion;

public class arrayExceptionWithThrows {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i <= arr.length; i++) { // <= causes error at i = 5
                System.out.println("Element at index " + i + ": " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }


    }
}
