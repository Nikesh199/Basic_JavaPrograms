package com.simple.examples;

import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//String s1 = "Nikesh";
		System.out.println("Enter the String value : ");
		String s1 = sc.nextLine();
		String reverse = reversedString(s1);
		
		System.out.println("Original String: " + s1);
        System.out.println("Reversed String: " + reverse);
	}

	private static String reversedString(String s1) {
		// TODO Auto-generated method stub
		
		 String reversed = "";
	        int index = s1.length() - 1;
	        
	        while (index >= 0) {
	            reversed += s1.charAt(index);
	            index--;
	        }
	        
	        return reversed;
//		String reversed = "";
//		for(int i = s1.length() - 1; i >=0; i--)
//		{
//			reversed = reversed + s1.charAt(i);
//		}
//		return reversed;
	}

}
