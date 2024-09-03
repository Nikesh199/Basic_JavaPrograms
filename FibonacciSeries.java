package com.simple.examples;

import java.util.Scanner;

public class FibonacciSeries {
	
	    public static void main(String[] args) {
	        //20int n = 10; // Example input
	        
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the position in the Fibonacci sequence: ");
	        int n = scanner.nextInt();
	        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
	    }

	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}


