package com.simple.examples;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter second number");
		int num2 = scanner.nextInt();
		
		int result = num1 + num2;
		int substarction = num1 - num2;
		int mul = num1 * num2;
		//int divison = num1 / num2;
		if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
		System.out.println("Addition is: " +result);
		System.out.println("Substraction is: " +substarction);
		System.out.println("multiplication is: " +mul);
	//	System.out.println("Division is: " +divison);
		
	}

}
