package com.example.Anudip_5LabQuestion;

class restaurant {
    String orderName;
    boolean orderTakenByWaiter = false;
    boolean orderCooked = false;

    // Waiter will receive the order
    synchronized void foodOrder(String orderName) {
        System.out.println("Waiter received the order: " + orderName);
        this.orderName = orderName;
        orderTakenByWaiter = true;
        notify(); // notify cook to start cooking

        try {
            while (!orderCooked) {
                wait(); // wait until cooking completes
            }
        } catch (Exception e) {}
    }

    // Cook will cook the order
    synchronized void cookedOrder(String orderName) {
        try {
            while (!orderTakenByWaiter) {
                wait(); // wait until waiter receives the order
            }
        } catch (Exception e) {}

        System.out.println("Chef has received the order: " + orderName);
        System.out.println("The cooking is under process...");
        try { Thread.sleep(2000); } catch (Exception e) {}
        System.out.println("Cooking completed!");
        orderCooked = true;
        notify(); // notify customer
    }

    // Customer will receive the food
    synchronized void recivedOrder(String orderName) {
        try {
            while (!orderCooked) {
                wait(); // wait until food is cooked
            }
        } catch (Exception e) {}
        System.out.println("Customer received the order: " + orderName);
    }
}




public class OrderExecution {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();   // one order object
        String order = "Pasta";

        Thread customerThread = new Thread(() -> restaurant.recivedOrder(order), "Customer");
        Thread waiterThread   = new Thread(() -> restaurant.foodOrder(order), "Waiter");
        Thread cookThread     = new Thread(() -> restaurant.cookedOrder(order), "Cook");

        customerThread.start();
        waiterThread.start();
        cookThread.start();
    }
}
