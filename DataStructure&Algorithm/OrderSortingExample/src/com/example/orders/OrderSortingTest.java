package com.example.orders;

public class OrderSortingTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 150.75),
            new Order("O003", "Charlie", 300.00),
            new Order("O004", "David", 100.25),
            new Order("O005", "Eve", 200.00)
        };

        // Bubble Sort test
        System.out.println("Before Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        Sorting.bubbleSort(orders);

        System.out.println("After Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Reset orders array for Quick Sort test
        orders = new Order[]{
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 150.75),
            new Order("O003", "Charlie", 300.00),
            new Order("O004", "David", 100.25),
            new Order("O005", "Eve", 200.00)
        };

        // Quick Sort test
        System.out.println("Before Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        Sorting.quickSort(orders, 0, orders.length - 1);

        System.out.println("After Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
