package com.dsa_practise.collections.rough;

import static com.dsa_practise.collections.string.Palindrome.checkPalindrome;

public class PalindromeString {


    public static void main(String[] args) {
        String value="MADAMs";
        System.out.println(  checkPalindromeString(value));
    }

    static boolean checkPalindromeString(String value) {

        String lowercaseString=value.toLowerCase();
       int startIndex=0;
       int endIndex=value.length()-1;

       while (startIndex<=endIndex) {
            if(lowercaseString.charAt(startIndex)!=lowercaseString.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
       }
       return true;

    }
}
