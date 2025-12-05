package com.example.Anudip_6LabQuestion;
import java.util.ArrayList;
import java.util.Scanner;

// Step 1: Create Book class
class Book {
    int bookId;
    String bookName;
    String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("------------------------");
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 2: Create ArrayList of Book objects
        ArrayList<Book> books = new ArrayList<>();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Step 3: Take input for each book and add to ArrayList
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Book ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Book Name: ");
            String name = sc.nextLine();
            System.out.print("Author Name: ");
            String author = sc.nextLine();

            books.add(new Book(id, name, author));
        }

        // Step 4: Display all books using advanced for loop
        System.out.println("\n--- Book Details ---");
        for (Book b : books) {
            b.displayBook();
        }

        sc.close();
    }
}
