package com.simple.examples;

import java.util.Scanner;

public class Palindrome {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String str = scanner.nextLine();

        System.out.println(str + " is palindrome: " + isPalindrome(str));

      //  scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
