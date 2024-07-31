package com.example.ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class Search {
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.getProductName().equals(targetName)) {
                return product;
            }
        }
        return null; // Product not found
    }

    public static Product binarySearch(Product[] products, String targetName) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName)); // Sort the array

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareTo(targetName);

            if (comparison == 0) {
                return products[mid]; // Product found
            }
            if (comparison < 0) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }

        return null; // Product not found
    }
}
