package com.dsa_practise.collections.rough;

import java.util.*;

import static com.dsa_practise.collections.rough.PalindromeString.checkPalindromeString;

public class PalindromicSubstring {
    public static void main(String[] args) {
        String value = "babad";

        findLargestPalindromicSubstring(value);

    }

    private static void findLargestPalindromicSubstring(String value) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < value.length(); i++) {
            result.add(String.valueOf(value.charAt(i)));
            for (int j = i + 1; j < value.length(); j++) {
                String newData = String.valueOf(result.get(j - 1) + value.charAt(j));
                result.add(newData);
            }
        }
        List<String> palindromeString = new ArrayList<>();

        for (String data : result) {
            if (checkPalindromeString(data)) {
                palindromeString.add(data);
            }
        }
        System.out.println(palindromeString);

        List<Integer>lengthOfPalindromeString = new ArrayList<>();

        for(String str : palindromeString) {
            lengthOfPalindromeString.add(str.length());
        }
        System.out.println(lengthOfPalindromeString);
        Collections.sort(lengthOfPalindromeString);
        System.out.println(lengthOfPalindromeString);

        for(String str : palindromeString) {
            if(str.length()==lengthOfPalindromeString.get(lengthOfPalindromeString.size()-1)) {
                System.out.println("the longest palindromic sustring is"+str);
                return;
            }
        }

    }

}
