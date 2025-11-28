package com.example.Anudip_5LabQuestion;
class AverageThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double avg = sum / 10.0;
        System.out.println("Average of first 10 numbers = " + avg);
    }
}

class SquareThread extends Thread {
    int arr[] = {1, 20, 50, 15, 30};

    @Override
    public void run() {
        System.out.println("Square of array elements:");
        for (int n : arr) {
            System.out.println(n + " → " + (n * n));
        }
    }
}

public class testThread {
    public static void main(String[] args) {
        AverageThread t1 = new AverageThread();
        SquareThread t2 = new SquareThread();

        t1.start();   // Run t1 first
        try {
            t1.join();  // Wait until t1 finishes
        } catch (Exception e) {}

        t2.start();   // Then run t2
    }
}
