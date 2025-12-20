package collectionFramewokWithExample.QueueExample;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class queuesPriorityQueueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        int choice;

        do {
            System.out.println("\n--- PriorityQueue Operations ---");
            System.out.println("1. Insert element");
            System.out.println("2. Update element");
            System.out.println("3. Delete element");
            System.out.println("4. Merge with another queue");
            System.out.println("5. Display queue");
            System.out.println("6. Peek (smallest element)");
            System.out.println("7. Poll (remove smallest element)");
            System.out.println("8. Size of queue");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Insert
                    System.out.print("============Add element to insert:========================= ");

                    PriorityQueue<Integer> adpq = new PriorityQueue<>();
                    System.out.println("Enter element to insert: ");
                    int element = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i <=element; i++) {
                        System.out.printf("Add element %d\n", i + 1);
                        adpq.add(element);
                    }


                    break;

                case 2: // Update
                    System.out.print("Enter element to update: ");
                    int oldElement = sc.nextInt();
                    if (pq1.remove(oldElement)) {
                        System.out.print("Enter new value: ");
                        int newElement = sc.nextInt();
                        pq1.add(newElement);
                        System.out.println(oldElement + " updated to " + newElement);
                    } else {
                        System.out.println(oldElement + " not found in queue.");
                    }
                    break;

                case 3: // Delete
                    System.out.print("Enter element to delete: ");
                    int delElement = sc.nextInt();
                    if (pq1.remove(delElement)) {
                        System.out.println(delElement + " deleted.");
                    } else {
                        System.out.println(delElement + " not found in queue.");
                    }
                    break;

                case 4: // Merge
                    System.out.print("Enter number of elements for second queue: ");
                    int n = sc.nextInt();
                    System.out.println("Enter " + n + " elements:");
                    for (int i = 0; i < n; i++) {
                        pq2.add(sc.nextInt());
                    }
                    pq1.addAll(pq2);
                    pq2.clear();
                    System.out.println("Queues merged successfully.");
                    break;

                case 5: // Display
                    System.out.println("Current PriorityQueue elements (ascending):");
                    PriorityQueue<Integer> temp = new PriorityQueue<>(pq1);
                    while (!temp.isEmpty()) {
                        System.out.print(temp.poll() + " ");
                    }
                    System.out.println();
                    break;

                case 6: // Peek
                    if (!pq1.isEmpty()) {
                        System.out.println("Smallest element: " + pq1.peek());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 7: // Poll
                    if (!pq1.isEmpty()) {
                        System.out.println("Removed smallest element: " + pq1.poll());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 8: // Size
                    System.out.println("Size of queue: " + pq1.size());
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 9);

        sc.close();
    }
}
