package com.dsa_practise.collections.linear_search;

import java.util.Scanner;

public class CharInString {
    public static void main(String[] args) {
        String searchString = "saroj";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a target character to search:");
        char targetChar = s.next().charAt(0);

        System.out.println(findCharInString(targetChar, searchString));
    }

    private static boolean findCharInString(char targetChar, String searchString) {
        if (searchString.isEmpty()) {
            System.out.println("Empty string");
            return false;
        }

        int condition = searchString.length() - 1;
        //searching from last index
        while (true) {
            if (condition < 0) {
                System.out.println("target character is not present in the string!!");
                return false;
            }
            if (targetChar == searchString.charAt(condition)) {
                System.out.println("target character is present in the string!!");
                return true;
            }
            condition--;
        }

    }
}
