package com.lab;

public class App {

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int number = 121;

        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is not a Palindrome");
        }
    }
}
