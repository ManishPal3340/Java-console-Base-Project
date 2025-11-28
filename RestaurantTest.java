package com.example.Anudip_5LabQuestion;

class Restaurant {
    String orderName;
    boolean orderReceivedByWaiter = false;
    boolean orderCooked = false;

    // 1. foodOrder(String orderName) → Waiter will receive the order
    public synchronized void foodOrder(String orderName) {
        System.out.println("Waiter received the order: " + orderName);
        this.orderName = orderName;
        orderReceivedByWaiter = true;
        notify(); // notify cook to cook

        try {
            while (!orderCooked) {
                wait(); // waiter waits till cooking is done
            }
        } catch (Exception e) {}
    }

    // 2. cookedOrder(String orderName) → Chef will cook the food
    public synchronized void cookedOrder(String orderName) {
        try {
            while (!orderReceivedByWaiter) {
                wait(); // wait until waiter receives the order
            }
        } catch (Exception e) {}

        System.out.println("Chef has received the order: " + orderName);
        System.out.println("The cooking is under process...");

        try { Thread.sleep(2000); } catch (Exception e) {}

        System.out.println("Cooking is completed!");
        orderCooked = true;
        notify(); // notify customer
    }

    // 3. recivedOrder(String orderName) → Customer receives the food
    public synchronized void recivedOrder(String orderName) {
        try {
            while (!orderCooked) {
                wait(); // wait until cooking completes
            }
        } catch (Exception e) {}

        System.out.println("Customer received the order: " + orderName);
    }
}

public class RestaurantTest {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        String order = "Pizza";

        Thread customer = new Thread(() -> r.recivedOrder(order), "Customer");
        Thread waiter = new Thread(() -> r.foodOrder(order), "Waiter");
        Thread cook = new Thread(() -> r.cookedOrder(order), "Cook");

        customer.start();
        waiter.start();
        cook.start();
    }
}

