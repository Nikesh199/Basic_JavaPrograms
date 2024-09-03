package com.simple.examples;

import java.util.Scanner;

public class PrimeNo {

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number to check if it is prime: ");
	        
	        int number = scanner.nextInt();

	        System.out.println(number + " is prime: " + isPrime(number));

	        scanner.close();
	    }

	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

