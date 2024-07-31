package com.example.inventory;

public class InventoryTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding products
        Product product1 = new Product("P001", "Product 1", 100, 29.99);
        Product product2 = new Product("P002", "Product 2", 150, 19.99);
        Product product3 = new Product("P003", "Product 3", 200, 39.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Display all products
        System.out.println("All products:");
        inventory.displayProducts();

        // Update product
        product2.setPrice(17.99);
        inventory.updateProduct(product2);

        // Display all products after update
        System.out.println("All products after update:");
        inventory.displayProducts();

        // Delete product
        inventory.deleteProduct("P001");

        // Display all products after deletion
        System.out.println("All products after deletion:");
        inventory.displayProducts();
    }
}
