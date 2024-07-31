package com.example.ecommerce;

public class EcommerceSearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Table", "Furniture"),
            new Product("P004", "Chair", "Furniture"),
            new Product("P005", "Headphones", "Electronics")
        };

        // Linear search test
        Product foundProduct = Search.linearSearch(products, "Table");
        System.out.println("Linear Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));

        // Binary search test
        foundProduct = Search.binarySearch(products, "Table");
        System.out.println("Binary Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));
    }
}
