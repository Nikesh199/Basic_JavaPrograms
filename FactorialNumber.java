package com.simple.examples;

public class FactorialNumber {

	public static void main(String args[])
	{
		int number = 15;
		
		System.out.println("Factorial no  " +number+ " is : "+factorial(number));
	}
	
	public static long factorial(int n)
	{
		
		if(n == 0)
		{
			return 1;
		}
		return n * factorial(n-1);
		
	}
}
