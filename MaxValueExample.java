package com.simple.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MaxValueExample {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(42);
        numbers.add(18);

        // Find the maximum value using streams
        Optional<Integer> max = numbers.stream()
                                       .max(Integer::compareTo);

        // Print the maximum value
        if (max.isPresent()) {
            System.out.println("The maximum value is: " + max.get());
        } else {
            System.out.println("The list is empty.");
        }
    }
}
