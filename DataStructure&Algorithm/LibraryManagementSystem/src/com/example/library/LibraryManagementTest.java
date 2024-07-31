package com.example.library;

import java.util.Arrays;
import java.util.List;

public class LibraryManagementTest {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
                new Book("B002", "To Kill a Mockingbird", "Harper Lee"),
                new Book("B003", "1984", "George Orwell"),
                new Book("B004", "Pride and Prejudice", "Jane Austen")
        );

        Library library = new Library(books);

        // Linear search
        System.out.println("Linear Search:");
        Book foundBook = library.linearSearchByTitle("1984");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Binary search
        System.out.println("\nBinary Search:");
        foundBook = library.binarySearchByTitle("Pride and Prejudice");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}
